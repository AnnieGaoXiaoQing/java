package object;

public class TestSuper {

    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象");
        new  ChildClass2();
    }

}
class FatherClass2{
    public FatherClass2(){
        super(); // 默认调用父类Object的super()，写不写都会调
        System.out.println("创建FatherClass");
    }
}

class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super(); // 调用父类的super()，写不写都会调
        System.out.println("创建ChildClass2");
    }

}