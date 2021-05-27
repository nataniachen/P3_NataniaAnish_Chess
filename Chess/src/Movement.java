import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Movement implements MouseListener, MouseMotionListener{
	int offsetX;
	int offsetY;
	int a;
	int b;
	private Piece board[][];
	private JFrame GUI;
	private Piece piece;
	static Point[] move = new Point[2];

		public Movement(Piece[][] board, JFrame frame) {
			this.board = board;
			GUI = frame;
		// TODO Auto-generated constructor stub
	}
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			/*if (move[0] == null) {
				move[0] = new Point(e.getPoint().x, e.getPoint().y);
				System.out.println(move[0].toString());
			}
			else if (move[1] == null) {
				move[1] = new Point(e.getPoint().x, e.getPoint().y);
				System.out.println(move[1].toString());
			
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						//if (mouseOnPiece((board[i][j]), move[0].getX(), move[0].getY())) {
							//g.drawImage(board[i][j].getImg(), 100, 100, 100, 100, this);	
						//}
					}
				}
				
				move[0] = null;
				move[1] = null;
				System.out.println("Reset the move.");
			}
			*/
		}
		
		
		@Override
		public void mousePressed(MouseEvent e) {
			int x = (int)e.getPoint().x;
			int y = (int)e.getPoint().y;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (mouseOnPiece((board[i][j]), x, y)) {
						offsetX = x-board[i][j].getX();
						offsetY = y-board[i][j].getY();
						//obtaining the piece
						a=i;
						b=j;
						System.out.println("piece detection successful");
						break;
					}
				}
			}
			
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
	

		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("bypass1");
			if (board[a][b]!=null) {
				board[a][b].setX((int)(e.getPoint().x-offsetX));
				board[a][b].setY((int)(e.getPoint().y-offsetY));
			}
			System.out.println("bypass2");
			GUI.repaint();
			System.out.println("bypass3");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public static boolean mouseOnPiece(Piece piece, int x, int y) {
			if (piece == null) {
				System.out.println("no piece!");
				return false;
			}
			//find if the click is on a piece
			return piece.getX() <= x &&  piece.getX()+100 >= x && piece.getY() <= y && piece.getY()+100>=y;
		}
}
