# Java

## Class

## Function

## Main function?

```java
public static void main(String args[]) {}
```

## How to take output?

`System.out.print("");` prints in same line
`System.out.println("");` prints in new line

### Semicolons

Its mendatory to end a line of java code with a ";"

### javac?

its a statement to compile a java file.

## Variables and Literals

variables are changeable same as in maths

literals are like 1,2,3,4,@,#,$ and so on something that has a defined value

_define a variable_ : `int a = 10;`

a is a variable where as 10 is a literal

a variable is a store of memory each type of variable has a particular bit of value in memory and any data it stores is saved in that space in memmory

all these memory blocks have a address in memory

## Data types and there size

1. primitive
   - byte : 1byte [-128 to 127]
   - short : 2 bytes
   - char : 2 bytes
   - boolean : 1 bytes
   - int : 4 bytes
   - long : 8 bytes
   - float : 4 bytes
   - double : 8 bytes
2. non-premitive
   - String
   - array
   - class
   - object
   - interface

### Commnets in java

we use // this for single line comment and /\* \*/ for multi line commnets

## Input in java

User input is must for program so in order to take input from user we have a library called Scanner. We use this class make its object and can take differnt types of inputs like

- next : stores upto 1st space
- nextLine : stores everything until next line
- nextInt : integer as input
- nextDouble : double as input
- nextFloat : float as input
- nextLong : long as input
- nextByte : takes bytes as input
- nextShort : takes short as input
- nextBoolean : takes boolean as input

making an object : `Scanner sc = new Scanner(System.in);`
taking input : `String input = sc.next();`

## Type conversion

we can convert a variable with smaller data type to a larger one and compatible one its possible how ever if we try opposite it throws an error as its a lossy conversion

possible conversions :
byte -> short -> int -> float -> long -> double

## Type casting

Java doesnt allow this as we cast lager data into a smaller data type because we may loss some data

its called narrowing or explicit conversion
eg

```java
float a = 52.964;
int b = (int)a;
// returns 52
```

if we try to type convert a char to a number it returns ASCII value

## Type Promotion in expressions

1. java promotes byte, short, char to int when evaluating an expression
2. if any operand is long, float, double then it will promote whole to the biggest of them all either long, double or float

## Operators in java

symbols that tell compiler to perform some operation

it consists of 2 things

- operands
- operator

we have 5 types of operators

- arithimatic (Binary/Unary) :

  - Binary :
    - +, -, \*, /, %
  - Unary :

    - ++, --
      post and pre increment/decrement
      ++a : increase first use after that
      a++ : increase after use

      ```java
      int a = 10;

      int b = ++a;
      System.out.println(a); // 11
      System.out.println(b); // 11

      int c = a++;
      System.out.println(a); // 12
      System.out.println(c); // 11

      int d = --a;
      System.out.println(a); // 11
      System.out.println(d); // 11

      int e = a--;
      System.out.println(a); // 10
      System.out.println(e); // 11
      ```

- Relational

  - == : check if LHS equal to RHS
  - != : Not equal to
  - > : greater than
  - < : smaller than
  - > = : greater than or equl to
  - <= : smaller than or equal to

Retuns true ot false

- Logical

  - && : and

    ```java
    System.out.println((3>2) && (5>0)); // true
    System.out.println((3>2) && (5<0)); // false
    ```

    both needs to be true for true

  - || : or

    ```java
    System.out.println((3>2) || (5>0)); // true
    System.out.println((3>2) || (5<0)); // true
    System.out.println((3<2) || (5>0)); // true
    System.out.println((3<2) || (5<0)); // false
    ```

    atleast one needs to be true for true

  - ! : not

    ```java
    System.out.println(!(3>2)); // false
    System.out.println(!(3<2)); // true
    ```

    changes true to false

- bitwise
- assignment

  - =
  - +=
  - -=
  - \*=
  - /=

## Conditional statemets

Conditions that return true or false and some code executes
if/else ya toh ye ya toh voh

```java
if(condition){
  //code to be executed if condition is true
}
else{
  //code to be executed if condition is false
}
```

difference in `if else` and `else if`

```java
if(condition1){}
//  this is one block
if(condition2){} // it will run irrespective of 1st if is true or false
else{}

if(condition1){}
else if(condition2){}
else if(condition3){}
else{}
// now the 2nd or further ifs will only execute if previous on is false

```

## Ternary operator

`variable = condition?statemnet1 : statement2;`

check condition if true execute statement1 else execute statement2

to store the value it generates we use variable at left sode with assinment operator

## Switch Statement

its a kind of condition statements which check case and execute a statement coresponding to that case

lets say we wanna eat something

there are 3 buttons burger, pizza, momos
we have to select one then we can use switch
to select one of the 3 making these 3 possible cases

```java
switch(variable){
  case 1 :

  case 2 :

  case 3 :
}
```
