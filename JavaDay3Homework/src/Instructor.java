
public class Instructor extends User{
	
	String category;
	String givenCourse;
	

	public Instructor(int id, String firstName, String lastName, String category,String givenCourse) {
		super(id, firstName, lastName);
		this.category = category;
		this.givenCourse = givenCourse;
	}
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGivenCourse() {
		return givenCourse;
	}
	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	
	
}
