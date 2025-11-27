
public class Student {

	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       //Constructor 1 según ej.
	       public Student (String firstName, String lastName, int registration, int grade, int year) { 
	    	   this.firstName = firstName;
	           this.lastName = lastName;
	           this.registration = registration;
	           this.grade = grade;
	           this.year = year;
	       }
	    	   
	       //Constructor 2 según ej 
	       public Student(String firstName, String lastName, int registration) {
	           this(firstName, lastName, registration, 0, 1);
	       }
	       
	       //Constructor 3
	       public Student(String firstName, String lastName) {
	           this(firstName, lastName, 0, 0, 1);
	       }

	    	   
	       public void printFullName(){
	    	      System.out.println(firstName + " " + lastName);
	    	   }

	    	   public boolean isApproved(){
	    	       return grade >= 60;
	    	   }
	    	   
	    	   //Aquí estamos verificando si el student aprobó
	    	   
	    	   public int changeYearIfApproved(){
	    	       if (grade>=60) {
	    	    	   year = year + 1;
	    	       System.out.println("Congratulations!");
	    	   }
	    	       return year;
	   
	}//Main

}//Class
