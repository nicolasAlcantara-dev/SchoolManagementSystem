public class Employee extends Person{
    String jobTitile;
    double salary;

    public Employee(int age, String name, String address, String jobTitile, double salary) {
        super(age, name, address);
        this.jobTitile = jobTitile;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", jobTitile='" + jobTitile + '\'' +
                ", salary=" + salary +
                '}';
    }
}
