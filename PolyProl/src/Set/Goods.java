package Set;

public class Goods {
    private String id;
    private String name;
    private double price;
    //构造方法
    public Goods(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
//get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "商品编号:" +id +",商品名称:"+name+",商品价格:"+price;
    }
}
