grammar PolishNotation;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
fragment DOT            : '.';
fragment FRACTION       : DOT [0-9]* '1'..'9';

Add           : '+';
Subtract      : '-';
Multiply      : '*';
Divide        : '/';
Colon         : ':' -> type(Divide);
Power         : '^';
DoubleMultiply: '**' -> type(Power);
Max           : 'max';
Min           : 'min';
IntPart       : '0'
              | [1-9]+ [0-9]*
              ;
PointFloat    : IntPart? FRACTION;
WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

number    : IntPart
          | PointFloat
          ;
operation : op=( Add
               | Subtract
               | Multiply
               | Divide
               | Power
               | Max
               | Min )
               ( number | operation ) ( number | operation )
          | '(' operation ')'
          ;
expression: operation
          | number
          ;