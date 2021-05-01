
public class UserManager {
	
	public void login(Student student) {
		System.out.println(student.firstName+" "+student.lastName +" sisteme kullanýcý olarak baþarýyla giriþ yaptýnýz.");
	}
	
	public void login(Instructor instructor) {
		System.out.println(instructor.firstName+" "+instructor.lastName+" sisteme eðitmen olarak baþarýyla giriþ yaptýnýz.");
	}

}
