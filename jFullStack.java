import java.util.Scanner;
public class jFullStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        boolean result = a%2 == 0 ? true : false;
        System.out.println(result);
    }
}
