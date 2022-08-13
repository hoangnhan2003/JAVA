package ss7;

public class BT2 {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.howToColor());
        System.out.println(square.toString());
    }
}
interface Colorable {
    public abstract String howToColor();
}
class Square implements Colorable{
    private double side;
    public Square(){

    }
    public Square (double side){
        this.side = side;

    }
    @Override
    public String howToColor(){
        return "Color all four side";
    }
    public String toString(){
        return "Square has side = "+this.side;
    }
}
