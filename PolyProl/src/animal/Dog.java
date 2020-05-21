package animal;

public class Dog extends Animal {
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //属性 性别
    private String sex;

    public Dog(){

    }
    public Dog(String name, int month, String sex){
        this.setMonth(month);
        this.setName(name);
        this.setSex(sex);
    }
    //方法 睡觉
    public void sleep(){
        System.out.println("小狗午睡");
    }
    //重写父类吃东西方法
    @Override
    public void eat(){
        System.out.println("dog eat meat");
    }
}
