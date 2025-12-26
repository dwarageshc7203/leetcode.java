public class Exercise{
    public static void main(String[] args){

        //final keyword used now;

        //upcasting

        A obj = new B();
        obj.showA(); //only allows showA() since it's of type A

        /* 
        B obj = new A(); //doesn't work because A has no idea about B
         */

        //downcasting

        B obj1 = (B) obj;
        obj1.showB();
    }
}

class A
{
    public void showA(){
        System.out.println("In A");
    }
}

class B extends A
{
    public void showB(){
        System.out.println("In B");
    }
}