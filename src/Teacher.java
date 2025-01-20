public class Teacher extends Employee{
    String subject;

    public Teacher(int age, String name, String address, String jobTitile, double salary, String subject) {
        super(age, name, address, jobTitile, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                ", jobTitile='" + jobTitile + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
