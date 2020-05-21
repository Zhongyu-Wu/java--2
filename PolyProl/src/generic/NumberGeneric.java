package generic;

public class NumberGeneric <T>{
    private T num;
    public T getNum(){
        return num;
    }
    public void setNum(T num){
        this.num = num;
    }
//test
    public static void main(String[] args) {
       NumberGeneric<Integer> intNum = new NumberGeneric<>();
       intNum.setNum(10);
       System.out.println("Integer:" + intNum.getNum());

       NumberGeneric<Float> floatNum = new NumberGeneric<>();
       floatNum.setNum(5.0f);
       System.out.println("Float:"+floatNum.getNum());
    }
}
