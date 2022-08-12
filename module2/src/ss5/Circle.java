package ss5;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle has radius = "+ this.radius+"\n color: "+ this.color ;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0,"red");
        System.out.println("Radius of circle is " + circle.getRadius());
        System.out.println("Color of circle is " + circle.getColor());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder("white",3.0,5.0);
        System.out.println(cylinder1.toString());
    }
}
class Cylinder extends Circle{
    private double height =2.0;
    public Cylinder(){

    }
    public Cylinder(String color,double radius,double height){
        super(radius, color);
        this.height = height;
    }
    @Override
    public String toString(){
        return "A cylinder has height is "+ this.height +" be extend from class "+super.toString();
    }
}
