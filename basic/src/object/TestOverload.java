package object;

public class TestOverload {

    public static void main(String[] args) {

    }
    // 求和方法
    public static int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
    //方法名相同，参数个数不同，构成重载
    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
    //方法名相同，参数类型不同，构成重载
    public static double add(double n1, int n2){
        double sum = n1 + n2;
        return sum;
    }
    //方法名相同，参数顺序不同，构成重载
    public static double add(int n1,double n2){
        double sum = n1 + n2;
        return sum;
    }
    /*//编译错误：只有返回值不同
    public static double add(int n1, int n2){
        double sum = n1 + n2;
        return sum;
    }
    //编译错误：只有参数名称不同
    public static double add(int n2, int n1){
        double sum = n2 + n1;
        return sum;
    }*/
}
