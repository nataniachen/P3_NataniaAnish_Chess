import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Driver extends JPanel{
	Piece[][] board = new Piece[8][8];
	
	//white pieces
	Rook wrook1 = new Rook(57, "white");
	Rook wrook2 = new Rook(64, "white");
	
	Knight wknight1 = new Knight(58, "white");
	Knight wknight2 = new Knight(63, "white");
	
	
	Bishop wbishop1 = new Bishop(59, "white");
	Bishop wbishop2 = new Bishop(62, "white");
	
	Pawn wpawn1 = new Pawn(51, "white");
	Pawn wpawn2 = new Pawn(52, "white");
	Pawn wpawn3 = new Pawn(53, "white");
	Pawn wpawn4 = new Pawn(54, "white");
	Pawn wpawn5 = new Pawn(55, "white");
	Pawn wpawn6 = new Pawn(56, "white");
	Pawn wpawn7 = new Pawn(57, "white");
	Pawn wpawn8 = new Pawn(58, "white");

	Queen wqueen = new Queen(4, "white");
	King wking = new King(3, "white");
	
	//black pieces
	Knight bknight1 = new Knight(2, "black");
	Knight bknight2 = new Knight(7, "black");
	
	Rook brook1 = new Rook(1, "black");
	Rook brook2 = new Rook(8, "black");
	
	Bishop bbishop1 = new Bishop(3, "black");
	Bishop bbishop2 = new Bishop(6, "black");
	
	Pawn bpawn1 = new Pawn(9, "black");
	Pawn bpawn2 = new Pawn(10, "black");
	Pawn bpawn3 = new Pawn(11, "black");
	Pawn bpawn4 = new Pawn(12, "black");
	Pawn bpawn5 = new Pawn(13, "black");
	Pawn bpawn6 = new Pawn(14, "black");
	Pawn bpawn7 = new Pawn(15, "black");
	Pawn bpawn8 = new Pawn(16, "black");
	
	Queen bqueen = new Queen(4, "black");
	King bking = new King(3, "black");
	
	int turn = 0;
	static Point[] move = new Point[2];
	
	
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
		drawPieces(g);
	}
	
	public void drawPieces(Graphics g) {
		g.drawImage(wpawn1.getImage(), 0,  602,  100,  95, this);
		g.drawImage(wpawn2.getImage(), 100,  602,  100,  95, this);
		g.drawImage(wpawn3.getImage(), 200,  602,  100,  95, this);
		g.drawImage(wpawn4.getImage(), 300,  602,  100,  95, this);
		g.drawImage(wpawn5.getImage(), 400,  602,  100,  95, this);
		g.drawImage(wpawn6.getImage(), 500,  602,  100,  95, this);
		g.drawImage(wpawn7.getImage(), 600,  602,  100,  95, this);
		g.drawImage(wpawn8.getImage(), 700,  602,  100,  95, this);
		
	    g.drawImage(wknight1.getImage(), 100, 705, 100, 90, this);
	    g.drawImage(wknight2.getImage(),  600,  705, 100, 90,  this);
	    
	    g.drawImage(wrook1.getImage(),  0,  695,  100, 100, this);
	    g.drawImage(wrook2.getImage(),  700,  695,  100, 100, this);
	    
	    g.drawImage(wbishop1.getImage(),  200,  700,  100, 100, this);
	    g.drawImage(wbishop2.getImage(),  500,  700,  100, 100, this); 
	    
	    g.drawImage(wqueen.getImage(),  400,  700,  100, 100, this);
	    g.drawImage(wking.getImage(),  300,  700,  100, 100, this); 
	    
	    //drawing the pieces on the other side
	    drawRotate(bking.getImage(), 400, 2, g);

	}
	
	public Driver() {
		board[0][0] = brook1;
		board[0][1] = bknight1;
		board[0][2] = bbishop1;
		board[0][3] = bqueen;
		board[0][4] = bking;
		board[0][5] = bbishop2;
		board[0][6] = bknight2;
		board[0][7] = brook2;
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		}
		
	}
	
	public void drawRotate(BufferedImage image, int x, int y, Graphics g) {
	    double rotationRequired = Math.toRadians (180);
		double locationX = image.getWidth() / 2;
		double locationY = image.getHeight() / 2;
		AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
	    g.drawImage(op.filter(image, null), x, y, 100, 100, this);
		
	}
	
	//main method
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
		
		frame.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (move[0] == null) {
					move[0] = MouseInfo.getPointerInfo().getLocation();
					System.out.println(move[0].toString());
				}
				else if (move[1] == null) {
					move[1] = MouseInfo.getPointerInfo().getLocation();
					System.out.println(move[1].toString());
				}
				else {
					move[0] = null;
					move[1] = null;
					System.out.println("Reset the move.");
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
	}
	

}