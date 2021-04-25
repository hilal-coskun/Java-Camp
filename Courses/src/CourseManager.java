
public class CourseManager {

	public void addCourse(Course course) {
		
		System.out.println("Kurs Bilgileri:    Name: "+course.name+" Instructor: "+course.instructor+" Course percent: "+course.percent);
	}
	
	public void finish(Course course){
		
		if(course.percent!=0) {
			System.out.println(course.name+":  You started the cours");
		}
		else {
			System.out.println(course.name+":  You haven't started the course yet.");
		}
	}
}
