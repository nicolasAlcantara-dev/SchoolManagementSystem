public class Student extends Person{
    String enrollmentNumber;
    String course;

    public Student(int age, String name, String address, String enrollmentNumber, String course) {
        super(age, name, address);
        this.enrollmentNumber = enrollmentNumber;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentNumber='" + enrollmentNumber + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
