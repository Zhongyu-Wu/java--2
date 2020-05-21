package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods("s00001","手机",2000);
        Goods g2 = new Goods("s00002","bingxiang",5000);
        Goods g3 = new Goods("s00003","television",3000);
        List<Goods> goodslist = new ArrayList<Goods>();
        goodslist.add(g1);
        goodslist.add(g2);
        goodslist.add(g3);
        //排序前
        System.out.println("排序前:");
        for(Goods goods:goodslist){
            System.out.println(goods);
        }
        Collections.sort(goodslist);
        System.out.println("排序后:");
        for(Goods goods:goodslist){
            System.out.println(goods);
        }
    }
}
