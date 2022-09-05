package BTTHEMHAITT.BT1.controller;

import BTTHEMHAITT.BT1.model.Student;
import BTTHEMHAITT.BT1.model.Teacher;
import BTTHEMHAITT.BT1.repository.ArrTeacher;
import BTTHEMHAITT.BT1.service.ServiceStudent;
import BTTHEMHAITT.BT1.service.ServiceTeacher;

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
                        String name,birthday,classroom;
                        int sex;
                        double mark;
                        System.out.println("Enter name:");
                        name = scanner.nextLine();
                        System.out.println("Enter date of birth:");
                        birthday = scanner.nextLine();
                        System.out.println("Enter sex:");
                        System.out.println("1:Male");
                        System.out.println("2:Female");
                        System.out.println("3:Other");
                        sex = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter classroom");
                        classroom = scanner.nextLine();
                        System.out.println("Enter mark");
                        mark = Double.parseDouble(scanner.nextLine());
                        Student newStudent = new Student(name,birthday,sex,classroom,mark);
                        arrStd.add(newStudent);

                    }
                    break;
                case 2:
                    int amount;
                    System.out.println("Enter amount of student");
                    amount = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < amount; i++) {
                        String id,name,birthday1,classOfTeacher,profession;
                        int sex;
                        System.out.println("Enter id:");
                        id = scanner.nextLine();
                        System.out.println("Enter name");
                        name = scanner.nextLine();
                        System.out.println("Enter birthday:");
                        birthday1 = scanner.nextLine();
                        System.out.println("Enter sex:");
                        System.out.println("1:Male");
                        System.out.println("2:Female");
                        System.out.println("3:Other");
                        sex = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter classroom");
                        classOfTeacher = scanner.nextLine();
                        System.out.println("Enter professional:");
                        profession = scanner.nextLine();
                        Teacher newTeacher = new Teacher(id,name,birthday1,sex,profession);
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
