package TestCodeGym.controller;

import TestCodeGym.model.DTChinhHang;
import TestCodeGym.service.Impl.DTChinhHangService;
import TestCodeGym.service.Impl.DTXachTayService;
import TestCodeGym.view.View;

import java.util.Scanner;

public class ControllerMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        View view = new View();
        DTChinhHangService dtChinhHangService = new DTChinhHangService();
        DTXachTayService dtXachTayService = new DTXachTayService();
        int mainSelect;
        do{
            view.mainMenu();
            mainSelect = Integer.parseInt(scanner.nextLine());
            switch (mainSelect){
                case 1:
                    int case1Select;
                    do{
                        System.out.println("1: Them dien thoai chinh hang");
                        System.out.println("2:them dien thoai xach tay ");
                        System.out.println("3:tro ve menu chinh");
                        case1Select = Integer.parseInt(scanner.nextLine());
                        if(case1Select ==1){
                            dtChinhHangService.add();
                        }
                        if(case1Select ==2){
                            dtXachTayService.add();
                        }
                    }while ( case1Select!=3);
                    break;
                case 2:
                    int case2Select;
                    do{
                        System.out.println("1: Xoa dien thoai chinh hang");
                        System.out.println("2:Xoa dien thoai chinh hang");
                        System.out.println("3:Tro ve menu chinh");
                        case2Select = Integer.parseInt(scanner.nextLine());
                        if(case2Select == 1){
                            int id;
                            System.out.println("Enter id");
                            id = Integer.parseInt(scanner.nextLine());
                            dtChinhHangService.delete(id);
                        }
                        if(case2Select ==2){
                            int id;
                            System.out.println("Enter id");
                            id = Integer.parseInt(scanner.nextLine());
                            dtChinhHangService.delete(id);
                        }
                    }while (case2Select!=3);
                    break;
                case 3:
                    int case3Select;
                    do{
                        System.out.println("1: Xem danh sach dien thoai chinh hang");
                        System.out.println("2:Xem danh sach dien thoai xach tay ");
                        System.out.println("3:tro ve menu chinh");
                        case3Select = Integer.parseInt(scanner.nextLine());
                        if(case3Select ==1){
                            dtChinhHangService.displayList();
                        }
                        if(case3Select ==2){
                            dtXachTayService.displayList();
                        }
                    }while ( case3Select!=3);
                    break;
                case 4:
                    int case4Select;
                    do{
                        System.out.println("1: Tim kiem dien thoai chinh hang");
                        System.out.println("2:Tim kiem dien thoai xach tay ");
                        System.out.println("3:tro ve menu chinh");
                        case4Select = Integer.parseInt(scanner.nextLine());
                        if(case4Select ==1){
                            int option1 ;
                            do{
                                int id4;
                                String namePhone4;
                                System.out.println("1:Tim kiem theo id");
                                System.out.println("2:Tim kiem theo ten dien thoai");
                                option1 = Integer.parseInt(scanner.nextLine());
                                if(option1 == 1){
                                    System.out.println("Enter id");
                                    id4 = Integer.parseInt(scanner.nextLine());
                                    int index = dtChinhHangService.search(id4);
                                    if(index!=-1){
                                        System.out.println("Dien thoai ban tim o vi tri "+ index);
                                    }
                                    else{
                                        System.out.println("Khong tim thay");
                                    }
                                }
                                if(option1 == 2){
                                    System.out.println("Enter name phone");
                                    namePhone4 = scanner.nextLine();
                                    int index = dtChinhHangService.search(namePhone4);
                                    if(index!=-1){
                                        System.out.println("Dien thoai ban tim o vi tri "+ index);
                                    }
                                    else{
                                        System.out.println("Khong tim thay");
                                    }
                                }
                            }while (option1!=3);

                        }
                        if(case4Select ==2){
                            int option2 ;
                            do{
                                int id5;
                                String namePhone5;
                                System.out.println("1:Tim kiem theo id");
                                System.out.println("2:Tim kiem theo ten dien thoai");
                                option2 = Integer.parseInt(scanner.nextLine());
                                if(option2 == 1){
                                    System.out.println("Enter id");
                                    id5 = Integer.parseInt(scanner.nextLine());
                                    int index = dtXachTayService.search(id5);
                                    if(index!=-1){
                                        System.out.println("Dien thoai ban tim o vi tri "+ index);
                                    }
                                    else{
                                        System.out.println("Khong tim thay");
                                    }
                                }
                                if(option2 == 2){
                                    System.out.println("Enter name phone");
                                    namePhone5 = scanner.nextLine();
                                    int index = dtXachTayService.search(namePhone5);
                                    if(index!=-1){
                                        System.out.println("Dien thoai ban tim o vi tri "+ index);
                                    }
                                    else{
                                        System.out.println("Khong tim thay");
                                    }
                                }
                            }while (option2!=3);
                        }
                    }while ( case4Select!=3);
                    break;
            }
        }while (mainSelect!= 5);
    }
}
