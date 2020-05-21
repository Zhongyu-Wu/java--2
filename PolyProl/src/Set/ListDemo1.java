package Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("Go");
        list.add("swift");
        System.out.println("列表中元素的个数为:" + list.size());
        System.out.println("****************************************");
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+",");
        }

        System.out.println();
       // list.remove(2);
        list.remove("c++");
        System.out.println("****************************************");
        System.out.println("移除C++以后的元素为:");
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+",");
        }

    }
}
