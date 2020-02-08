package project;

/**
 * 位运算
 */
public class TestOperator02 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

        // 移位
        int c = 3<<2;  // 左移是乘  3 * 2的2次方
        System.out.println(c);
        System.out.println(12>>1);  //右移是除  12 除以 2的一次方
    }

}
