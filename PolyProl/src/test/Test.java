package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Test {
    public static void main(String[] args) {
//
//        Animal one = new Animal();
//        /*向上转型，隐式转型--》父类引用指向子类实例，小类转型为大类,可以调用子类重写父类的方法以及父类派生的方法
//        // ，无法调用子类独有的方法*/
//        Animal two = new Cat();
//        Cat cat = new Cat();
//        two = cat;
//        Animal three = new Dog();
//
//        one.eat();
//        two.eat();
//        two.setMonth(2);
//        two.getMonth();
//        three.eat();
//        System.out.println("----------------");
//        /**
//         * 向下转型 强制类型转换
//         * 子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
//         * 满足转换条件才能转换
//         * instanceof运算符；返回true false
//         */
//
//        if (two instanceof Cat) {
//            Cat temp = (Cat) two;
//            temp.eat();
//            temp.run();
//            temp.getMonth();
//            System.out.println("two可以转换为Cat类型");
//        }
//        if (two instanceof Dog) {
//
//
//            Dog temp2 = (Dog) two;
//            temp2.eat();
//            temp2.sleep();
//            temp2.getSex();
//            System.out.println("two可以转换为Dog类型");
//        }
//        if(two instanceof Animal){
//            System.out.println("Animal");
//        }
//        if(two instanceof Object){
//            System.out.println("Object");
//        }
    }
}
