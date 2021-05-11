package googleMicroService;

public class GoogleLogManager {

	public void login(String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Signed in with Google.");
		}
	}
}
