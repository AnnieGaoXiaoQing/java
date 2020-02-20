package object;

public class TestString {

    public static void main(String[] args) {
        // 使用方式
        String str = "abc";
        String str2 = new String("abc");
        String str3 = "abc" + "defgh";
        String str4 = "18" + 19;  // 不是加法，是字符串连接符
        System.out.println(str4);

        System.out.println("####################");
        String str10 = "gaoqi";
        String str11 = "gaoqi";
        String str12 = new String("gaoqi");

        System.out.println(str10 == str11);  // true
        System.out.println(str11 == str12);  // false  str11和str12不是同一个对象

        // 通常比较字符串时，使用equals
        System.out.println(str11.equals(str12));  // true

    }

}
