 public class Thread_Q7 implements Runnable {

    static int numThread = 1;
    static int threadIDAllowedToRun = 1;
    int myThreadID;
     static Object myLock = new Object();

    public Thread_Q7() {
        this.myThreadID = numThread++;
        System.out.println("Thread ID:" + myThreadID);
    }

    @Override
    public void run() {
        synchronized (myLock) {
            while (myThreadID != threadIDAllowedToRun) {
                try {
                    myLock.wait();
                } catch (InterruptedException e) {

                } catch (Exception e) {}
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println("myThreadID is running: " + myThreadID);
            myLock.notifyAll();
            threadIDAllowedToRun++;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Thread t1 = new Thread(new Thread_Q7());
        Thread t2 = new Thread(new Thread_Q7());
        Thread t3 = new Thread(new Thread_Q7());
     
        t1.start();
        t2.start();
        t3.start();

    }
}