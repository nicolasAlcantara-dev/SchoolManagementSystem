public class Employee extends Person{
    String jobTitle;
    double salary;

    public Employee(int age, String name, String address, String jobTitle, double salary) {
        super(age, name, address);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.printf(
                "Title: %s%nSalary: $%,.2f%n",
                jobTitle, salary
        );

    }
}
