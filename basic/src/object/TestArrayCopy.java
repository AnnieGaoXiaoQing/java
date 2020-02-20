package object;

/**
 * 测试数组拷贝
 */
public class TestArrayCopy {

    public static void main(String[] args) {
       // testBasicCopy();
        // 删除数组
        //testBasicCopy2();

        String[] s1 = {"阿里", "京东", "尚学堂", "百度", "亚马逊"};
        // 删除某个索引的值
        //testBasicCopy3(s1,1);

        extendRange(s1);
    }

    /**
     * 简单复制
     */
    public static void testBasicCopy(){
        String[] s1 = {"aa", "bb", "cc","dd", "ee"};
        String[] s2 = new String[10];

        // 原数组下标为1的复制3个数，到新数组下标为2
        System.arraycopy(s1,1,s2, 2, 3);

        // 打印数组的值（）
        for(int i = 0; i < s2.length; i++){
            System.out.println(i + "--" +s2[i]);
        }

    }

    // 测试从数组中删除某个元素（本质上还是数组的拷贝）
    public static void testBasicCopy2(){
        String[] s1 = {"一", "二", "三", "四", "五"};
        // String[] s2 = new String[5];
        // 删除“三”
        System.arraycopy(s1, 3, s1, 3-1, s1.length-2-1);
        // 结果里的值：0--一  1--二  2--四  3--五 4--五
        for (int i = 0; i < s1.length; i++){
            System.out.println(i + "--" + s1[i]);
        }
    }

    // 删除数组中指定索引位置的元素，并将原数组返回
    public static String[] testBasicCopy3(String[] s, int index){
        System.arraycopy(s, index + 1, s, index, s.length-index-1);
        for (int i = 0; i < s.length; i++){
            System.out.println(i + "--" + s[i]);
        }
        return s;
    }

    // 数组的扩容（本质上是：先定义一个更大的数组，然后将原数组内容原封不动拷贝到新数组中）
    public static void extendRange(String[] s1){
        String[] s2 = new String[s1.length + 10];

        System.arraycopy(s1,0,s2,0,s1.length);  // 将s1中所有的元素都拷贝到s2

        for (String tem : s2){
            System.out.println(tem);
        }
    }

}
