package Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        //定义猫对象
        Cat huahua = new Cat("huahua", 12, "yingduan");
        Cat fanfan = new Cat("fanfan", 3, "zhonghua");
        //将猫对象放入hashset
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);


        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //再添加一个与花花属性一样的猫
        Cat huahua01 = new Cat("huahua", 12, "yingduan");
        set.add(huahua01);
        System.out.println("*********************");
        System.out.println("添加重复数据后的信息:");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Cat huahua02 = new Cat("huahua02" ,2, "yingduan");
        set.add(huahua02);
        System.out.println("添加花花二代后的信息:");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("*********************");
        //再集合中查找花花的信息并输出
        if (set.contains(huahua)) {
            System.out.println("huahua找到了");
            System.out.println(huahua);
        } else {
            System.out.println("huahua没找到");
        }
        //再集合中使用名字查找huahau的信息
        boolean flag = false;
        Cat c = null;
        it = set.iterator();
        while (it.hasNext()) {
            c = it.next();
            if (c.getName().equals("huahua")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("huahua找到了");
            System.out.println(c);
        } else {
            System.out.println("huahua没找到");
        }

        //删除花花二代的信息并重新输出
        for (Cat cat : set) {
            if ("huahua01".equals(cat.getName())) {
                set.remove(cat);
            }
        }
        System.out.println("删除花花二代的数据:");
        for (Cat cat : set) {
            System.out.println(cat);
        }
        //删除所有信息
        boolean flag1 = set.removeAll(set);
        if(set.isEmpty()){
            System.out.println("猫都不见了");
        }else{
            System.out.println("猫还在");
        }
    }
}
