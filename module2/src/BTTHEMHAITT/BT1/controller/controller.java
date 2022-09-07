package BTTHEMHAITT.BT1.controller;

import BTTHEMHAITT.BT1.model.Student;
import BTTHEMHAITT.BT1.model.Teacher;
import BTTHEMHAITT.BT1.service.impl.ServiceStudent;
import BTTHEMHAITT.BT1.service.impl.ServiceTeacher;

import java.util.Scanner;

public class controller {
    public static int Select(){
        Scanner scanner = new Scanner(System.in);
        int select;
        System.out.println("---------------MENU----------------------");
        System.out.println("0.Quit");
        System.out.println("1:Add student");
        System.out.println("2:Add teacher");
        System.out.println("3:Remove 1 student");
        System.out.println("4:Remove 1 teacher");
        System.out.println("5:Display student list ");
        System.out.println("6:Display teacher list");
        select = Integer.parseInt(scanner.nextLine());
        return select;
    }
    public static void MENU(ServiceStudent arrStd, ServiceTeacher arrTeacher){
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            select = Select();
            switch (select){
                case 1:
                    int quantity;
                    System.out.println("Enter amount of student");
                    quantity = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < quantity; i++) {
                        Student newStudent = arrStd.infomation();
                        arrStd.add(newStudent);

                    }
                    break;
                case 2:
                    int amount;
                    System.out.println("Enter amount of teacher");
                    amount = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < amount; i++) {
                       Teacher newTeacher = arrTeacher.infomation();
                        arrTeacher.add(newTeacher);
                    }
                    break;
                case 3:
                    int index;
                    System.out.println("Enter index you want to delete");
                    index = Integer.parseInt(scanner.nextLine());
                    arrStd.remove(index);
                    break;
                case 4:
                    int index2;
                    System.out.println("Enter index you want to delete");
                    index2 = Integer.parseInt(scanner.nextLine());
                    arrTeacher.remove(index2);
                    break;
                case 5:
                    arrStd.display();
                    break;
                case 6:
                    arrTeacher.display();
                    break;
            }
        }while (select!=0);
    }
    public static void main(String[] args) {
        ServiceTeacher serviceTeacher = new ServiceTeacher();
        ServiceStudent serviceStudent = new ServiceStudent();
        MENU(serviceStudent,serviceTeacher);
    }
}
