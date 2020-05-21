package string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        /*str.append(",");
        str.append("imooc");*/
        System.out.println("str=" + str.append(",").append("imooc"));

        //将字符串编程 你好 imooc
        //
        //1.使用delete方法删除mooc，然后再插入MOOC
        //System.out.println("替换后："+str.delete(4,8).insert(4,"MOOC"));
        //2.使用replace
        System.out.println("替换后:" + str.replace(4,8,"MOOC"));

        //取出 你好
        System.out.println(str.substring(0,2));
    }
}
