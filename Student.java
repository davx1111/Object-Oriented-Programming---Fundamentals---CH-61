
public class Student {

	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
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
