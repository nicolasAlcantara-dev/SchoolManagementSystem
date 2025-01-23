public class Student extends Person{
    private String enrollmentNumber;
    private String course;

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(String enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

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
