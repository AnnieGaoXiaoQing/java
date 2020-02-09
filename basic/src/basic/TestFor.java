package basic;

public class TestFor {

    /**
     * 1、执行初始语句：i=1
     * 2、判断i<100
     * 3、执行循环体
     * 4、步进迭代：i++
     * 5、回到第二步继续判断
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++){
            sum = sum + i;
        }

        System.out.println(sum);

        // 多个初始值， 逗号分隔
        for (int i = 1, j = i + 10; i < 5;i++, j = i * 2){
            System.out.println("i = " + i + "j = " + j);

        }
        // 死循环
        /*for(;;){
            System.out.println("爱你到永远");
        }*/

        // 99乘法表
        for (int m = 1; m < 9; m++){
            for (int i = 1; i <= m; i++){
                System.out.print(i + "*" + m + "=" + (i * m) + "\t");
            }
            System.out.println();
        }

        // 用while循环分别计算100以内的奇数及偶数的和，并输出
        int sum01 = 0;
        int sum02 = 0;
        for (int i = 1; i <= 100; i++){
            // 取模为0代表是偶数
            if(i % 2 == 0){
                sum01 += i;
            }else {
                sum02 += i;
            }
        }
        System.out.println("奇数和 = " + sum02);
        System.out.println("偶数和 = " + sum01);

        // 利用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个
        // 计数器
        int h = 0;
        for (int i=0; i < 1000; i++){
            if(i % 5 == 0){
                System.out.print(i + "\t");
                h++;
            }
            // 方式一
            /*if(i % 25 == 0){
                System.out.println();
            }*/

            // 方式二：利用计数器
            if(h == 5){
                System.out.println();
                h = 0;
            }
        }
    }
}
