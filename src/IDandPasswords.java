import java.util.HashMap;

public class IDandPasswords {
	
	// HashMap works perfectly here because it stores key value pairs
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	// These are the examples of the user names and passwords
	IDandPasswords(){
		loginInfo.put("youreHired22", "Coder123");
		loginInfo.put("Jeff97", "SurfsUp");
		loginInfo.put("Chun-li1991", "passLog");
	}
	
	// This will get the login information
	// It is protected so that not just anyone can access the user names and passwords
	protected HashMap getLoginInfo(){
		return loginInfo;
	}

}
