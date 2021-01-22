package Tutorials.basic;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int number = 5;
		
		JFrame window = new JFrame();
		//create our window
		window.setSize(600, 800);
		window.setTitle("My Jawn");
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Kate Fucking Rocks");
		
		window.add(label);
		
	}

}
