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
- logical
- bitwise
- assignment
- relational
