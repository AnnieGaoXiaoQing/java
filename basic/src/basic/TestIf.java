package basic;

public class TestIf {

    public static void main(String[] args) {
        double d = Math.random(); // 返回【0,1）之间的随机数
        System.out.println(d);
        System.out.println(6 * Math.random()); // 生成【0,5）之间随机数
        System.out.println((int)(6 * Math.random()));  // 生成【0,5）之间随机整数

        System.out.println("===================");
        int a = (int)(6 * Math.random()) + 1;
        int b = (int)(6 * Math.random()) + 1;
        int count = a + b;
        // 如果三个骰子之和在10到15之间，则手气不错
        if(count > 15){
            System.out.println("手气不错");
        }else {
            System.out.println("手气不行");
        }
    }

}
