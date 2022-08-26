package inheritanceTask;

public class StudentManager extends UserManager{
	public void takeCourse() {
		System.out.println("Course has been taken");
	}
	@Override
	public void info(User user) {
		System.out.println("first name: "+user.getFirstName());
		System.out.println("last name: "+user.getLastName());
		System.out.println("This method overrided from StudentManager");
	}
}
