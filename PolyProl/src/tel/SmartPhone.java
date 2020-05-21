package tel;

public class SmartPhone implements INet,IPhoto{
    public static final int TEMP=30;
    public void call(){
        System.out.println("只能手表可以打电话");
    }
    public void massage(){
        System.out.println("只能手表可以打电话");
    }

    @Override
    public void network() {

    }

    @Override
    public void connection() {

    }

    @Override
    public void photo() {

    }

   /* @Override
    public void connection(){
        INet.super.connection();//调用接口中默认的方法


   }
   public void connection(){
        System.out.println("Smartphone的connection方法");
   }*/


}
