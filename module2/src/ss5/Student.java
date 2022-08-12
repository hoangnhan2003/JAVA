package ss5;

public class Student {
    private String name;
    private String classes;
    public Student(String name, String classes){
        this.name  = name ;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Nhan","21TCLC_DT2");
        System.out.println("Name student is "+ std1.getName());
        System.out.println("Classes of student is "+ std1.getClasses());
        std1.setName("Hoang");
        System.out.println("Name student is "+ std1.getName());
    }
}
