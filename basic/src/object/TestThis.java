package object;

/**
 * this不可以用于static方法，原因是static方法从属于类，而不是对象
 */
public class TestThis {
    //成员变量
    int a,b,c;

    // this使用方式1：为成员变量赋值
    TestThis(int a, int b){
        this.a = a;
        this.b = b;
    }
    // 使用方式2：内部调用，但必须方法最前面
    TestThis(int a, int b, int c){
        this(1,1);
        this.c = c;
    }
}
