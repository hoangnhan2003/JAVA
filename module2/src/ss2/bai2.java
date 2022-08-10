package ss2;
import java.math.*;
public class bai2 {
    public static void main(String[] args) {
        int flag =0;
        for (int i = 0; i > -1 ; i++) {
            if(flag == 20){
                break;
            }
            if(check(i)){
                System.out.println(i);
                flag++;
            }
        }
        System.out.println("Cac so nguyen to nho hon 100");
        for (int i = 0; i < 100; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check(int x){
        if(x < 2){
            return false;
        }
        for (int i = 2; i <=  Math.sqrt(x); i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
