import java.util.ArrayList;
import java.util.List;

public class Courses {

    // Añado atributos que se me solicita
    String courseName;
    String professorName;
    int year;
    List<Student> students; // añado también lista students

    // Constructor
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    // Método inscripción de estudiante
    public void enroll(Student student) {
        students.add(student);
        System.out.println(student.firstName + " " + student.lastName +
                         " ha sido inscrito en " + courseName);
    }

    // Método para dar de baja a estudiantes
    public void unEnroll(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            System.out.println(student.firstName + " " + student.lastName +
                             " ha sido dado de baja en " + courseName);
        } else {
            System.out.println("No se encontró al estudiante en el curso");
        }
    }

    public int countStudents() {
        return students.size();
    }

    // Encontrar la mejor calificación
    public int bestGrade() {
        int best = 0;
        for (Student student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }
}
