package object;

/**
 * 测试数组
 */
public class TestArray {
    public static void main(String[] args) {
       int[] ints = new int[10];
       // 设置值
        for (int i = 0; i < ints.length; i++){
            ints[i] = i * 10;
        }
       // 遍历
       for (int i = 0; i < ints.length; i++){
           System.out.println(ints[i]);
       }

       UserInfo[] userInfo = new UserInfo[3];
       userInfo[0] = new UserInfo(1, "高一");
       userInfo[1] = new UserInfo(2, "高二");
       userInfo[2] = new UserInfo(3, "高三");

       for (int i = 0; i < userInfo.length; i++){
           System.out.println(userInfo[i].getName());
       }

        // 静态初始化
        int[] a = {1,2,2};
        UserInfo[] userInfos = {
           new UserInfo(11, "青青"),
           new UserInfo(22, "红红"),
        };
        // 默认初始化
        String[] str = new String[3]; // 默认给数组元素进行赋值，赋值的规则和成员变量赋值规则一致(int-0  boolean-false)
        // 动态初始化
        int[] a1 = new int[2];  // 动态初始化数组，先分配空间
        a1[0] = 1;
        a1[1] = 2;

        // foreach：仅用来读取，不进行修改
        String[] strs = {"1", "2", "3"};
        for (String str1: strs) {
            System.out.println(str1);
        }
    }

}

class UserInfo{
    private int id;
    private String name;

    public UserInfo(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}