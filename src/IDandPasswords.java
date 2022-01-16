import java.util.HashMap;

public class IDandPasswords {
	
	// HashMap works perfectly here because it stores key value pairs
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	// These are the examples of the user names and passwords
	IDandPasswords(){
		loginInfo.put("Ichigo", "KillHollows");
		loginInfo.put("Naruto", "Ramen");
		loginInfo.put("Shikamaru", "whatadrag");
	}
	
	// This will get the login information
	// It is protected so that not just anyone can access the user names and passwords
	protected HashMap getLoginInfo(){
		return loginInfo;
	}

}
