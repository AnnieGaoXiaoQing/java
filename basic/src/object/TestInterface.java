package object;

public interface TestInterface {

    /**public static final*/ Integer MAX_VALUE = 1;

    /* public abstract*/ void shout();

}

class MyClass implements TestInterface{
    @Override
    public void shout() {
        System.out.println(MAX_VALUE);
    }
}