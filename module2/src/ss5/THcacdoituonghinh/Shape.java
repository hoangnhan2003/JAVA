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
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Area of triangle is "+triangle.getArea());
        System.out.println("Infomation : "+triangle.toString());
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
class Triangle extends Shape{
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 = 1.0;
    public Triangle(){

    }
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 =side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        double p = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
    public double getPerimeter(){
        return this.side1 +this.side2 +this.side3;
    }
    public String toString(){
        return "Triangle has three sides of length: \n side1: "+this.side1+"\n side2: "+this.side2+"\n side3: "+this.side3;
    }
}
