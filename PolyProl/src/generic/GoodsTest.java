package generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        //定义book相关的list
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());
        books.add(new Book());
        //定义clothes相关的list
        List<Clothes> clothes = new ArrayList<Clothes>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());
        //定义shoes相关的list
        List<Shoes> shoes = new ArrayList<Shoes>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller goodsSeller = new GoodsSeller();
        goodsSeller.sellGoods(books);

    }
}
