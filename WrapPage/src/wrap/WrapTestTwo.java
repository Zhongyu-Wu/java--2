package wrap;

public class WrapTestTwo {
    public static void main(String[] args) {
        //基本数据类型转换为字符串
        int t1 = 2;
        String t2 = Integer.toString(t1);
        System.out.println("int类型转换为String类型对象t2="+t2);
        System.out.println("----------------------------------------");
        //把字符串转换为基本数据类型
        //1.包装类的parses
        int t3 = Integer.parseInt(t2);
        //2.包装类的valueOf 先将字符串转换为包装类 再通过自动拆箱
        int t4 = Integer.valueOf(t2);
        System.out.println("int类型转换为String类型对象t3="+t3);
        System.out.println("int类型转换为String类型对象t4="+t4);
    }
}
