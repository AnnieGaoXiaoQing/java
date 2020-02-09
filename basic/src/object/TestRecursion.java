package object;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * 阶乘效率低，普通循环效率高
 *
 */
public class TestRecursion {

    public static void main(String[] args) {
        /*long d1 = System.currentTimeMillis();
        // 阶乘
        System.out.printf("%d阶乘测试结果%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n", d2 - d1);
        */
        // 普通循环
        factorialLoop(10);
    }

    /**
     * 递归
     * @param n
     * @return
     */
    static long factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return n * factorial(n-1);
        }

    }

    static long factorialLoop(int a){
        long d3 = System.currentTimeMillis();
        long result = 1;
        while (a > 1){
            result = result * (a * (a -1));
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.printf("普通循环费时：%s%n", d4 - d3);
        return result;
    }
}
