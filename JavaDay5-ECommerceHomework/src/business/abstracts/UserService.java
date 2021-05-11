package business.abstracts;

import java.util.List;

import entity.concretes.User;

public interface UserService{

	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	boolean validateEmail(User user);
	boolean isUser(User user);
	

	List<User> getAll();
}
