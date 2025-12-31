public class Exercise{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        System.out.println("Initial i: " + i);
        System.out.println("Initial j: " + j);

        try
        {
            j = 18 / i;
        }
        catch(Exception e)
        {
            System.out.println("Problem with the value of i ( " + i + " )");
        }

        System.out.println("Final value of i: " + i);
        System.out.println("Final value of j: " + j);
    }
} 