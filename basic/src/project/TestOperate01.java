package project;

/**
 * 测试运算符
 */
public class TestOperate01 {
    public static void main(String[] args) {

      /*  byte a = 1;
        int b = 2;
        long c = 3;*/
        //byte d = a + b; // 报错，没有long，则默认是int；
        //int g = a + c; // 报错，有long，则用long接收

        // 测试自增和自减
        int a = 3;
        int b = a++; // 执行完后 b=3,先给b赋值，再自增
        System.out.println("a=" + a + "\nb=" + b);
        a = 3;
        b = ++a; // 执行完后c=5, a先自增，再赋值给c
        System.out.println("a=" + a + "\nb=" + b);

    }
}
