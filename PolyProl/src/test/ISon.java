package test;

//接口也可以实现继承关系 并且可以继承多个父接口
public interface ISon extends IFather ,IFather2 {
    void run();

    @Override
    default void connection(){
        System.out.println("IFather中的connection");
    }
}
