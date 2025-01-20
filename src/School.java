public class School {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Teacher mario = new Teacher(24, "Yuri", "Cotia - SP", "Teacher", 2900, "Development");
        Teacher yuri = new Teacher(30, "Mario", "Itapevi - SP", "Teacher", 3000, "English");

        Student nicolas = new Student(19, "Nicolas", "Embu - SP", "2DSM", "DSM");
        Student vinicius = new Student(19, "Nicolas", "Embu - SP", "3DSM", "DSM");

        Employee simon = new Employee(35, "Simon", "Osasco - SP", "Coordenador de curso", 4000);

        
    }
}