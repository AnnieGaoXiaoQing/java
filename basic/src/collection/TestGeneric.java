package collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * 测试泛型
 */
public class TestGeneric {
    public static void main(String[] args) {
        // 测试普通使用方式：需要进行强转
        MyCollection myCollection = new MyCollection();
        myCollection.set("高晓青", 0);
        myCollection.set(11,1);
        // 若不使用泛型，则需要进行强制转换
        String a = (String) myCollection.get(0);
        Integer b = (Integer) myCollection.get(1);

        // 使用泛型方式，则不需要强转
        MyCollectionGeneric<String> myCollectionGeneric = new MyCollectionGeneric<>();
        myCollectionGeneric.setObjects("高晓青泛型", 0);

        String aa = myCollectionGeneric.getObjects(0);

        System.out.println(aa);
    }
}

/**
 * 定义一个容器
 */
class MyCollection{

    Object[] objs = new Object[5];
    public void set(Object object, int index){
        objs[index] = object;
    }

    public Object get(int index){
        return objs[index];
    }
}

class MyCollectionGeneric<E>{
    Object[] objects = new Object[5];

    public void setObjects(E e, int index){
        objects[index] = e;
    }

    public E getObjects(int index){
        return (E)objects[index];
    }
}