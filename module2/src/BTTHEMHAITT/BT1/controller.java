package BTTHEMHAITT.BT1;

import java.util.Scanner;

public class controller {
    public static int select(){
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
    public static void MENU(ArrStudent arrStd,ArrTeacher arrTeacher){
        Scanner scanner = new Scanner(System.in);
        int select = select();
        do {
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
                        arrStd.addStd(newStudent);

                    }
                    break;
                case 2:
                    break;
                case 3:
                    int index;
                    System.out.println("Enter index you want to delete");
                    index = Integer.parseInt(scanner.nextLine());
                    arrStd.removeStd(index);
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
        ArrStudent<Student> arrStd = new ArrStudent<>();
        Student std1 = new Student("Nhan","21/12/2012",1,"A05",8.5);
        Student std2 = new Student("Nhan2","21/12/2012",1,"A05",9.5);
        ArrTeacher<Teacher> arrTeacher = new ArrTeacher<>();
        Teacher teacher1 = new Teacher("1232","asfa","21/2/2001",1,"Tutor");
        arrTeacher.addTeacher(teacher1);
        arrTeacher.display();
        arrStd.addStd(std1);
        arrStd.addStd(std2);
        arrStd.display();


    }
}
