import java.util.LinkedList;
import java.util.List;

public class Klasa {

    private Teacher teacher;
    private List<Student> students = new LinkedList<>();

    public Klasa(List<Student> students, Teacher teacher) {
        this.teacher = teacher;
        this.students = students;
    }

    public Klasa() {

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void deleteStudents( int i) {
        students.remove(i-1);
    }
}




