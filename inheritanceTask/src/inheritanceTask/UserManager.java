package inheritanceTask;

public class UserManager {
	public void add(User user){
		System.out.println(user.getFirstName() + " added");
	}
	public void info(User user) {
		System.out.println("first name: "+user.getFirstName());
		System.out.println("last name: "+user.getLastName());
	}
}
