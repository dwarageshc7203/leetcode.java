public class Exercise {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 
        double result = 0;
        
        while( again == "y"){
        
        if( operator == '+'){
            result = num1 + num2;
            again = "n";
        }
        else if( operator == '-'){
            result = num1 - num2;
            again = "n";
        }
        
        else if( operator == '*'){
            result = num1 * num2;
            again = "n";
        }
        
        else if( operator == '/'){
            if( num2 > 0){            }
            result = num1 / num2;
            again = "n";
        }
        
        
        else{
            System.out.println("Wrong operator");
        }
        
        System.out.println("Result: " +result);
        System.out.println("Thank you for using the calculator.");
    }

        
    }
}
