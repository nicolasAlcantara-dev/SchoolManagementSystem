public class Person {
    int age;
    String name;
    String address;

    public Person(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void displayInformation() {
        System.out.printf(
                "Name: %s%nAge: %d%nAddress: %s%nJob",
                name, age, address
        );
    }
}
