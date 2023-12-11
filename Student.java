package OopsBasicPrograms;

public class Student {
    private   String name;
    private String age;
    private String id;

    public Student(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public static void main(String[] args) {
        String name = "khushi", age = "27", id = "1";
        Student student = new Student(name, age, id);
        System.out.println("student details" + student);
    }
}
