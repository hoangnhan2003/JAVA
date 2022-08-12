package ss5;

public class Point {
    protected float x =0;
    protected float y =0;
    public Point (){

    }
    public Point(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x =x;
        this.y =y;
    }
    public float[] getXY(){
        float[] XY = {this.x,this.y};
        return XY;
    }
    public String toString(){
        return "Coordinate x ="+this.x + " y = "+this.y;
    }

    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point.toString());
        point.setXY(3,4);
        System.out.println(point.toString());
        MovablePoint movePoint = new MovablePoint(5,6,1,1);
        movePoint.setSpeed(2,3);
        System.out.println(movePoint.toString());
    }
}
class MovablePoint extends Point{
    private float xSpeed = 0;
    private float ySpeed =0;
    public MovablePoint(){

    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {this.xSpeed,this.ySpeed};
        return speed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void Move(){
        this.x +=  this.xSpeed;
        this.y += this.ySpeed;
    }
    @Override
    public String toString(){
        return super.toString() +" \n Speedx = "+this.xSpeed+"\t Speedy = "+this.ySpeed;
    }
}
