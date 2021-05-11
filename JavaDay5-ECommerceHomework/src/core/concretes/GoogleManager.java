package core.concretes;

import core.abstracts.GoogleService;
import entity.concretes.User;
import googleMicroService.GoogleLogManager;

public class GoogleManager implements GoogleService{


	@Override
	public boolean logGoogle(User user) {
		
		GoogleLogManager googleLogManager= new GoogleLogManager();
		googleLogManager.login(user.getEmail(), user.getPassword());
		
		return true;
	}

	
	
}
