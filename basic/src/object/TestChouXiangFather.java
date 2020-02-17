package object;

/**
 * 测试抽象类
 * 抽象类的意义：为子类提供统一的、规范的模板。子类必须实现相关的抽象方法
 *
 */
public abstract class TestChouXiangFather {

    // 第一：没有实现   第二：子类必须实现
    abstract public void shout();

    public void run(){
        System.out.println("111");
    }

    public static void main(String[] args) {
        // 不能用new的形式调用，可以new对应的子类
        //TestChouXiangFather testChouXiangFather = new TestChouXiangFather();

        TestChouXiangFather testChouXiangFather1 = new Child();
    }
}

class Child extends TestChouXiangFather{
    // 必须实现
    @Override
    public void shout() {

    }
}
