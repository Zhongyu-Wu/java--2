package string;

public class StringDemo1 {
    public static void main(String[] args) {
        //定义一个字符串 java 编程 基础
        String str = "java 编程 基础";
        //打印输出字符串长度
        System.out.println("字符串的长度是：" +str.length());

        //charAt(intdex)
        System.out.println(str.charAt(6));

        //取出子串
        System.out.println(str.substring(5));

        System.out.println(str.substring(5,7));
    }
}
