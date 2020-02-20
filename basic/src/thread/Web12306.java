package thread;

/**
 * 共享资源，但同时存在并发问题
 */
public class Web12306 implements Runnable {

    private int tricketNums = 99;

    @Override
    public void run() {
        while (true){
            if (tricketNums < 0){
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->"  + tricketNums--);
        }
    }

    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        System.out.println(Thread.currentThread().getName());

        // 多个代理
        new Thread(web12306, "码农").start();
        new Thread(web12306, "马畜").start();
        new Thread(web12306,"蚂蟥").start();
    }
}
