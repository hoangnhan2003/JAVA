package ss4;

import java.util.Scanner;

public class QuadracticEquation {
    int a,b,c;
    public  QuadracticEquation(){

    }
    public QuadracticEquation(int a,int b,int c){
        this.a = a;
        this.b =b;
        this.c =c;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4* this.a * this.c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        System.out.println("Enter c");
        c = scanner.nextInt();
        QuadracticEquation element = new QuadracticEquation(a,b,c);
        double delta = element.getDiscriminant();
        if(delta > 0){
            System.out.println("Nghiem 1 = " + element.getRoot1());
            System.out.println("Nghiem 2 = "+ element.getRoot2());
        }
        else if(delta ==0){
            System.out.println("Phuong trinh co nghiem kep = "+ element.getRoot1());
        }
        else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
