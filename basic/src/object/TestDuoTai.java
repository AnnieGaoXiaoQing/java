package object;

/**
 * 测试多态
 * 底层：动态绑定
 * 若不使用多态，则需要重写多次才可以实现多态效果
 */
public class TestDuoTai {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animalCry(animal);

        // 多态写法1：
        Dog dog = new Dog();
        animalCry(dog);

        // 多态写法2：
        Animal animalDog = new Dog();
        animalCry(animalDog);
    }

    static void animalCry(Animal animal){
       animal.shout();
    }

    // 若不实现多态，则需要重复写多个下面方法
    /*static void animalCry(Dog dog){
        dog.shout();
    }

    static void animalCry(Cat cat){
        cat.shout();
    }*/
}

class Animal{
    public void shout(){
        System.out.println("叫了一声！");
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪！！！");
    }
}

class Cat extends Animal{
    public void shot(){
        System.out.println("喵喵喵！！！");
    }
}