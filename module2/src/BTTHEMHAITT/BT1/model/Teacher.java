package BTTHEMHAITT.BT1.model;

public class Teacher extends Person{

    private String professional;

    public Teacher(String name, String birthday, int sex, String professional) {
        super(name,birthday,sex);
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Teacher{" +

                ", name='" + super.getName() + '\'' +
                ", birthday='" + super.getDateOfBirth() + '\'' +
                ", sex=" + getSex() +
                ", professional='" + professional + '\'' +
                '}';
    }
}
