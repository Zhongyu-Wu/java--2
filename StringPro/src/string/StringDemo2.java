package string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = new String("java编程基础，我喜欢java编程");

        //查找a在字符串第一次出现的位置
        System.out.println("a在字符串第一次出现的位置:" +str.indexOf("a"));

        System.out.println("子串 \"编程\"在字符串中第一次出现的位置:" + str.indexOf("编程"));

        System.out.println("子串 `a`在字符串中最后一次出现的位置:" + str.lastIndexOf("a"));

        System.out.println("子串 \"编程\"在字符串中最后一次出现的位置:" + str.lastIndexOf("编程"));

        //从字符串index值为8的位置，查找子串 编程 第一次出现的位置
        System.out.println("从字符串index值为8的位置 \"编程\"在字符串中第一次出现的位置:" + str.indexOf("编程",8));

    }
}
