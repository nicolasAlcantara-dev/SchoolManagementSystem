public abstract class Person {
    private int age;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name, String address) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.age = age;
        this.name = name;
        this.address = address;
    }


    public void displayInformation() {
        System.out.printf(
                "Name: %s%nAge: %d%nAddress: %s%n",
                name, age, address
        );
    }
}
