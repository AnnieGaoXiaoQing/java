package thread;

import java.util.concurrent.*;

/**
 * Callable接口有返回值
 */
public class CDownloader implements Callable<Boolean> {


    private String url;

    public CDownloader(String url){
        this.url = url;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.download(url);
        System.out.println(url);    // 不会按顺序执行
        return true;
    }

    public static void main(String[] args) {
        CDownloader cDownloader1 = new CDownloader("url1");
        CDownloader cDownloader2 = new CDownloader("url2");
        CDownloader cDownloader3 = new CDownloader("url3");

        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 执行服务
        Future<Boolean> booleanFuture1 = executorService.submit(cDownloader1);
        Future<Boolean> booleanFuture2 = executorService.submit(cDownloader2);
        Future<Boolean> booleanFuture3 = executorService.submit(cDownloader3);
        // 获取结果
        try {
            boolean r1 = booleanFuture1.get();
            boolean r2 = booleanFuture2.get();
            boolean r3 = booleanFuture3.get();

            System.out.println(r3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // 关闭服务
        executorService.shutdown();
    }
}
