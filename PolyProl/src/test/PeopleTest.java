package test;

import people.Person;

public class PeopleTest {
    public static void main(String[] args) {
        Person lili = new Person();
        Person.age = 12;
        /*
        //获取内部类对象实例 方式1 new外部类. new 内部类
       Person.Heart myHeart = new Person().new Heart();
       System.out.println(myHeart.beat());

       //方式2 外部类对象.new 内部类
        myHeart = lili.new Heart();
        System.out.println(myHeart.beat());

        //获取内部类对象实例， 方式3 外部类对象.new 内部类
        myHeart = lili.getHeart();
        System.out.println(myHeart.beat());
    }*/

        //获取静态内部类对象实例
        /*Person.Heart myHeart = new Person.Heart();
        System.out.println(myHeart.beat());

        Person.Heart.say();*/
        System.out.println(lili.getHeart());
    }


}
