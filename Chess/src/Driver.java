import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Driver extends JPanel{

	public void paint(Graphics g) {
		int a = 1;
		Color c;
		for (int j = 0; j< 800; j+=100) {
			for (int i = 0; i < 800; i+=100) {
				//choose tile
				if (a % 2 == 1) {
					c = new Color(255, 204, 153);
				}
				else {
					c = new Color(255, 153, 102);
				}
				a++;
			
				g.setColor(c);
				g.fillRect(i,  j,  100,  100);
			}
			a++;
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("I'm a label in the window", SwingConstants.CENTER);
		frame.setLayout(new GridLayout());
		frame.setSize(800, 800);
		
		frame.getContentPane().add(new Driver());
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.LIGHT_GRAY);
		
		frame.setVisible(true);
	}

}