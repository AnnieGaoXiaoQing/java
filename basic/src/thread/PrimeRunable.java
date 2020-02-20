package thread;

/**
 * 创建线程方式二：
 * 1、创建：实现Runnalbe + 重写run
 * 2、启动：创建实现类对象 + Thread对象 + start
 * 3、runable 不可以返回值
 */
public class PrimeRunable implements Runnable{

    public static void main(String[] args) {
        // 方式一：
        // runnable 没有start方法，不具备跟CPU打交道，必须借助Thread
        PrimeRunable primeRunable = new PrimeRunable();   //真实对象
        // 代理对象
        Thread thread = new Thread(primeRunable);
        thread.start();

        // 方式二：对象仅使用一次，可以使用匿名对象替代
        new Thread(new PrimeRunable()).start();
    }

    @Override
    public void run() {
        System.out.println("Runable");
    }
}
