package basic;

public class TestWhile {

    public static void main(String[] args) {
        // 计算 1 + 2 + 3 …… + 100 ，综合5050
        int i = 1;
        int sum = 0;
        while (i <= 100){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

}
