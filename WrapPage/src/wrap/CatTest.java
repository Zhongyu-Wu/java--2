package wrap;

public class CatTest {
    public static void main(String[] args) {
        //实例化对象
        Cat one = new Cat();
        //test
        System.out.println("小猫昵称:" + one.name);
        System.out.println("小猫年龄:" + one.age);
        System.out.println("小猫体重:" + one.weight);
    }
}
