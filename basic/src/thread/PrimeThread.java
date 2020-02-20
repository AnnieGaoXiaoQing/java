package thread;

/**
 * Thread类
 */
public class PrimeThread extends Thread {
    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread();
        primeThread.start();
    }

    public void run(){
        System.out.println("thread");
    }

}
