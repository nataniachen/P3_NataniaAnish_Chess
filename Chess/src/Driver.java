import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Driver extends JPanel{

	BufferedImage knight;
	BufferedImage rook;
	BufferedImage bishop;
	BufferedImage pawn;
	
	
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
	   
	    g.drawImage(knight, 100, 700, 100, 100, this);
	    g.drawImage(knight,  600,  700, 100, 100,  this);
	    g.drawImage(rook,  0,  700,  100, 100, this);
	    g.drawImage(rook,  700,  700,  100, 100, this);
	}
	
	public Driver() {
				knight = createImg("images/knight.png");
				rook = createImg("images/rook.png");
				bishop = createImg("images/bishop.png");
				pawn = createImg("images/pawn.png");
	}
	
	public BufferedImage createImg(String a) {
		try {
			return ImageIO.read(new File(a));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("WEEWOOOOOOOOOOOOO", SwingConstants.CENTER);
		frame.setLayout(new GridLayout());
		frame.setSize(800, 800);
		
		frame.getContentPane().add(new Driver());
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.LIGHT_GRAY);
		
		frame.setVisible(true);
		

	}
	

}