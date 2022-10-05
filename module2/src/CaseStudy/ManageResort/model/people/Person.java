package CaseStudy.ManageResort.model.people;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int sex;
    private String dateOfBirth;
    private String identifyCard;
    private String numberPhone;

    public Person(String name, int sex, String dateOfBirth, String identifyCard, String numberPhone) {
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.identifyCard = identifyCard;
        this.numberPhone = numberPhone;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identifyCard='" + identifyCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getIdentifyCard(), person.getIdentifyCard());
    }

}
