package BTTHEMHAITT.BT1.model;

public abstract class Person {

    private String name;
    private String dateOfBirth;
    private int sex;

    @Override
    public String toString() {
        return "Person{" +

                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Person( String name, String dateOfBirth, int sex) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }



}
