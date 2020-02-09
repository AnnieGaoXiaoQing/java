package object;

/**
 * 测试值传递
 */
public class TestValuePass {

    int id;
    String name;

    static String companyName;

    public TestValuePass() {
    }

    public TestValuePass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 测试1：复制一份，副本会改变对象的值
    public void testTransfer01(TestValuePass u){
        u.name = "高晓青";
    }
    // 测试2：地址改变了
    public void testTransfer02(TestValuePass u){
        u = new TestValuePass(11, "新对象");
    }

    public static void main(String[] args) {
        TestValuePass testValuePass = new TestValuePass(1, "小小");
        // 值会变，副本修改的对象生效
        testValuePass.testTransfer01(testValuePass);
        System.out.println(testValuePass.name);

        // 值并不会改变，新的对象地址会更新
        testValuePass.testTransfer02(testValuePass);
        System.out.println(testValuePass.name);

    }

}
