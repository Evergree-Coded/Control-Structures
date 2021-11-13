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


### Logical Operators
A `logical operator` is one that returns a result

| Operator | Meaning      | Example |
| :---:    | :---:        | :--- |
| `!`      |  NOT         | if(!found) |
| `&&`     |  AND         | if(x > 3 && x < 10) |
| `||`     |  OR          | if(x > 2 `||` x < 2) |

`boolean found = true;`
`System.out.println(!found);`

Explanation 1: If it is NOT the case that `found` is true, the statement will print false.

`int x = 7;`
`if(x > 3 && x < 10);`
{
  System.out.println("true");
}

Explanation 2: If x is greater than 3 **and** x is less than 10, the statement inside the if statement will print "true".

`int x = 7;`
`if(x > 3 || x < 10);`
{
  System.out.println("true");
}

Explanation 3: If x is greater than 3 **or** x is less than 10, the statement inside the if statement will print "true".

---

## Conditional Statement Tasks
1. Given a number from the user, print out "negative" if the number is negative, positive if the number is positive, or zero otherwise.

2. Given an integer variable x, print out "middle" if x is greater than 0 and less than 10.

3. Given a string variable, letter, find out which letter in the string "abcde" that the variable belongs to.

