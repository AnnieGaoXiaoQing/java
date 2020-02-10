package object;

/**
 * 测试继承
 * Object所有类的父类
 */
public class TestExtends {

    public static void main(String[] args) {
        Student student = new Student("高晓青", 11, "计算机");
        System.out.println("姓名 = " + student.name);

        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
    }
}

class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会儿");
    }
}

class Student extends Person{
    String major;

    public void study(){
        System.out.println("休息一会儿");
    }

    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}
