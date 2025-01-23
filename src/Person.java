public abstract class Person {
    private int age;
    private String name;
    private String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(int age, String name, String address) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
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
