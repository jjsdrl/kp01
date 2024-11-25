package day20231101;

public abstract class Shape {

//    创建一个基类Shape，具有抽象方法calculateArea()。
//    然后创建两个子类Triangle和 Square，分别实现该方法以计算三角形和正方形的面积。在main方法中，创建这些对象并计算它们的面积。
    public abstract void calculateArea();

}
class Triangle extends Shape{
    double length;
    double weight;

    public Triangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    @Override
    public void calculateArea() {
        System.out.println("三角形的面积为："+(length*weight/2));
    }
}
class Square extends Shape{
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("正方形的面积为："+(length*length));
    }
}
class TestShape{
    public static void main(String[] args) {
        Shape shape = new Triangle(2,5);
        shape.calculateArea();
        Shape shape1 = new Square(6);
        shape1.calculateArea();

    }
}