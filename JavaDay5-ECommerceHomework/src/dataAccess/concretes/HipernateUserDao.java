package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class HipernateUserDao implements UserDao{
	
	List<User> users= new ArrayList<User>();

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Click on the confirmation link sent to your e-mail address for successful registration.");
		
	}

	@Override
	public void login(User user) {
		System.out.println("Successful login");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public void delete(User user) {
		
	}

	
	
	

}





