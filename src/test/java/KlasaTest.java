import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class KlasaTest {

    private LinkedList<Student> createStudents() {
        LinkedList<Student> students = new LinkedList<>();
        Student student1 = new Student("Ivan", "Ivanow", 1);
        Student student2 = new Student("Petr", "Petrow", 2);
        Student student3 = new Student("Anna", "Sidorowa", 3);
        Student student4 = new Student("Olga", "Surowa", 4);
        Student student5 = new Student("Denis", "Denisow", 5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    }

    @Test
    public void increaseStudentNumberAfterAdding() {
        //given
        LinkedList<Student> students = createStudents();
        Teacher teacher = new Teacher("Pavel", "Pavlov");
        Klasa klasa = new Klasa(students, teacher);

        //when
        Student student6 = new Student ("Boris", "Borisov", 6);
        klasa.addStudent(student6);

        //then
        assertEquals(6, klasa.getStudents().size());
    }

    @Test
    public void deleteStudent() {
        //given
        LinkedList<Student> students = createStudents();
        Teacher teacher = new Teacher("Pavel", "Pavlov");
        Klasa klasa = new Klasa(students, teacher);

        //when
       klasa.deleteStudents(5);

       //then
        assertEquals(4, klasa.getStudents().size());

    }

}