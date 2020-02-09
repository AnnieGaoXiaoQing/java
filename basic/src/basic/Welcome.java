package basic;

/**
 * 1、java大小写敏感
 * 2、一个源文件可以有多个class文件，但是只能有一个public的类
 * 3、结束标记：分号
 */
public class Welcome {

    int a; //成员变量，从属于对象；成员变量会自动初始化
    static int size; // 静态变量，从属于类

    public static void main(String[] args){
        System.out.println("我是高晓青");

        int gao = 1; // 局部变量，从属于语句块/方法
        System.out.print(gao);
    }
}
