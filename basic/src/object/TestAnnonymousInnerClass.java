package object;

/**
 * 匿名内部类
 */
public class TestAnnonymousInnerClass {

    public static void test01(AA a){
        System.out.println("#######################");
        a.aa();
    }

    public static void main(String[] args) {
        // AA是接口，
        // 使用方式1：写一个类实现AA
        // 使用方式2：写匿名内部类，默认实现AA
        TestAnnonymousInnerClass.test01(new AA() {
            @Override
            public void aa() {
                System.out.println("TestAnnonymousInnerClass.new AA(){}.aa()");
            }
        });
    }
}

interface AA{
    void aa();
}