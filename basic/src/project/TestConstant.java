package project;

import java.math.BigDecimal;

public class TestConstant {
    public static void main(String[] args){

        // 以0开头的是8进制
        int b = 015;
        // 以0x开头的是16进制
        int c = 0x15;
        // 以0b开头的是二进制
        int d = 0b1101;

     /*   System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/

        float  e = 3.14F;
        double f = 6.28;
        double g = 6.26D;

        // 浮点数不精确，一定不要用于比较
        float h = 0.1f;
        double j = 1.0/10;
        System.out.println(h == j);

        // 使用精确的浮点运算，推荐：BigDecimal
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);

        BigDecimal b2 = BigDecimal.valueOf(0.1);
        BigDecimal b3 = BigDecimal.valueOf(1.0/10.0);
        System.out.println(b2.equals(b3));

        char a = '中';
    }
}
