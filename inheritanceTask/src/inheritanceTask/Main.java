package inheritanceTask;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		 instructor.setFirstName("Engin");
		 instructor.setLastName("Demiroğ");
		 instructor.setStudentNumber(3606);
		 
		 Student student = new Student();
		 
		 student.setFirstName("Hüseyin");
		 student.setLastName("Kan");
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructorManager.info(instructor);
		studentManager.info(student);
		
		

	}

}
