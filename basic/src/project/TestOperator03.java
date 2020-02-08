package project;

/**
 * 字符串运算符(+:有String类型则成为字符串运算符)
 */
public class TestOperator03 {

    public static void main(String[] args) {
        String a = "3";
        int b = 4;
        int c = 5;
        char d = 'a';
        System.out.println(a + b + c);
        System.out.println(b + c + a);
        System.out.println(d + c);  // 97 + 4 = 101

    }

}
