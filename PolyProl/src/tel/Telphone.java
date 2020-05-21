package tel;

public class Telphone {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Telphone(){

    }
    public void call(){
        System.out.println("手机可以打电话");
    }
}
