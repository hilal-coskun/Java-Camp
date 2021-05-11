package business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userdao;
	
	public UserManager(UserDao userdao) {
		this.userdao = userdao;
	}

	
	@Override
	public void register(User user) {
		if(!validateEmail(user)) {
			System.out.println("The e-mail field must be in e-mail format.");
			return;
		}else if((user.getFirstName().length()<3) || (user.getLastName().length() < 3)) {
			System.out.println("Name and Surname must contain at least two characters.");
		}else if(user.getPassword().length()>6){
			System.out.println("The password must be at least 6 characters.");
			
		}else {
			System.out.println("Registration Successful");
		}
		
	}
	

	@Override
	public void login(User user) {
		for(User users:this.userdao.getAll()) {
			if(!(users == user)) {
				System.out.println("There is no such user. You must register.");
			}else if(isUser(user)) {
				System.out.println("You have successfully logged into the system.");
			}
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("The user has been updated.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("The user has been deleted.");
		
	}
	

	@Override
	public boolean isUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		return null;
	}


	@Override
	public boolean validateEmail(User user) {
			final Pattern EMAILREGEX = Pattern.compile(
					"[a-z0-9!#$%&'*+/=?^{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
					Pattern.CASE_INSENSITIVE);

			return EMAILREGEX.matcher(user.getEmail()).matches();
	
	}
	
	
	

/*
	@Override
	public List<User> getAll() {
		return null;
	}
	

	@Override
	public boolean checkLogin(User user) {
		return false;
	}

	@Override
	public boolean checkFirstName(User user) {
		
		Pattern patternFN = Pattern.compile("^(?=.*[A-Z].*[a-z]{1,}).{2,}$");
		String firstN= user.getFirstName();
		
		Matcher matcher= patternFN.matcher(firstN);
		boolean matchFound = matcher.find();
		if(matchFound) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean checkLastName(User user) {
		Pattern patternLN = Pattern.compile("^(?=.*[A-Z].*[a-z]{1,}).{2,}$");
		String lastN= user.getLastName();
		
		Matcher matcher= patternLN.matcher(lastN);
		boolean matchFound = matcher.find();
		if(matchFound) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkPassword(User user) {
		Pattern patternPS = Pattern.compile("^(?=.*[A-Z]{1,})(?=.*[!@#$&*]{1,})(?=.*[0-9]{1,})(?=.*[a-z]{1,}).{6,}$");
	    Matcher matcher = patternPS.matcher(user.getPassword());
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	    	return true;
	    } else {
	    	return false;
	    }
	}

	@Override
	public boolean checkEmail(User user) {
		String value = user.getEmail();
		List<String> emails= new ArrayList<String>();
		emails.add("hilal.coskun20@gmail.com");
		emails.add("hilal.coskun@gmail.com");
		emails.add("hilal@gmail.com");
		
		boolean login= emails.contains(value);
		if(!login && checkEmail(user)) {
			emails.add(value);
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void verified(User user) {
		
		if(checkEmail(user) && checkPassword(user) && checkFirstName(user) && checkLastName(user)) {
			userdao.register(user);
		}else {
			System.out.println("Unsuccessful login");
		}
	}


	@Override
	public void loginGoogle() {
		
	}


	@Override
	public void login(User user) {
		if(user.getEmail()==null || user.getPassword()==null) {
			System.out.println("Email and password are required");
			return;
		}
		
		userdao.login(user);
		
	}

	@Override
	public void delete(User user) {
		userdao.delete(user);
		
	}

	@Override
	public void emailConfirm() {
		System.out.println("Email verified....");
	}
	
	
	
	*/
}
