
public class Gamer extends User{
	
	String email;
	int id;
	
	public Gamer() {
		
	}
	
	public Gamer(String email, int id, String tcNo, String firstName, String lastName, int birthDate) {
		super(tcNo, firstName, lastName, birthDate);
		this.email = email;
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
