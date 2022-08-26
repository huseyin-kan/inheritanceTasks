package inheritanceTask;

public class InstructorManager extends UserManager {
	public void studentQuery(Instructor instructor) {
		System.out.println("You have "+instructor.getStudentNumber()+" students");
	}
	@Override
	public void info(User user) {
		System.out.println("first name: "+user.getFirstName());
		System.out.println("last name: "+user.getLastName());
		System.out.println("This method overrided from InstructorManager");
	}
}
