package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args) {
        //要求 定义两个整数，输出两数之商

        /*int one = 12;
        int two = 2;
        System.out.println("one and two 的商" + (one/two));*/

        //要求 定义两个整数，接收用户的键盘输入，输出两数之商
        Scanner input = new Scanner(System.in);
        System.out.println("-----运算开始--------");
        try {
            System.out.println("please input the first number:");
            int one = input.nextInt();
            System.out.println("please input the second number:");
            int two = input.nextInt();
            System.out.println("one and two 的商" + (one / two));
        } catch (ArithmeticException e) {
            /*终止程序运行*/
            System.exit(1);
            System.out.println("除数不允许为0~~~");
            e.printStackTrace();

        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("出错了");
            e.printStackTrace();
        }finally {
            System.out.println("-----运算结束-----");
        }
    }
}
