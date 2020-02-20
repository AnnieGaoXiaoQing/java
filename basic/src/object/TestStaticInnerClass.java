package object;

/**
 * 测试静态内部类
 */
public class TestStaticInnerClass {

    public static void main(String[] args) {
        // 直接外部类.方法
        Outer2.Inner2 inner2 = new Outer2.Inner2();

    }
}

class Outer2{

    static class Inner2{

    }

}