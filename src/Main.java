
public class Main {

	public static void main(String[] args) {
		
		// I have created an instance of the IDandPasswords class, so that I can instantiate an object
		IDandPasswords idAndPass = new IDandPasswords();
		
		// This will return the hashmap than it will be sent to the Login Page
		LoginPage loginPage = new LoginPage(idAndPass.getLoginInfo());
		
	}

}
