public class ThreadSleepExample {
    public static void main(String[] args) {
        // First Thread
        Thread firsThread = new Thread( () -> {
            try{
                for ( int i = 1; i <=3; i++)
                {
                    System.out.println("First Thread -Count: " + i);
                    Thread.sleep(500); //Sleep for 500 milliseconds
                }
            } catch (Exception e ){
                e.printStackTrace();
            }
        });

        //Second Thread 
        Thread secondThread = new Thread( () -> {
            try{
                for ( int i = 1; i <=3; i++)
                {
                    System.out.println("Second Thread -Count: " + i);
                    Thread.sleep(1000); //Sleep for 1000 milliseconds
                }
            } catch (Exception e ){
                e.printStackTrace();
            }
        });

        //Start all threads
        firsThread.start();
        secondThread.start();
    }
}
