package animal;

public abstract class Animal {


    private int month;

    public Animal(){

    }

    public Animal(String name, int month){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
//抽象方法 不允许包含方法体 子类中需要重写父类的抽象方法，否则，子类也是抽象类
    //stativ final private不能与abstract并存
    public abstract void eat();


    public static void say(){
        System.out.println("动物间打招呼");
    }
}
