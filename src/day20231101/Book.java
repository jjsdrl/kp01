package day20231101;

public class Book {
  /*  创建一个Java类Book，包含以下属性：

    title（标题）
    author（作者）
    price（价格）
    实现构造函数以初始化这些属性。然后编写方法displayInfo()，用于显示书的信息。在main方法中，创建几本书并调用displayInfo()方法。*/

    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void displayInfo(){
        /*System.out.println("书名："+this.title);
        System.out.println("作者："+this.author);
        System.out.println("价格："+this.price);*/
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}');

    }
}
class TestBook{
    public static void main(String[] args) {
        Book book1 = new Book("重生之我是彭涛","郑皓月",250.0);
        book1.displayInfo();
        Book book2 = new Book("重生之我是彭皓月","郑涛",250.0);
        book2.displayInfo();
    }
}