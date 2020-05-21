package test;

import java.util.Scanner;

public class TryDemoFour {
    public static void main(String[] args){
        try{
            testAge();
        }catch(HotelAgeException e){
            System.out.println(e.getMessage());
            System.out.println("酒店工作人员不允许办理入住登记");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    /**
     * throw抛出异常对象的处理方案
     * 1.通过try catch包含throw语句 自己抛出异常以自己处理
     */
    //描述酒店的入住规则 限定年龄 18以下 80以上的住客由亲友陪同
    /*public static void testAge(){
            try {
                System.out.println("please input age:");
                Scanner input = new Scanner(System.in);
                int age = input.nextInt();
                if(age < 18 || age > 80){
                throw new Exception("18以下 80以上的住客由亲友陪同");
            } else{
            System.out.println("welcome to hotel");
        }
            }catch (Exception e) {
                    e.printStackTrace();

        }
    }
}*/

    /**
     * 2.通过throws在方法声明出抛出异常类型--谁调用谁处理--调用者可以自己处理，也可以继续向上抛
     * @throws Exception
     */

    public static void testAge()throws HotelAgeException{
            System.out.println("please input age:");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            if(age < 18 || age > 80){
                //throw new Exception("18以下 80以上的住客由亲友陪同");
                throw new HotelAgeException();
            } else{
                System.out.println("welcome to hotel");
            }
        }

        }



