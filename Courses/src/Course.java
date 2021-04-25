
public class Course {

	public Course() {
		System.out.println("Sistem çalýþtý");
	}
	
	public Course(int id, String image, String name, String instructor, int percent) {
		this.id=id;
		this.image=image;
		this.name=name;
		this.instructor=instructor;
		this.percent=percent;
	}
	
	int id;
	String image;
	String name;
	String instructor;
	int percent;

}
