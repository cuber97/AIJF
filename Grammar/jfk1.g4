grammar Jfk1;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
fragment DOT            : '.';
fragment FRACTION       : DOT [0-9]* '0'..'9';

List          : 'list' ;
Range         : 'range';
Reverse       : 'reverse';
Join          : 'join';
Add           : 'add';
Multiply      : 'mult';
Power         : 'pow';
Sort          : 'sort';
Substract      : 'sub';
Length        : 'length';
Total         : 'total';
Count         : 'count';
First         : 'first';
Last          : 'last';
Min           : 'min';
Max           : 'max';
Take          : 'take';
Drop          : 'drop';
Position      : 'position';



IntPart       : '0'
              | [1-9]+ [0-9]*
              ;
PointFloat    : IntPart? FRACTION;
WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;


/*OBIEKTY PODSTAWOWE*/
pNumber    : IntPart
          | PointFloat;

mNumber    : '-'pNumber;

number: pNumber | mNumber;


listT     : '{' (number ',')* number '}'
          | '{}'
          ;

/*A)OPERACJE*/
operationsReturningList :
(
(op1ArgList=(
     /*Lista operacji z argumentem (listT)*/
     Reverse
     |Sort
     |List
/*------------------------------------*/
)('('expressionsReturningList')'))
|
(op2ArgListNumber=(
/*Lista operacji z argumentami (listT,number)*/
Take
|Drop
|Power
|Add
|Substract
|Multiply
/*------------------------------------*/
)('('expressionsReturningList ',' expressionsReturningNumber ')'))
|
(op2ArgListList=(
/*Lista operacji z argumentami (listT,listT)*/
Join
|Add
|Substract
|Multiply
/*------------------------------------*/
)('('expressionsReturningList ',' expressionsReturningList ')'))
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
)('('expressionsReturningList')'))
|
(op2ArgListNumber=(
/*Lista operacji z argumentami (listT,number)*/
Count
|Position
/*------------------------------------*/
)('('expressionsReturningList ',' expressionsReturningNumber ')'))
);

/*B)WYRAZENIA (w podziale na typ zwracanego el.)*/
/*1)Zwracane listT*/
/*------------------------------------*/
expressionsReturningList :
(
listT
|operationsReturningList
);


/*2)Zwracane number*/
/*------------------------------------*/
expressionsReturningNumber :
(
number
|operationsReturningNumber
);

/*C)CALY ZBIOR WYRAZEN*/
expression:(
expressionsReturningList
|
expressionsReturningNumber
)
;