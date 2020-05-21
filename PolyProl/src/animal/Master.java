package animal;

public class Master {
    /**
     * 喂宠物
     * wei maomi 吃完东西 主任带着玩
     * 喂狗 吃完东西 睡觉
     */
    //方案一 编写方法 传入不同类型的动物 调用各自的方法
    /*public void feed(Cat cat){
        cat.eat();
        cat.playball();

    }
    public void feed(Dog dog){
        dog.eat();
        dog.sleep();

    }*/
    //方案2 编写方法 传入动物的父类 方法中通过类型转换 调用指定子类的方法
   public void feed(Animal obj){
       obj.eat();
        if(obj instanceof Cat){
            Cat temp =(Cat)obj;

            temp.playball();
        }else if(obj instanceof Dog){
            Dog temp = (Dog)obj;

            temp.sleep();
        }
   }
    /**
     *
     */
    //方案1
    /**public Dog hasManyTime(){
        System.out.println("主任休闲时间多。适合养狗");
        return new Dog();
    }
    public Cat hasLittleTime(){
        System.out.println("主任休闲时间shao。适合养mao");
        return new Cat();
    }*/
    //方案2
    public Animal raise(boolean isManyTime){
        if(isManyTime){
            System.out.println("主任休闲时间多。适合养狗");
            return new Dog();
        }else{
            System.out.println("主任休闲时间shao。适合养mao");
            return new Cat();
        }
    }


}
