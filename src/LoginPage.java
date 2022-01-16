import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame theFrame = new JFrame();
	JButton theButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPassword = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID: ");
	JLabel userPassLabel = new JLabel("password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	// This is the copy that will be globally available to all methods
	LoginPage(HashMap<String, String> loginInfoOriginal){
		
		loginInfo = loginInfoOriginal;
		
		// This sets the dimensions
		userIDLabel.setBounds(50,100, 75, 25);
		userPassLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC, 25));
		// This is where someone enters their user ID
		userIDField.setBounds(125, 100, 200, 25);
		userPassword.setBounds(125, 150, 200, 25);
		// Login Button
		// This will submit the information when the button is clicked
		theButton.setBounds(125, 200, 100, 25);
	    // This removes the border around the words that is inside the button
		theButton.setFocusable(false);
		// This is the action listener for the login button
		theButton.addActionListener(this);
		// Reset Button
		// This will submit the information when the button is clicked
	    resetButton.setBounds(225, 200, 100, 25);
	    resetButton.setFocusable(false);
		// This is the action listener for the reset button
		resetButton.addActionListener(this);
		//This displays the application
		theFrame.add(userIDLabel);
		theFrame.add(userPassLabel);
		theFrame.add(messageLabel);
		theFrame.add(userIDField);
		theFrame.add(userPassword);
		theFrame.add(theButton);
		theFrame.add(resetButton);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setSize(420, 420);
		theFrame.setLayout(null);
		theFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// When the reset button is clicked on, every text in the user name and password will be erased
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPassword.setText("");
		}
		// When the login button is clicked on
		if(e.getSource()==theButton) {
			String userID = userIDField.getText();
			// This will get the password and convert it into a string. Because JPasswordField is used
			String password = String.copyValueOf(userPassword.getPassword());
			
			if(loginInfo.containsKey(userID)) {// Enters correct user name and password
				if(loginInfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful!");
					// It gets rid of the welcome page once the username and password has been entered
					theFrame.dispose();
					// userID is used as an argument, so that the welcome page call you by the username
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {// Enters correct user name but incorrect password
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Incorrect Password!");
				}
			}
			else {// Enters incorrect user name and incorrect password
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found!");
			}
			
		}
	}
}
