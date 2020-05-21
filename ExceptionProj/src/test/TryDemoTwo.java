package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * author zyw
 */
public class TryDemoTwo {
    public static void main(String[] args){
        int result = test();
        System.out.println("one and two的商是："+ result );
    }
    public static int test() {
        Scanner input = new Scanner(System.in);
        System.out.println("-----运算开始--------");
        try {
            System.out.println("please input the first number:");
            int one = input.nextInt();
            System.out.println("please input the second number:");
            int two = input.nextInt();
            return one/two;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0~~~");
            return 0;

        } finally {
            System.out.println("-----运算结束-----");
            //return -100000;
        }
    }
}

