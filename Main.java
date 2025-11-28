

public class Main {

    public static void main(String[] args) {
        
        // Crear estudiantes
        Student student1 = new Student("David", "Carranco", 1001, 85, 2);
        Student student2 = new Student("Yerania", "González", 1002, 55, 1);
        Student student3 = new Student("Carlos", "Castilla", 1003, 75, 2);
        
        // Probar métodos de Student
        System.out.println("Pruebas Student");
        student1.printFullName();
        System.out.println("¿Aprobado? " + student1.isApproved());
        student1.changeYearIfApproved();
        
        // Crear curso
        System.out.println("Pruebas Course");
        Courses curso = new Courses("Programación Java", "Prof. Rodríguez", 2024);
        
        // Inscribir un estudiante
        curso.enroll(student1);
        
        // Inscribir múltiples estudiantes (sobrecarga)
        Student[] grupo = {student2, student3};
        curso.enroll(grupo);
        
        // Verificar resultados
        System.out.println("\nTotal estudiantes: " + curso.countStudents());
        System.out.println("Mejor calificación: " + curso.bestGrade());
        
        // Dar de baja
        curso.unEnroll(student2);
        System.out.println("Total después de baja: " + curso.countStudents());
    }
}