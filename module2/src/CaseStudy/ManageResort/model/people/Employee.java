package CaseStudy.ManageResort.model.people;

import java.io.Serializable;

public class Employee extends Person  {
    private String employeeCode;
    private String academicLevel;
    private String jobPos;
    private float salary;

    public Employee(String name, int sex, String dateOfBirth, String identifyCard, String numberPhone, String employeeCode, String academicLevel, String jobPos, float salary) {
        super(name, sex, dateOfBirth, identifyCard, numberPhone);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.jobPos = jobPos;
        this.salary = salary;
    }

    public Employee(String name) {
        super(name);
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getJobPos() {
        return jobPos;
    }

    public void setJobPos(String jobPos) {
        this.jobPos = jobPos;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                super.getName() + ',' +
                super.getSex() + ','+
                super.getDateOfBirth() + ',' +
                super.getIdentifyCard() + ',' +
                super.getNumberPhone() + ',' +
                employeeCode + ',' +
                academicLevel + ',' +
                jobPos + ',' +
                salary +'\n';
    }
    public String display(){
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", identifyCard='" + getIdentifyCard() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                "employeeCode='" + employeeCode + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", jobPos='" + jobPos + '\'' +
                ", salary=" + salary +
                '}';
    }
}
