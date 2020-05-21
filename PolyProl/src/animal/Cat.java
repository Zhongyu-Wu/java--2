package animal;

public class Cat extends Animal {
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //属性 体重
    private double weight;

    public Cat(){

    }
    public Cat(String name,int month, double weight){
        super(name, month);
        this.weight = weight;
    }
    //方法 跑
    public void run(){
        System.out.println("runing");
    }
    //方法 吃东西(重写父类)

    @Override
    public void eat(){
        System.out.println("cat eat fish");
    }
    public void playball(){
        System.out.println("play ball");
    }

}
