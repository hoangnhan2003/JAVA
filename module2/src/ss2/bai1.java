package ss2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lựa chọn của bạn");
        System.out.println("1: In hình chữ nhật");
        System.out.println("2: In hình tam giác vuông cạnh góc vuông ở botton- left");
        System.out.println("3: In hình tam giác vuông cạnh góc vuông ở top-left");
        System.out.println("0: Thoát chương trình");
        int select ;
        do{
            select = scanner.nextInt();
            switch (select){
                case 0:
                    break;
                case 1:
                    hcn();
                    break;
                case 2:
                    tgv();
                    break;
                case 3:
                    tgv2();
                    break;
            }
        }while (select > 3 || select <0);

    }
    static void hcn(){
        for(int i=0;i<3;i++){
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
        }
    }
    static void tgv(){
        int flag =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j<=flag){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            flag++;
            System.out.println();
        }
    }
    static void tgv2(){
        int flag =4;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j<=flag){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            flag--;
        }
    }
}
