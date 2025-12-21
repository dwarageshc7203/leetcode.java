import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        operations obj = new operations();

        Scanner scanner = new Scanner(System.in);

        System.out.println(obj.pen(20));

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the operator symbol(+ , -, *, %): ");
        char operator = scanner.next().charAt(0);



        //operations

        obj.process(number1, number2, operator);
        scanner.close();
    }
}
class operations{
    int result;
    int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }

    int sub(int num1, int num2){
        if(num1 < num2){
            System.out.println(num1 + " is less than "+num2);
        }
        else{
            result = num1 - num2;
        }
        return result;
    }

    int mul(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    int div(int num1, int num2){
        if(num1 < num2 && num2 == 0){
            System.out.println(num1 + " is less than "+num2+ " or "+num2 + " is 0");
        }
        else{
            result = num1 / num2;
        }
        return result;
    }

     int mod(int num1, int num2){
        if(num1 < num2 && num2 == 0){
            System.out.println(num1 + " is less than "+num2 + " or "+num2 + " is 0");
        }
        else{
            result = num1 % num2;
        }
        return result;
    }

    void process( int number1, int number2, char operator){
        switch (operator){
            case '+':
                System.out.println(add(number1, number2));
                break;
            
            case '-':
                System.out.println(sub(number1, number2));
                break;

            case '*':
                System.out.println(mul(number1, number2));
                break;

            case '/':
                System.out.println(div(number1, number2));
                break;

            case '%':
                System.out.println(mod(number1, number2));
                break;

            default:
                System.out.println("Enter the correct symbol: ");
                break;                
        }
    }

    public String pen(int cost){
        if( cost >= 10)
            return "Pen";
        System.out.println("Is it printing this one?");
        return "Nothing";
    }
    
    //checking for method overloading

    public int addTest(int a, int b){
            return 10;
        }

    public int addTest(int a, int b, int c){   //perfectly valid
        int num1[] = new int[5];
        int[] num2 = new int[5000];
        return 20;
    } 

    
}
