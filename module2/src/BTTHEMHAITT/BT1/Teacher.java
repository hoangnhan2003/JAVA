package BTTHEMHAITT.BT1;

public class Teacher {
    private String id;
    private String name;
    private String birthday;
    private int sex;
    private String professional;

    public Teacher(String id, String name, String birthday, int sex, String professional) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", professional='" + professional + '\'' +
                '}';
    }
}
