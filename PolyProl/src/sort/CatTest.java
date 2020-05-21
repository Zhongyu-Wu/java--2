package sort;

import java.util.Collections;
import java.util.List;

import java.util.ArrayList;

public class CatTest {
    public static void main(String[] args) {
        //按名字升序排序
        Cat huahua = new Cat("huahua",5,"yingduan");
        Cat fanfan = new Cat("fanfan",2,"zhonghua");
        Cat maomao = new Cat("maomao",3,"zhonghua");
        List<Cat> catlist = new ArrayList<Cat>();
        catlist.add(huahua);
        catlist.add(fanfan);
        catlist.add(maomao);
        System.out.println("排序前;");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
        Collections.sort(catlist,new NameComparator());
        System.out.println("排序后;");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
        //按年龄进行降序排序
        Collections.sort(catlist,new AgeComparator());
        System.out.println("按年龄降序排序后;");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
    }
}
