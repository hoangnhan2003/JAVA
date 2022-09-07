package BTTHEMHAITT.BT1.service.impl;

import BTTHEMHAITT.BT1.model.Student;
import BTTHEMHAITT.BT1.repository.impl.ArrStudent;
import BTTHEMHAITT.BT1.service.Service;

import java.util.Scanner;

public class ServiceStudent implements Service<Student> {
    private static Scanner scanner = new Scanner(System.in);
    ArrStudent repositoryStd;
    public ServiceStudent(){
        repositoryStd = new ArrStudent();
    }

    @Override
    public void add(Student element) {
        repositoryStd.addStd(element);
    }

    @Override
    public void remove(int index) {
        repositoryStd.removeStd(index);
    }

    @Override
    public void display() {
        repositoryStd.display();
    }
    public Student infomation(){
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
        return newStudent;
    }
}
