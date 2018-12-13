grammar jfk1;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
fragment DOT            : '.';
fragment FRACTION       : DOT [0-9]* '1'..'9';

List          : 'list' ;
Range         : 'range';
Reverse       : 'reverse';
Join          : 'join';
Add           : '+';
Multiply      : '*';
Power         : 'pow';
Sort          : 'sort';
Subtract      : '-';
Length        : 'length';
Total         : 'total';
Count         : 'count';
First         : 'first';
Last          : 'last';
Min           : 'min';
Max           : 'max';
IntegerDigits : 'integerDigits';
Take          : 'take';
Drop          : 'drop';
Position      : 'position';
None          : 'none';



IntPart       : '0'
              | [1-9]+ [0-9]*
              ;
PointFloat    : IntPart? FRACTION;
WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;


/*OBIEKTY PODSTAWOWE*/
number    : IntPart
          | PointFloat;

listBase     : '{' (number ',')* number '}'
          | '{}'
          ;
listT : listBase;

/*A)OPERACJE*/
operationsReturningList :
(
(op1ArgList=(
     /*Lista operacji z argumentem (listT)*/
     Reverse
     |IntegerDigits
     |Sort
     |List
/*------------------------------------*/
)('('extendedExpressionsReturningList')'))
|
(op2ArgListNumber=(
/*Lista operacji z argumentami (listT,number)*/
Take
|Drop
|Power
/*------------------------------------*/
)('('extendedExpressionsReturningList ',' extendedExpressionsReturningNumber ')'))
|
(op2ArgListList=(
/*Lista operacji z argumentami (listT,listT)*/
Join
|Add
|Subtract
|Multiply
/*------------------------------------*/
)('('extendedExpressionsReturningList ',' extendedExpressionsReturningList ')'))
|
)
;

operationsReturningNumber :
(
(op1ArgList=(
/*Lista operacji z argumentem (listT)*/
Length
|Total
|First
|Last
|Min
|Max
/*------------------------------------*/
)('('extendedExpressionsReturningList')'))
|
(op2ArgListNumber=(
/*Lista operacji z argumentami (listT,number)*/
Count
|Position
/*------------------------------------*/
)('('extendedExpressionsReturningList ',' extendedExpressionsReturningNumber ')'))
|
(op3ArgListList=(
/*Lista operacji z argumentami (listT,listT)*/
None
|None
/*------------------------------------*/
)('('extendedExpressionsReturningList ',' extendedExpressionsReturningList ')'))
);

/*B)WYRAZENIA (w podziale na typ zwracanego el.)*/
/*1)Zwracane listT*/
/*------------------------------------*/
basicExpressionsReturningList :
(
listT
|operationsReturningList
);

/*Rozszerza basicExpressionsReturningList*/
extendedExpressionsReturningList :
(
basicExpressionsReturningList
| (( basicExpressionsReturningList (Add|Subtract|Multiply))+ (extendedExpressionsReturningNumber))
);
/*------------------------------------*/

/*2)Zwracane number*/
/*------------------------------------*/
basicExpressionsReturningNumber :
(
number
|operationsReturningNumber
);

/*Rozszerza basicExpressionsReturningNumber*/
extendedExpressionsReturningNumber :
(
basicExpressionsReturningNumber
| ((basicExpressionsReturningNumber (Add|Subtract|Multiply))+ basicExpressionsReturningNumber)
);
/*------------------------------------*/

/*C)CALY ZBIOR WYRAZEN*/
expression:(
extendedExpressionsReturningList
|
extendedExpressionsReturningNumber
)
;