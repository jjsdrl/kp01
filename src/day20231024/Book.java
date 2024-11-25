package day20231024;



//编写一个Java类Book，具有属性title、author、price，以及一个构造函数。
//然后创建一个BookStore类，该类包含一个书籍列表，并能够添加、删除和列出库存中的书籍。
public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

}
class BookStore{

}