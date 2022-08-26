package inheritanceTask;

public class Instructor extends User {
	private String[] publishedCourses;
	private int studentNumber;
	public String[] getPublishedCourses() {
		return publishedCourses;
	}
	public void setPublishedCourses(String[] publishedCourses) {
		this.publishedCourses = publishedCourses;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
