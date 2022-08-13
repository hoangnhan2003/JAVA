package ss6.BT;

import ss4.QuadracticEquation;

public class bt1 {
    public static void main(String[] args) {
        Circle circle = new Circle(45);
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(5);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
interface Resizeable{
    void resize(double percent);
}
class Circle implements Resizeable{
    private double radius=0;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void resize(double x){
        this.radius =x;
    }
    public String toString(){
        return "Circle has radius = "+this.radius;
    }
}
class Rectangle implements Resizeable{
    private double width =0;
    private double height =0;
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void resize(double x){
        this.width = x;
        this.height =x;
    }
    public void resize(double x,double y){
        this.width =x;
        this.height =y;
    }
    public String toString(){
        return "Rectangle has width = "+this.width +" height = "+this.height;
    }

}
class Square implements Resizeable{
    private double side ;
    public Square(double side){
        this.side = side;
    }
    @Override
    public void resize(double x){
        this.side = x;
    }
    public String toString(){
        return "Square has side = " + this.side;
    }
}

