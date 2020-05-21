package generic;

public class GenericMethod {
    public <T> void printValue(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.printValue("hello");
        gm.printValue(112);
        gm.printValue(5.0f);
    }
}
