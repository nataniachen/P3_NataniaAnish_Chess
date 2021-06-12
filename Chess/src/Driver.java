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
import java.awt.event.MouseMotionListener;
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
	private static Piece[][] board = new Piece[8][8];
	
	//white pieces
	Rook wrook1 = new Rook(57, "white");
	Rook wrook2 = new Rook(64, "white");
	
	Knight wknight1 = new Knight(58, "white");
	Knight wknight2 = new Knight(63, "white");
	
	
	Bishop wbishop1 = new Bishop(59, "white");
	Bishop wbishop2 = new Bishop(62, "white");
	
	Pawn wpawn1 = new Pawn(49, "white");
	Pawn wpawn2 = new Pawn(50, "white");
	Pawn wpawn3 = new Pawn(51, "white");
	Pawn wpawn4 = new Pawn(52, "white");
	Pawn wpawn5 = new Pawn(53, "white");
	Pawn wpawn6 = new Pawn(54, "white");
	Pawn wpawn7 = new Pawn(55, "white");
	Pawn wpawn8 = new Pawn(56, "white");

	Queen wqueen = new Queen(60, "white");
	King wking = new King(61, "white");
	
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
	King bking = new King(5, "black");
	
	int turn = 0;
	
	
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
		g.drawImage(wpawn1.getImage(), wpawn1.getX(),  wpawn1.getY(),  100,  100, this);
		g.drawImage(wpawn2.getImage(), wpawn2.getX(),  wpawn2.getY(),  100,  100, this);
		g.drawImage(wpawn3.getImage(), wpawn3.getX(),  wpawn3.getY(),  100,  100, this);
		g.drawImage(wpawn4.getImage(), wpawn4.getX(),  wpawn4.getY(),  100,  100, this);
		g.drawImage(wpawn5.getImage(), wpawn5.getX(),  wpawn5.getY(),  100,  100, this);
		g.drawImage(wpawn6.getImage(), wpawn6.getX(),  wpawn6.getY(),  100,  100, this);
		g.drawImage(wpawn7.getImage(), wpawn7.getX(),  wpawn7.getY(),  100,  100, this);
		g.drawImage(wpawn8.getImage(), wpawn8.getX(),  wpawn8.getY(),  100,  100, this);
		
	    g.drawImage(wknight1.getImage(), wknight1.getX(), wknight1.getY(), 100, 100, this);
	    g.drawImage(wknight2.getImage(),  wknight2.getX(),  wknight2.getY(), 100, 100,  this);
	    
	    g.drawImage(wrook1.getImage(),  wrook1.getX(),  wrook1.getY(),  100, 100, this);
	    g.drawImage(wrook2.getImage(),  wrook2.getX(),  wrook2.getY(),  100, 100, this);
	    
	    g.drawImage(wbishop1.getImage(),  wbishop1.getX(),  wbishop1.getY(),  100, 100, this);
	    g.drawImage(wbishop2.getImage(),  wbishop2.getX(),  wbishop2.getY(),  100, 100, this); 
	    
	    g.drawImage(wqueen.getImage(),  wqueen.getX(),  wqueen.getY(),  100, 100, this);
	    g.drawImage(wking.getImage(),  wking.getX(),  wking.getY(),  100, 100, this); 
	    
	    //drawing the pieces on the other side
	    
	    g.drawImage(brook1.getImage(),  brook1.getX(),  brook1.getY(),  100, 100, this);
	    g.drawImage(bknight1.getImage(),  bknight1.getX(),  bknight1.getY(),  100, 100, this);
	    g.drawImage(bbishop1.getImage(),  bbishop1.getX(),  bbishop1.getY(),  100, 100, this);
	    g.drawImage(bqueen.getImage(),  bqueen.getX(),  bqueen.getY(),  100, 100, this);
	    g.drawImage(bking.getImage(),  bking.getX(),  bking.getY(),  100, 100, this);
	    g.drawImage(bbishop2.getImage(),  bbishop2.getX(),  bbishop2.getY(),  100, 100, this);
	    g.drawImage(bknight2.getImage(),  bknight2.getX(),  bknight2.getY(),  100, 100, this);
	    g.drawImage(brook2.getImage(),  brook2.getX(),  brook2.getY(),  100, 100, this);

	    	    g.drawImage(bpawn1.getImage(),  bpawn1.getX(),  bpawn1.getY(),  100, 100, this);
	    	    g.drawImage(bpawn2.getImage(),  bpawn2.getX(),  bpawn2.getY(),  100, 100, this);
	    	    g.drawImage(bpawn3.getImage(),  bpawn3.getX(),  bpawn3.getY(),  100, 100, this);
	    	    g.drawImage(bpawn4.getImage(),  bpawn4.getX(),  bpawn4.getY(),  100, 100, this);
	    	    g.drawImage(bpawn5.getImage(),  bpawn5.getX(),  bpawn5.getY(),  100, 100, this);
	    	    g.drawImage(bpawn6.getImage(),  bpawn6.getX(),  bpawn6.getY(),  100, 100, this);
	    	    g.drawImage(bpawn7.getImage(),  bpawn7.getX(),  bpawn7.getY(),  100, 100, this);
	    	    g.drawImage(bpawn8.getImage(),  bpawn8.getX(),  bpawn8.getY(),  100, 100, this);
	}
	
	public Driver() {
		//black pieces
		board[0][0] = brook1;
		board[0][1] = bknight1;
		board[0][2] = bbishop1;
		board[0][3] = bqueen;
		board[0][4] = bking;
		board[0][5] = bbishop2;
		board[0][6] = bknight2;
		board[0][7] = brook2;
		
		board[1][0] = bpawn1;
		board[1][1] = bpawn2;
		board[1][2] = bpawn3;
		board[1][3] = bpawn4;
		board[1][4] = bpawn5;
		board[1][5] = bpawn6;
		board[1][6] = bpawn7;
		board[1][7] = bpawn8;

		//empty space
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		}
		
		//white pieces
		board[6][0] = wpawn1;
		board[6][1] = wpawn2;
		board[6][2] = wpawn3;
		board[6][3] = wpawn4;
		board[6][4] = wpawn5;
		board[6][5] = wpawn6;
		board[6][6] = wpawn7;
		board[6][7] = wpawn8;
		
		board[7][0] = wrook1;
		board[7][1] = wknight1;
		board[7][2] = wbishop1;
		board[7][3] = wqueen;
		board[7][4] = wking;
		board[7][5] = wbishop2;
		board[7][6] = wknight2;
		board[7][7] = wrook2;
		
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
		Graphics g;
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("WEEWOOOOOOOOOOOOO", SwingConstants.CENTER);
		frame.setLayout(new GridLayout());
		frame.setSize(1000, 1000);
		
		frame.getContentPane().add(new Driver());
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.LIGHT_GRAY);
		
		frame.setVisible(true);
		Movement listener = new Movement(board, frame);
		frame.addMouseListener((MouseListener) listener);
		frame.addMouseMotionListener((MouseMotionListener) listener);
	}
	

}