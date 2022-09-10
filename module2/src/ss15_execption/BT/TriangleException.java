package ss15_execption.BT;

import java.util.Scanner;

public class TriangleException {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;
        try{
            int a,b,c;
            System.out.println("input edge A");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("input edge B");
            b = Integer.parseInt(scanner.nextLine());
            System.out.println("input edge C");
            c = Integer.parseInt(scanner.nextLine());
            if(a<0|| b<0||c<0||a+b<=c||a+c<=b||b+c<=a)
            throw new IllegalTriangleException();
        }
        catch (IllegalTriangleException e){
            System.out.println("Input invalid!!!!!");
        }

    }
}
