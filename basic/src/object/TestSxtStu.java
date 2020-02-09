package object;

public class TestSxtStu {

    private int age; // 年龄
    String name;
    int id;
    Computer computer;

    void study(){
        System.out.println("我在认真学习, 电脑名称 = " + computer.brand);
    }

    void play(){
        System.out.println("我在游戏");
    }

    public static void main(String[] args) {
        TestSxtStu testSxtStu = new TestSxtStu();
        testSxtStu.name = "高晓青";
        testSxtStu.age = 22;
        Computer computer = new Computer();
        computer.brand = "联想";
        testSxtStu.computer = computer;
        testSxtStu.play();
        testSxtStu.study();
    }
}

class Computer{
    String brand;
}