package Google;

import entity.concretes.User;

public class GoogleUser {
	
	public boolean isValid(User user) {
		
		System.out.println("Verified with Google system  " + user.getFirstName());
		return true;
	}
}
