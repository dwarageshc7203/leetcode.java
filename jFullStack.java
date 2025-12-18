import java.util.Scanner;
public class jFullStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if( a > 0){
            System.out.println("Hello");
        }
        else if( a == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Hero");
        }
    }
}
