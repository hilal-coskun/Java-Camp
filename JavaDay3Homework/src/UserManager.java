
public class UserManager {
	
	public void login(Student student) {
		System.out.println(student.firstName+" "+student.lastName +" sisteme kullan�c� olarak ba�ar�yla giri� yapt�n�z.");
	}
	
	public void login(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" sisteme e�itmen olarak ba�ar�yla giri� yapt�n�z.");
	}

}
