import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.HipernateUserDao;
import entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		
	User hilal = new User("Hilal","Coskun","hilal@gmail.com","12sidsfred");
	User hilal2 = new User("Hilal2","Coskun2","hilal1@gmail.com","123dsdsifre");
	
	UserService userService = new UserManager(new HipernateUserDao());
	userService.register(hilal);
	userService.register(hilal2);
	}

}
