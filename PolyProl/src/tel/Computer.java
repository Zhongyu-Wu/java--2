package tel;

public abstract class Computer implements INet,IPhoto{

    public void game(){
        System.out.println("电脑可以youxi");
    }
    public void vedio(){
        System.out.println("电脑可以kanshipin");
    }
    public void music(){
        System.out.println("电脑可以tingyinyue ");
    }
    @Override
    public void network(){

    }

    @Override
    public void connection() {

    }

}
