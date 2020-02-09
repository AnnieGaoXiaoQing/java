package object;

/**
 * 测试静态初始化块
 * 作用：类初始化时加载
 */
public class TestStaticBlock {

    int id;
    String name;

    static String companyName;

    static {
        System.out.println("执行类的初始化工作");
        companyName = "北京尚学堂";
        pintCompany();
    }

    public static void pintCompany(){
        System.out.println("静态方法");
    }

    public static void main(String[] args) {
        TestStaticBlock testStaticBlock = null;
    }
}
