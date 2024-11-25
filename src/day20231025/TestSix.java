package day20231026;

public class TestSix {

    public static void main(String[] args) {
        /*
        编写一个Java类Shape，具有属性color和一个抽象方法calculateArea(). 创建两个子类，
        Circle和Rectangle，分别实现calculateArea()方法以计算圆形和矩形的面积。
         */
        /*Shape shape = new Circle(2);
        shape.calculateArea();*/
        Shape shape = new Rectangle(2,4);
        shape.calculateArea();
    }
}

abstract class Shape{
    String color;
    public abstract void calculateArea();
}
class Circle extends Shape{
    public Circle() {
    }
    public Circle(double r) {
        this.r = r;
    }
    double r;
    @Override
    public void calculateArea() {
        //Math.pow  计算一个数的多少次幂
        System.out.println(Math.PI*Math.pow(r,2));
    }
}
class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    double width;
    double height;
    @Override
    public void calculateArea() {
        System.out.println(width*height);
    }
}
