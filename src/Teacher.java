public class Teacher extends Employee{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(int age, String name, String address, String jobTitle, double salary, String subject) {
        super(age, name, address, jobTitle, salary);
        this.subject = subject;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.printf(
                "Subject: %s%n",
                subject
        );
    }
}
