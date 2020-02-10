package object;

public class TestEquals {

    public static void main(String[] args) {

        User user1 = new User(11, "高晓青", "计算机");
        User user2 = new User(11, "张骞", "娱乐");

        System.out.println(user1 == user2);   // false
        System.out.println(user1.equals(user2));  // 不重写ID则为false，重写ID则为ture

        String str1 = new String("sxt");
        String str2 = new String("sxt");

        System.out.println(str1 == str2);   // false
        System.out.println(str1.equals(str2));  //true

    }
}

class User{
    int id;
    String name;
    String major;

    public User(int id, String name, String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if (null == object){
            return false;
        }

        if(getClass() != object.getClass()){
            return false;
        }

        User user = (User)object;
        if(id != user.id){
            return false;
        }
        return true;
    }
}
