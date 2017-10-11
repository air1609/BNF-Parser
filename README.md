# BNF-Parser

### BNF
<expression>  ::=  <term> + <expression>  |  <term> - <expression>  |  <term>
<term>  ::=  <factor> * <term>  |  <factor> / <term>  |  <factor>
<factor>  ::=  <digit>  |  (  <expression>  )
<digit>  ::=   0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

### Input: Expression adhering to this BNF
ex. (1+2)*7 ..

### Output: Result of the BNF evaluation
ex. (1+2)*7 = 21
