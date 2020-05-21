package test;

import tel.*;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.music();
        phone.vedio();
        phone.photo();
        phone.network();
        System.out.println("----------------------------");
        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
        System.out.println("----------------------------");
        System.out.println(INet.TEMP );
        INet net = new SmartPhone();
        System.out.println(INet.TEMP);
        net.connection();
        INet.stop();
        System.out.println("----------------------------");
        INet net2 = new SmartPhone();
        net2.connection();
        IPhoto ip2 = new SmartPhone();
        ip2.connection();
        System.out.println("----------------------------");
        INet net3 = new FourthPhone();
        net3.connection();
        IPhoto ip3 = new FourthPhone();
        ip3.connection();
    }
}
