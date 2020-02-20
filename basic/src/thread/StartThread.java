package thread;

/**
 * 测试Start
 */
public class StartThread extends Thread {

    public static void main(String[] args) {
        StartThread startThread = new StartThread();
        startThread.start(); // 开启线程,start() 本地方法JNI,不保证立即运行
        //startThread.run();  // 普通方法调用，按顺序执行

        for (int i = 0; i < 20; i++){
            System.out.println("一起coding");
        }
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++){
            System.out.println("一起听歌");
        }
    }
}
