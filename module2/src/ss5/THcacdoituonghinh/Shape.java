package ss5.THcacdoituonghinh;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled ;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A shape with color of " +this.color +" and filled: " + this.filled;
    }
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape.toString());
//
//        shape = new Shape("red", false);
//        System.out.println(shape.toString());
//        Square square = new Square();
//        System.out.println(square.toString());
        Square square1 = new Square("pink",true,2.0);
        System.out.println(square1.toString());
    }
}
class Circle extends Shape{
    private double radius = 1.0;

    public Circle(String color,boolean filled){
        super(color, filled);
    }
    public Circle(){

    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double getPeriMeter(){
        return 2*Math.PI*this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(String color,boolean filled,double width,double height){
        super(color, filled);
        this.width = width ;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPeriMeter(){
        return (this.width + this.height)*2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
class Square extends Rectangle{
    private double side =1.0;
    private double width =side;
    private double height = side;
    public Square(){

    }
    public Square(String color,boolean filled,double side){
        super(color,filled,side,side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.height = side;
        this.side = side;
    }
    @Override
    public void setHeight(double side){
        this.width = side;
        this.height = side;
    }

    @Override
    public String toString(){
        return "A Square with side = " + super.getWidth() + ",which is a subclass of " + super.toString();
    }
}
