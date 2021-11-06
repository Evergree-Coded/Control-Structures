# Control Structures

Control Structures are the mechanism by which you make the statements of a program run in a nonsequential order.

### Two types of control structures:
- Decision-Making (Conditional Statements)
- Iteration

## Decision-Making Control Structures

### The if statement
`if (boolean expression){statements}`

The statement inside the curly braces will be executed only if the boolean expression is true. Otherwise, the control passes over this statement.

### The if... else statement
`if (boolean expression){statements}`
`else{statements}`

In this statement, if the boolean expression is true, only the statement(s) inside the curly braces will be executed. If the boolean expression is false, the statements after the else statement will be executed.

### Extended if statement
`if (boolean expression){statements}`

`else if (boolean expression){statements}`

`else if (boolean expression){statements}`

`else {statements}`

In this statement, the control will start at the first if statement and go to the statements in the {} if the boolean expression is true. If the boolean expression is not true, the control will move to the next boolean statement and repeat the process until there are no more boolean statements. If none of the boolean statements are true, the control will go into the statement in the else conditional statement.

### Relational Operators
Relational operators are used in boolean expressions that evaluate to true or false.

| Operator | Meaning | Example |
| :---: | :---: | :--- |
| ==    |  equal to                 | if(x == 3) |
| !=    |  not equal to             | if(x != 3) |
| >     |  greater than             | if(x > 3 ) |
| <     |  less than                | if(x < 3)  |
| >=    |  greater than or equal to | if(x >= 3) |
| <=    |  less than or equal to    | if(x <= 3) |


