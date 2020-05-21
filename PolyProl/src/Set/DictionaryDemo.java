package Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<String,String>();
        System.out.println("请输入三组单词对应的注释，并存放到HshMap中");
        Scanner console = new Scanner(System.in);
        //添加数据
        int i = 0;
        while(i < 3){
            System.out.println("请输入key值");
            String key = console.next();
            System.out.println("请输入value值");
            String value = console.next();
            animal.put(key,value);
            i++;
        }
        //打印输出value值
        System.out.println("******************");
        System.out.println("使用迭代器输出所有的value值");
        Iterator <String> it = animal.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key-value");
        Set <Entry<String,String>> entrySet = animal.entrySet();
        for(Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }
        System.out.println("******************");
        //通过单词找到数据并输出
        //使用keySet方法
        String strSearch = console.next();
        //1.取得KeySet
        Set<String> keySet = animal.keySet();
        //2.遍历keySet
        for(String key:keySet){
            if(strSearch.equals(key)){
                System.out.println("find"+ "键值对为:" +key+"-"+animal.get(key));
                break;

            }
        }

    }
}
