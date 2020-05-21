package test;

public class HotelAgeException extends Exception {
    public HotelAgeException(){
        super("18以下 80以上的住客由亲友陪同");
    }
}
