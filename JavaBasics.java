
public class JavaBasics {

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int calculateSum(int a, int b) {// parameters or formal parameters

        int sum = a + b;
        return sum;
    }

    // Swap values
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            // System.out.println(res); // this is how you van test your code
            res *= i;
        }
        return res;
    }

    // binomial cofficient

    /* n
     *  C  = n!/(r! (n-r)!)
     *   r
     */
    public static int binomialCoff(int n, int r) {
        int bc = 1;
        int n_fac = factorial(n);
        int n_r_fac = factorial(n - r);
        int r_fac = factorial(r);

        bc = n_fac / (r_fac * n_r_fac);

        return bc;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return (float) (a + b);
    }

    public static boolean isPrime(int num) {
        // boolean isPrime = true;
        if (num == 2) {
        } else {
            for (int i = 2; i <= Math.sqrt(num) /*num / 2*/; i++) {
                if (num % i == 0) {
                    return false;
                    // isPrime = false;
                    // break;
                }
            }
        }
        // return isPrime;
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // float af = sc.nextFloat();
        // float bf = sc.nextFloat();
        // printHelloWorld();
        // int sum = calculateSum(a, b); // arguments or actual parameters

        // System.out.println("Sum is :" + sum);
        // swap(a, b);
        // System.out.println(multiply(a, b));
        // System.out.println(factorial(5));
        // System.out.println(binomialCoff(a, b));
        // sum(af, bf);
        System.out.println(isPrime(43));
        primesInRange(100);
        // System.out.println("Hello world");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // printing a pattern with print function
        // int a = 30;
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
        // Scanner sc = new Scanner(System.in);
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
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */ // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float amt = pencil+pen+eraser;
        // float total = amt + (amt*18/100);
        // System.out.println(total);
        // System.out.println("add = " + (a+b));
        // System.out.println("sub = " + (a-b));
        // System.out.println("mul = " + (a*b));
        // System.out.println("div = " + (a/b));
        // System.out.println("remainder = " + (a%b));
        // // Conditional if else
        // int age =52;
        // if(age>=18){
        //     System.out.println("You are eligible to vote");
        // } else{
        //     System.out.println("You are not eligible to vote");
        // }
        // // largest of 2 numbers
        // int v = 13;
        // int v1 = 45;
        // if(v>v1){
        //     System.out.println(v +" is greater");
        // } 
        // if(v==v1){
        //     System.out.println(v +" is equal to "+v1);
        // }
        // else{
        //     System.out.println(v1 +" is greater");
        // }
        // // Odd Even
        // int num = 21;
        // if(num%2==0){
        //     System.out.println("Number is even");
        // }else{
        //     System.out.println("Number is odd");
        // }
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
        // int c = 12;
        // int c1 = 45;
        // int c2 = 67;
        // if(c>c1 && c>c2){
        //     System.out.println(c);
        // } else if(c1>c2){
        //     System.out.println(c1);
        // }else{
        //     System.out.println(c2);
        // }
        // int number =4;
        // String type = ((number%2) == 0) ? "Even" :"odd"; 
        // System.out.println(type);
        // Student pass or fail?
        // int marks = 45;
        // String status = marks>=33 ? "pass" : "fail";
        // System.out.println(status);
        // int number1 = 2;
        // switch(number1){
        //     case 1 -> System.out.println("burger");
        //     case 2 -> System.out.println("pizza");
        //     case 3 -> System.out.println("momos");
        //     default -> System.out.println("We woke up");
        // }
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
        // double temp = 103.5;
        // if(temp>100){
        //     System.out.println("You have fever");
        // }else{
        //     System.out.println("You dont have fever");
        // }
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
        // int year = sc.nextInt();
        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("leap year");
        //         }else{
        //             System.out.println("not leap year");
        //         }
        //     }else{
        //         System.out.println("leap year");
        //     }
        // }else{
        //     System.out.println("not leap year");
        // }
        // // mam solution
        // System.out.print("Input the year: ");
        // // int year = sc.nextInt();
        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z = ((year % 100 == 0) && (year % 400 == 0));
        // if (x && (y || z)) {
        // System.out.println(year + " is a leap year");
        // } else {
        // System.out.println(year + " is not a leap year");
        // }
        // Loops
        // int counter = 1;
        // System.out.println("enter end number");
        // int range = sc.nextInt();
        // while(counter<=range){
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // Sum of first n natural numbers
        // System.out.print("\nSum of all these numbers is :");
        // counter = 0;
        // int sum = 0;
        // while(counter<=range){
        //     sum +=  counter;
        //     counter++;
        // }
        // System.out.println(sum);
        // For loop
        // for(int i = 1; i<=range;i++ ){
        //     System.out.print("Hello world ");
        // }
        // printing Square pattern
        // int lines = sc.nextInt();
        // for( int i=1; i<=lines;i++){
        //     for(int j=1;j<=lines;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // Reverse a number
        // if we divide any number by 10 we get the last degit
        // int n = 254871;
        // int reverse=0;
        // while(n>0){
        //     int lastDigit = n%10;
        //     reverse = reverse*10 + lastDigit;
        //     n/=10;
        // }
        // System.out.print(reverse);
        // Do while loop
        // int counter = 1;
        // do { 
        //     System.out.println("Hello world");
        //     counter++;
        // } while (counter <=10);
        // for(int i = 1; i<=5;i++){
        //     System.out.println(i);
        //     if(i==3){
        //         break;
        //     }
        // }
        // System.out.println("out of loop");
        // keep entering numbers till user enters a multiple of 10
        // do{
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();
        //     if(n%10 ==0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while (true);
        // for(int i =1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // Display all numbers except multiple of 10
        // do{
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();
        //     if(n%10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);
        // }while (true);
        // Prime numbers
        //     int n = sc.nextInt();
        //     if(n==2){System.out.println("Prime number");}
        //     else{boolean isPrime = true;
        //     for(int i = 2; i<=Math.sqrt(n) ; i++){
        //         if(n%i==0){
        //             isPrime = false;
        //         }
        //     }
        //     if(isPrime){
        //         System.out.println("Prime number");
        //     }else{
        //         System.out.println("Not a prime number");
        //     }
        // }
        // LOOPS QUESTIONS
        //  Question2: Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe even and odd integers.
        // int num = sc.nextInt();
        // int even = 0;
        // int odd = 0;
        // int temp = num;
        // while (temp > 0) {
        //     int rem = temp % 10;
        //     if (rem % 2 == 0) {
        //         even += rem;
        //     } else {
        //         odd += rem;
        //     }
        //     temp /= 10;
        // }
        // System.out.println("Input number was : " + num);
        // System.out.println("sum of even numbers in that number is : " + even);
        // System.out.println("sum of odd numbers in that number is : " + odd);
        //  Question 3 :Write a program to find the factorialof any number entered by the user.
        // int num = sc.nextInt();
        // long fact = 1;
        // for (int i = 1; i <= num; i++) {
        //     fact *= i;
        // }
        // System.out.println("Factorial of " + num + " is " + fact);
        // int num = sc.nextInt();
        // int mul;
        // for (int i = 1; i <= 10; i++) {
        //     mul = num * i;
        //     System.out.println(num + " X " + i + " = " + mul);
        // }
    }
}
