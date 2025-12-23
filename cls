[33mcommit 8554f9b9e462067e2e491ee0a4bdacb9776b1752[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mmain[m[33m, [m[1;31morigin/main[m[33m, [m[1;31morigin/HEAD[m[33m)[m
Author: dwarageshc7203 <dwarageshc7203@gmail.com>
Date:   Tue Dec 23 16:38:31 2025 +0530

    Got some errors

[1mdiff --git a/Calculator.java b/Calculator.java[m
[1mindex 4891a2d..5cedb41 100644[m
[1m--- a/Calculator.java[m
[1m+++ b/Calculator.java[m
[36m@@ -1,118 +1,23 @@[m
[31m-import java.util.Scanner;[m
[31m-[m
[31m-public class Calculator {[m
[31m-    public static void main(String[] args){[m
[31m-        operations obj = new operations();[m
[31m-[m
[31m-        Scanner scanner = new Scanner(System.in);[m
[31m-[m
[31m-        System.out.println(obj.pen(20));[m
[31m-[m
[31m-        System.out.println("Enter first number: ");[m
[31m-        int number1 = scanner.nextInt();[m
[31m-[m
[31m-        System.out.println("Enter second number: ");[m
[31m-        int number2 = scanner.nextInt();[m
[31m-[m
[31m-        System.out.println("Enter the operator symbol(+ , -, *, %): ");[m
[31m-        char operator = scanner.next().charAt(0);[m
[31m-[m
[31m-[m
[31m-[m
[31m-        //operations[m
[31m-[m
[31m-        obj.process(number1, number2, operator);[m
[31m-        scanner.close();[m
[31m-    }[m
[32m+[m[32mpublic class Calculator{[m
[32m+[m[32m    Operation obj = new Operation();[m
[32m+[m[32m    obj.show();[m
[32m+[m[41m    [m
[32m+[m[41m    [m
 }[m
[31m-class operations{[m
[31m-    int result;[m
[31m-    int add(int num1, int num2){[m
[31m-        result = num1 + num2;[m
[31m-        return result;[m
[31m-    }[m
[31m-[m
[31m-    int sub(int num1, int num2){[m
[31m-        if(num1 < num2){[m
[31m-            System.out.println(num1 + " is less than "+num2);[m
[31m-        }[m
[31m-        else{[m
[31m-            result = num1 - num2;[m
[31m-        }[m
[31m-        return result;[m
[31m-    }[m
 [m
[31m-    int mul(int num1, int num2){[m
[31m-        result = num1 * num2;[m
[31m-        return result;[m
[31m-    }[m
[31m-[m
[31m-    int div(int num1, int num2){[m
[31m-        if(num1 < num2 && num2 == 0){[m
[31m-            System.out.println(num1 + " is less than "+num2+ " or "+num2 + " is 0");[m
[31m-        }[m
[31m-        else{[m
[31m-            result = num1 / num2;[m
[31m-        }[m
[31m-        return result;[m
[31m-    }[m
[31m-[m
[31m-     int mod(int num1, int num2){[m
[31m-        if(num1 < num2 && num2 == 0){[m
[31m-            System.out.println(num1 + " is less than "+num2 + " or "+num2 + " is 0");[m
[31m-        }[m
[31m-        else{[m
[31m-            result = num1 % num2;[m
[31m-        }[m
[31m-        return result;[m
[31m-    }[m
[31m-[m
[31m-    void process( int number1, int number2, char operator){[m
[31m-        switch (operator){[m
[31m-            case '+':[m
[31m-                System.out.println(add(number1, number2));[m
[31m-                break;[m
[31m-            [m
[31m-            case '-':[m
[31m-                System.out.println(sub(number1, number2));[m
[31m-                break;[m
[31m-[m
[31m-            case '*':[m
[31m-                System.out.println(mul(number1, number2));[m
[31m-                break;[m
[31m-[m
[31m-            case '/':[m
[31m-                System.out.println(div(number1, number2));[m
[31m-                break;[m
[31m-[m
[31m-            case '%':[m
[31m-                System.out.println(mod(number1, number2));[m
[31m-                break;[m
[31m-[m
[31m-            default:[m
[31m-                System.out.println("Enter the correct symbol: ");[m
[31m-                break;                [m
[31m-        }[m
[32m+[m[32mclass Operation{[m
[32m+[m[41m    [m
[32m+[m[32m    static int num;[m
[32m+[m[32m     static String name = "Casio";[m
[32m+[m[32m    static{[m
[32m+[m[32m        num = 10;[m
[32m+[m[32m        name = "Mechanical Calc";[m
[32m+[m[32m        System.out.println("Static is implemented");[m
     }[m
 [m
[31m-    public String pen(int cost){[m
[31m-        if( cost >= 10)[m
[31m-            return "Pen";[m
[31m-        System.out.println("Is it printing this one?");[m
[31m-        return "Nothing";[m
[32m+[m[32m    static void show(){[m
[32m+[m[32m        System.out.println("Show method");[m
[32m+[m[32m        System.out.println(num);[m
[32m+[m[32m        System.out.println(name);[m
     }[m
[31m-    [m
[31m-    //checking for method overloading[m
[31m-[m
[31m-    public int addTest(int a, int b){[m
[31m-            return 10;[m
[31m-        }[m
[31m-[m
[31m-    public int addTest(int a, int b, int c){   //perfectly valid[m
[31m-        int num1[] = new int[5];[m
[31m-        int[] num2 = new int[5000];[m
[31m-        return 20;[m
[31m-    } [m
[31m-[m
[31m-    [m
[31m-}[m
[32m+[m[32m}[m
\ No newline at end of file[m
