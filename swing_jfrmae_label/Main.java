package swing2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {

		// class Person
		// private String m_fname
		// private String m_lname
		// private int m_age
		// ctor with (m_fname, m_lname, m_age)
		// getter + setter for all 3
		// create toString
		
		// in main:
		// scanner.next() --> fname
		// scanner.next() --> lname
		// scanner.nextInt() --> age
		// create new Person with this values (hint: use ctor)
		// create a JFrame
		// create a label
		// put the toString of the person into the label
		// hint: String toString1 = person.toString();
		// label = new JLabel(toString1)
		
		
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
