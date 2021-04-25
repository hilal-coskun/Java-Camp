public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course();
		course1.id=1;
		course1.image="";
		course1.name="Yazılım Geliştirici Yetiştirme Kampı C# - Angular";
		course1.instructor="Engin Demiroğ";
		course1.percent=0;
		
		Course course2=new Course(2,"","Yazılım Geliştirici Yetiştirme Kampı Java - React","Engin Demiroğ", 26);
		
		Course[] courses= {course1, course2};
		
		for(Course course: courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.finish(course1);
		courseManager.finish(course2);
	}

}
