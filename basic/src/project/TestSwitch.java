package project;

public class TestSwitch {

    public static void main(String[] args) {
        int month = 1;
        System.out.println("月份：" + month);
        switch (month){
            case 1:
                System.out.println("1月份");
                break;
            default:
                System.out.println("其他");
                break;
        }


        System.out.println("======================");

        char c = 'a';
        int rand = (int)(26 * Math.random());
        char c2 = (char)(c + rand);
        System.out.println(c2 + ";");

        switch (c2){
            case 'a':
            case 'b':
            case 'c':
                System.out.println("元音");
                break;
            default:
                System.out.println("辅音");
                break;
        }
    }
}
