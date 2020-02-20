package thread;

/**
 * 接口:
 * 1、真实角色
 * 2、代理角色
 */
public class StaticProxy {

    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();

        // new Thread(线程对象).start();
    }
}

interface Marry{
   void happyMarry();
}
// 真实角色
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("you and 嫦娥终于奔月了");
    }
}

class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    public void ready(){
        System.out.println("ready");
    }

    public void after(){
        System.out.println("after");
    }
}


