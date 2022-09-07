package BTTHEMHAITT.BT1.service.impl;

import BTTHEMHAITT.BT1.model.Teacher;
import BTTHEMHAITT.BT1.repository.impl.ArrTeacher;
import BTTHEMHAITT.BT1.service.Service;

import java.util.Scanner;

public class ServiceTeacher implements Service<Teacher> {
    private static Scanner scanner = new Scanner(System.in);
    ArrTeacher repositoryTeacher ;
    public ServiceTeacher(){
        repositoryTeacher = new ArrTeacher();
    }

    @Override
    public void add(Teacher element) {
        repositoryTeacher.add(element);
    }

    @Override
    public void remove(int index) {
        repositoryTeacher.remove(index);
    }

    @Override
    public void display() {
        repositoryTeacher.display();
    }

    @Override
    public Teacher infomation() {
        String name,birthday1,classOfTeacher,profession;
        int sex;
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
        Teacher newTeacher = new Teacher(name,birthday1,sex,profession);
        return newTeacher;
    }
}
