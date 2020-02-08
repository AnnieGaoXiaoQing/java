package project;

/**
 * 自动类型转换
 */
public class TestTypeConvert {

    public static void main(String[] args) {
        // 容量小向容量大转换
        int a = 324;
        long b = a;
        double d = b;
        // a = b; // 错误（必须是容量小向容量大转换）

        // 强制类型转换
        double x = 3.14;
        int nx = (int)x;  // 截取第一位
        char c = 'a';
        int z = c + 1;
        System.out.println(nx);
        System.out.println(c);
        System.out.println(z);
        System.out.println((char)z);   // 转换为字符

    }

}
