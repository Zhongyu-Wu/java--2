package string;

public class StringDemo5 {
    public static void main(String[] args) {
        //== equals 区别
        //
        String str1 = "immoc";
        String str2 = "immoc";
        String str3 = new String("imooc");
        System.out.println("st1和str2的内容相同？"+(str1.equals(str2)));
        System.out.println("st1和str3的内容相同？"+(str1.equals(str3)));

        System.out.println("st1和str2的地址相同？"+(str1.equals(str2)));
        System.out.println("st1和str3的地址相同？"+(str1.equals(str3)));
    }
}
