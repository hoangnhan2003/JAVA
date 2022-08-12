package ss5;

public class Point2D {
    private float x  = 0;
    private float y =0;
    public Point2D(){

    }
    public Point2D(float x ,float y){
        this.x =x;
        this.y = y;
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
        return XY ;
    }
    public String toString(){
        return  "Coordinate x = "+ this.x+"x = "+this.y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        float[] ar2D = point2D.getXY();

        Point3D point3d = new Point3D(1,2,3);
        point3d.setXYZ(2,3,4);

        float[] arr = point3d.getXYZ();
        for(float x:arr){
            System.out.println(x);
        }
    }
}
class Point3D extends Point2D{
    private float x,y;
    private float z = 0;
    public Point3D(){

    }
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ = {super.getX(),super.getY(),this.z};
        return XYZ;

    }
}
