// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable{
    public void run(){
        for ( int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}
public class Exercise {
    public static void main(String[] args) {
        // TODO: Create a single PrinterTask object
        PrinterTask task = new PrinterTask();

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");


        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        
        t1.start();
        t2.start();

        // TODO: Start both threads

        // TODO: Use join() to wait for both threads to finish
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
