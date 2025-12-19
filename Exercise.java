public class Exercise {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for(int i = 1; i<= 5; i++){
            System.out.print(" "+i);
        }
        int j = 1;
        System.out.println("");
        System.out.print("While Loop:");
        while(j<= 5){
            System.out.print(" "+j);
            j++;
        }
        int k = 1;
         System.out.println("");
        System.out.print("Do-While Loop:");
        do{
            System.out.print(" "+k);
            k++;
        }
        while(k <= 5);
    }
}
