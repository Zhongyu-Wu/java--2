package string;


import java.io.UnsupportedEncodingException;

public class StringDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串和byte数组之间的转换
        String str = new String("java 编程 基础");
        //将字符串转换为byte数组，并打印输出
        byte[] arr = str.getBytes("GBK");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        //byte转化成字符串
        String str1 = new String(arr,"GBK");
        System.out.println(str1);

    }
}
