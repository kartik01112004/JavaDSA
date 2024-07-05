import java.util.Scanner;

public class JavaBasics{
    public static void main(String args[]) {
        // System.out.println("Hello world");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // printing a pattern with print function

        // int a = 10;
        // int b = 20;
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

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int mul = m1*m2;
        System.out.println(mul);

        // Area of circle
        // double pi = 3.14;
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println(area);

    }
}