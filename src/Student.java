public class Student extends Person{
    String enrollmentNumber;
    String course;

    public Student(int age, String name, String address, String enrollmentNumber, String course) {
        super(age, name, address);
        this.enrollmentNumber = enrollmentNumber;
        this.course = course;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.printf(
                "Enrollment Number: %s%nCourse: %s%n",
                enrollmentNumber, course
        );

    }
}
