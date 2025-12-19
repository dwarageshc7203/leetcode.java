public class jFullStack {
    public static void main(String[] args) {
        for( int i = 1; i<= 5; i++){
            System.out.println("Day "+i);
            for ( int j= 9; j<= 20; j++){
                System.out.println(String.format("Time: %d hours", j)   );
            }
        }
    }
}
