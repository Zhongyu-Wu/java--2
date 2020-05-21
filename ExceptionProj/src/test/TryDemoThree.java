package test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static test.TryDemoTwo.test;


public class TryDemoThree {
    public static void main(String[] args) {

      /*  try {
            int result = test();
            System.out.println("one and two的商是：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        }
    }*/

        try {
            int result = test();
            System.out.println("one and two的商是：" + result);
        } catch (ArithmeticException e) {

        } catch (InputMismatchException e) {

        } catch (Exception e) {

        }

    }

    /**
     * 通过throws抛出异常时，针对可能出现的多种异常情况，解决方案
     * 1.throws后面接多个异常类型，中间用逗号分隔
     * 2.throws后面接Exception
     *
     * @return
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
  /* public static int test() throws ArithmeticException ,InputMismatchException{
        Scanner input = new Scanner(System.in);
        System.out.println("-----运算开始--------");
        System.out.println("please input the first number:");
        int one = input.nextInt();
        System.out.println("please input the second number:");
        int two = input.nextInt();
        System.out.println("-----运算结束-----");
        return one / two;
    }
}*/
    public static int test() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("-----运算开始--------");
        System.out.println("please input the first number:");
        int one = input.nextInt();
        System.out.println("please input the second number:");
        int two = input.nextInt();
        System.out.println("-----运算结束-----");
        return one / two;
    }

}
