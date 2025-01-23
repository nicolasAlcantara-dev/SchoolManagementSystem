public class Employee extends Person{
    private String jobTitle;
    private double salary;


    public Employee(int age, String name, String address, String jobTitle, double salary) {
        super(age, name, address);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.printf(
                "Job Title: %s%nSalary: $%,.2f%n",
                jobTitle, salary
        );

    }
}
