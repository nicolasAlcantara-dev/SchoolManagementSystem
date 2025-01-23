import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();

        Teacher yuri = new Teacher(23, "Yuri", "Cotia - SP", "Teacher", 2900, "Development");
        Teacher mario = new Teacher(30, "Mario", "Itapevi - SP", "Teacher", 3000, "English");

        Student nicolas = new Student(19, "Nicolas", "Embu - SP", "2DSM", "DSM");
        nicolas.setName("Nicolas Alcantara");
        Student vinicius = new Student(19, "Vinicius", "Embu - SP", "3DSM", "DSM");

        Employee simon = new Employee(35, "Simon", "Osasco - SP", "Coordenador de curso", 4000);

        person.add(yuri);
        person.add(mario);
        person.add(nicolas);
        person.add(vinicius);
        person.add(simon);


        for (Person i : person) {
            i.displayInformation();
            System.out.println("----------");
        }

    }
}