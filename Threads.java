//Threads : single unit of tasks.(concurrency)
        //-> java.lang.Thread(class) -> small projects
        //-> java.lang.Runnable(interface) -> large projects (decoupling, loose coupling)
     import java.lang.Thread;
    class myThreadClass extends Thread{
    public void run(){   //no change in name (existing method)
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread: " + i);
        }
    }
    }

        public class Threads {
    public static void main(String[] args) {
        myThreadClass t1 = new myThreadClass();
        t1.start();   //building method 
    }
}
