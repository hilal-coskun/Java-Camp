




public class Main {

	public static void main(String[] args) {
		
		
		Student st1= new Student(1,"Hilal","Coşkun","Java","123456");
		
		Instructor ins1= new Instructor(1, "Engin", "Demiroğ", "Programlama","Java-React");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseAdd(st1);
		studentManager.addHomework(st1);
		UserManager userManagerStudent= new UserManager();
		userManagerStudent.login(st1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(ins1);
		userManagerStudent.login(ins1);
	}
}
