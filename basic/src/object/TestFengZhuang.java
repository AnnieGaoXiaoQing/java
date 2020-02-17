package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试封装
 */
public class TestFengZhuang {

    private int id;
    private String name;
    private int age;

    public void setAge(int age){
        if(age > 7 && age < 20){
            this.age = age;
        }else {
            System.out.println("请输入正常年龄！");
        }
    }

    public static void main(String[] args) {
        /*TestFengZhuang testFengZhuang = new TestFengZhuang();
        testFengZhuang.setAge(-111);
        System.out.println(testFengZhuang);*/

        List<Integer> list = Arrays.asList(10, 12);
        if(list.contains(2)){
            System.out.println("包括");
        }else{
            System.out.println("不包括");
        }

    }
}


