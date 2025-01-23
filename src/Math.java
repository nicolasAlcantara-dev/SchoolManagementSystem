public class Math implements Subjects {

    @Override
    public void saySubject() {
        System.out.println("You are learning math.");
    }

    @Override
    public void teachSubject(Student student) {
        System.out.println(student.getName() + " is learning math.");
    }
}
