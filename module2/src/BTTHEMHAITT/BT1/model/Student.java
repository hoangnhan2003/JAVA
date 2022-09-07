package BTTHEMHAITT.BT1.model;

public class Student extends Person{

    private String classOfStd;
    private double mark;

    public Student( String name,String dateOfBirth, int sex, String classOfStd, double mark) {
        super( name, dateOfBirth, sex);
        this.classOfStd = classOfStd;
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" +
                ", name='" + super.getName() + '\'' +
                ", birthday='" + super.getDateOfBirth() + '\'' +
                ", sex=" + super.getSex() +
                ", classOfStd='" + classOfStd + '\'' +
                ", mark=" + mark +
                '}';
    }


}
