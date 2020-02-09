package object;

/**
 * 普通方法可以调用静态常量或静态方法
 * 静态方法则不可以用普通方法
 * 存储：静态方法/静态常量：是类信息
 *       普通方法：是对象信息
 */
public class TestStatic {

    int id;
    String name; // 账户名
    String pwd; // 密码

    static String company = "北京尚学堂";

    public void login(){
        System.out.println("登录：" + name);
    }

    public static void printCompany(){
        //login(); // 调用非静态成员，编译就会报错
        System.out.println("静态方法");
    }

    public static void main(String[] args) {
        TestStatic.company = "高晓青";
        TestStatic.printCompany();
    }
}
