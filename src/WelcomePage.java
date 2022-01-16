import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame theFrame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	
	// String userID is taken from LoginPage
	WelcomePage(String userID){
		
		welcomeLabel.setBounds(0, 0, 200, 35);
		welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
		welcomeLabel.setText("Hello " + userID);
		
		theFrame.add(welcomeLabel);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setSize(420, 420);
		theFrame.setLayout(null);
		theFrame.setVisible(true);
	}
}
