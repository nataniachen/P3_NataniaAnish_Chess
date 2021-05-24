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

	BufferedImage wknight;
	BufferedImage wknight2;
	
	BufferedImage wrook;
	BufferedImage wrook2;
	
	BufferedImage wbishop;
	BufferedImage wbishop2;
	
	BufferedImage wpawn;
	BufferedImage wpawn1;
	BufferedImage wpawn2;
	BufferedImage wpawn3;
	BufferedImage wpawn4;
	BufferedImage wpawn5;
	BufferedImage wpawn6;
	BufferedImage wpawn7;
	BufferedImage wpawn8;
	
	BufferedImage wqueen;
	BufferedImage wking;
	
	
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
	   
		g.drawImage(wpawn, 0,  602,  100,  95, this);
		g.drawImage(wpawn2, 100,  602,  100,  95, this);
		g.drawImage(wpawn3, 200,  602,  100,  95, this);
		g.drawImage(wpawn4, 300,  602,  100,  95, this);
		g.drawImage(wpawn5, 400,  602,  100,  95, this);
		g.drawImage(wpawn6, 500,  602,  100,  95, this);
		g.drawImage(wpawn7, 600,  602,  100,  95, this);
		g.drawImage(wpawn8, 700,  602,  100,  95, this);
		
	    g.drawImage(wknight, 100, 705, 100, 90, this);
	    g.drawImage(wknight2,  600,  705, 100, 90,  this);
	    
	    g.drawImage(wrook,  0,  695,  100, 100, this);
	    g.drawImage(wrook2,  700,  695,  100, 100, this);
	    
	    g.drawImage(wbishop,  200,  700,  100, 100, this);
	    g.drawImage(wbishop2,  500,  700,  100, 100, this); 
	    
	    g.drawImage(wqueen,  300,  700,  100, 100, this);
	    g.drawImage(wking,  400,  700,  100, 100, this); 
	}
	
	public Driver() {
				wknight = createImg("images/knight.png");
				wknight2 = createImg("images/knight.png");
				
				wrook = createImg("images/rook.png");
				wrook2 = createImg("images/rook.png");
				
				wbishop = createImg("images/bishop.png");
				wbishop2 = createImg("images/bishop.png");
				
				wpawn = createImg("images/pawn.png");
				wpawn2 = createImg("images/pawn.png");
				wpawn3 = createImg("images/pawn.png");
				wpawn4 = createImg("images/pawn.png");
				wpawn5 = createImg("images/pawn.png");
				wpawn6 = createImg("images/pawn.png");
				wpawn7 = createImg("images/pawn.png");
				wpawn8 = createImg("images/pawn.png");
				
				wqueen = createImg("images/queen.png");
				wking = createImg("images/king.png");
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