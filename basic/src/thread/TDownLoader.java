package thread;

public class TDownLoader extends Thread{
    private String url;

    public TDownLoader(String url){
        this.url = url;
    }

    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.download(url);
        System.out.println(url);    // 不会按顺序执行
    }

    public static void main(String[] args) {
        TDownLoader tDownLoader1 = new TDownLoader("url1");
        TDownLoader tDownLoader2 = new TDownLoader("url2");
        TDownLoader tDownLoader3 = new TDownLoader("url3");

        // 不会按顺序执行
        tDownLoader1.start();
        tDownLoader2.start();
        tDownLoader3.start();

    }
}
