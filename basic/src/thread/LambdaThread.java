package thread;
/**
 * Lambda表达式 简化线程的使用
 */
public class LambdaThread{
    // 进化1：静态内部类(优点：用的时候再编译)
    static class Test implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 20; i++){
                System.out.println("一边听歌");
            }
        }
    }

    public static void main(String[] args) {
        // 进化2：局部内部类
        class Test2 implements Runnable{
            @Override
            public void run() {
                for (int i = 0; i < 20; i++){
                    System.out.println("一边听歌");
                }
            }
        }
        // 进化3：匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++){
                    System.out.println("一边听歌");
                }
            }
        }).start();

        // 进化4：JDK1.8 lambda
        new Thread(()->{
            for (int i = 0; i < 20; i++){
                System.out.println("一边听歌");
            }
        }).start();
    }


}
