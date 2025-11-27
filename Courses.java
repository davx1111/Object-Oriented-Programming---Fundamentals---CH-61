import java.util.ArrayList;
import java.util.List;

public class Courses {
	
	//Añado atributos que se me solicita
	public class Course {
	    String courseName;
	    String professorName;
	    int year;
	    List<Student> students;
	    
	    public void enroll(Student student){
	        //TODO add the student to the collection
	     }

	     public void unEnroll(Student student){
	         //TODO remove this student from the collection
	         // Hint: check if that really is this student
	     }

	     public int countStudents(){
	         //TODO implement
	         return 0;
	     }
	     
	     public int bestGrade(){
	         //TODO implement
	         return 0;
	     }

}
