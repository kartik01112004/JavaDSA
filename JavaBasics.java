import java.util.Scanner;

public class JavaBasics{
    public static void main(String args[]) {
        // System.out.println("Hello world");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // printing a pattern with print function

        int a = 30;
        int b = 20;
        // String name ="kartik";
        // System.out.println(b);
        // System.out.println(a);
        // System.out.println(name);
        // a = 55;
        // System.out.println(a);

        // datatypes
        // byte c = 8;
        // System.out.println(c);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = true;
        // float f = 10.4f;
        // long l = 45778415678014l;
        //double
        //short

        // adding 2 numbers
        // int a1 = 10;
        // int b1 = 5;
        // int sum = a1 + b1;
        // System.out.println(sum);

        // Sum of 2 numbers by user input

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sum = a+b;
        // System.out.println(sum);

        // int m1 = sc.nextInt();
        // int m2 = sc.nextInt();
        // int mul = m1*m2;
        // System.out.println(mul);

        // Area of circle
        // double pi = 3.14;
        // double r = sc.nextDouble();
        // double area = 3.14*r*r;
        // System.out.println(area);

        //  Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of these 3 numbers.

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // int avg = (A+B+C)/3;
        // System.out.println(avg);

        // Question 2: In a program, input the side of a square. You have to output the area of the square

        // float side = sc.nextFloat();
        // float area = side*side;
        // System.out.println(area);

        /*  Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float amt = pencil+pen+eraser;
        // float total = amt + (amt*18/100);
        // System.out.println(total);

        System.out.println("add = " + (a+b));
        System.out.println("sub = " + (a-b));
        System.out.println("mul = " + (a*b));
        System.out.println("div = " + (a/b));
        System.out.println("remainder = " + (a%b));

        // Conditional if else
        int age =52;
        if(age>=18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote");
        }

        // largest of 2 numbers

        int v = 13;
        int v1 = 45;

        if(v>v1){
            System.out.println(v +" is greater");
        } 
        if(v==v1){
            System.out.println(v +" is equal to "+v1);
        }
        else{
            System.out.println(v1 +" is greater");
        }

        // Odd Even

        int num = 21;

        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

        // income tax calculator

        // int income = sc.nextInt();

        // float tax; // automaticaly 0

        // if(income<500000){
        //     tax = 0;
        //     System.out.println("No tax");
        //     }else if(income>500000 && income<1000000){
        //         tax = (income)*0.2f;
        //         System.out.println("Tax is 20% payable amount is:"+tax);
        // }else{
        //     tax = (income)*0.3f;
        //     System.out.println("Tax is 30% payable amount is:  "+tax);
        // }

        // largest of 3

        int c = 12;
        int c1 = 45;
        int c2 = 67;
        
        if(c>c1 && c>c2){
            System.out.println(c);

        } else if(c1>c2){
            System.out.println(c1);
        }else{
            System.out.println(c2);
        }

        int number =4;

        String type = ((number%2) == 0) ? "Even" :"odd"; 
        System.out.println(type);

        // Student pass or fail?

        int marks = 45;

        String status = marks>=33 ? "pass" : "fail";

        System.out.println(status);


        int number1 = 2;

        switch(number1){
            case 1 -> System.out.println("burger");
            case 2 -> System.out.println("pizza");
            case 3 -> System.out.println("momos");
            default -> System.out.println("We woke up");
        }

        // Calculator

        // System.out.println("Enter A");
        // int a1 = sc.nextInt();
        // System.out.println("Enter B");
        // int b1 = sc.nextInt();
        // System.out.println("Enter Operator");
        // char operator = sc.next().charAt(0);

        // switch(operator){
        //     case '+' -> System.out.println(a1+b1);
        //     case '-' -> System.out.println(a1-b1);
        //     case '*' -> System.out.println(a1*b1);
        //     case '/' -> System.out.println(a1/b1);
        //     case '%' -> System.out.println(a1%b1);
        //     default -> System.out.println("wrong operator");
        // }

        //  Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is positive or negative.

        // int userInp = sc.nextInt();
        // if(userInp>=0){
        //     System.out.println(userInp+" is positive");
        // }else{
        //     System.out.println(userInp + " is negative");
        // }

        //  Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

        double temp = 103.5;

        if(temp>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You dont have fever");
        }

        // System.out.println("enter day of week in number");
        // int week = sc.nextInt();

        // switch(week){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        //  leap or no

        // my solution
        int year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("not leap year");
                }
            }else{
                System.out.println("leap year");
            }
        }else{
            System.out.println("not leap year");
        }

        // mam solution

        System.out.print("Input the year: ");
        // int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leap year");
        }


    }
}