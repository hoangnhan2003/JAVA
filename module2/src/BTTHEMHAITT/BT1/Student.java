package BTTHEMHAITT.BT1;

public class Student {
    private static int count = 1;
    private int id;
    private String name;
    private String birthday;
    private int sex;
    private String classOfStd;
    private double mark;



    public Student( String name, String birthday, int sex, String classOfStd, double mark) {
        this.id = count;
        this.birthday = birthday;
        this.sex = sex;
        this.classOfStd = classOfStd;
        this.mark = mark;
        this.name = name;
        count++;
    }
    public Student(){

    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", classOfStd='" + classOfStd + '\'' +
                ", mark=" + mark +
                '}';
    }


}
