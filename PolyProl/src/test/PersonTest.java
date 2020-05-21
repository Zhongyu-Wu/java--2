package test;

import anonymous.Man;
import anonymous.Person;
import anonymous.Woman;


import anonymous.Person;

public class PersonTest {
    //1
    /*public void getRead(Man man){
        man.read();

    }
    public void getRead(Woman woman){
       woman.read();

    }*/
//2
    public void getRead(Person person) {
        person.read();

    }

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
        /*Man one = new Man();
        Woman two = new Woman();
        test.getRead(one);
        test.getRead(two);*/
//方案3 匿名内部类
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("男生喜欢看科幻");
            }

        });
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("女生喜欢看言情");
            }

        });
    }
}
