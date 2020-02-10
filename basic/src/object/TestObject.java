package object;

public class TestObject {

    public static void main(String[] args) {
        TestObject testObject = new TestObject();
        // 默认触发了testObject.toString()
        System.out.println(testObject);

        Person2 person2 = new Person2("高晓青", 11);
        System.out.println(person2.toString());
    }
}

class Person2{
    String name;
    int age;

    public String toString(){
        return name + ":" + age;
    }

    public Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
