package swing2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame(); 
		frame.setSize(700, 700);
		frame.setTitle("my first demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.setVisible(true);
		
		JLabel label1 = new JLabel("Hello world!", JLabel.CENTER);
		//label1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label1);
				
	}

}
