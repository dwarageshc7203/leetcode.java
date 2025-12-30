interface A{
    public void show();
}

public class Exercise{
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("In show");
            }
        };

        obj. show();
    }
}