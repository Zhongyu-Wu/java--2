package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Master;


public class MasterTest {

    public static void main(String[] args) {
        Master master = new Master();
        Cat one = new Cat();
        Dog two = new Dog();
        master.feed(one);
        master.feed(two);
        System.out.println("--------------");
        boolean isManyTime = true;
        Animal temp = master.raise(isManyTime);
        /*if(isManyTime){
            temp = master.hasManyTime();
        }else{
            temp = master.hasLittleTime();
        }*/
        System.out.println(temp);

    }
}
