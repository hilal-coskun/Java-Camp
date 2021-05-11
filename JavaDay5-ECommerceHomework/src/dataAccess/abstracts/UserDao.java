package dataAccess.abstracts;

import java.util.List;

import entity.concretes.User;

public interface UserDao {
	
	void register(User user);
	void login(User user);
	void delete(User user);
	List<User> getAll();
	
}
