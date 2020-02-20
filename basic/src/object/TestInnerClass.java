package object;

/**
 * 测试非静态内部类
 */
public class TestInnerClass {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer{
    private int age = 10;

    public void  testOuter(){
        System.out.println("测试Outer");
    }

    /**
     * 提供了一个良好的封装，Inner可以用Outer，Outer不可以用Inner
     */
    class Inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("外部类成员变量age:" + Outer.this.age);
            System.out.println("内部类成员变量age：" + this.age);
            System.out.println("局部变量age：" + age);
        }
    }
}