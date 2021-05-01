
public class Student extends User{

	String addCourse;
	String studentNumber;

	public Student() {
		
	}
	

	public Student(int id, String firstName, String lastName, String addCourse,String studentNumber) {
		super(id, firstName, lastName);
		this.addCourse = addCourse;
		this.studentNumber = studentNumber;
	}
	
	
	public String getAddCourse() {
		return addCourse;
	}
	public void setAddCourse(String addCourse) {
		this.addCourse = addCourse;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}
