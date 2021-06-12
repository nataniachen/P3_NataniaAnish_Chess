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
	int ogX, ogY;
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

		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			int x = (int)e.getPoint().x;
			int y = (int)e.getPoint().y;
			
			aa:
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (mouseOnPiece((board[i][j]), x, y)) {
						//save the original position in case move is invalid
						ogX = board[i][j].getX();
						ogY = board[i][j].getY();
						//offset mouse-piece
						offsetX = x-board[i][j].getX();
						offsetY = y-board[i][j].getY();
						//obtaining the piece
						a=i;
						b=j;
						break aa;
					}
				}
			}
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			board[a][b].setX((int)((e.getPoint().x)/100)*100);
			board[a][b].setY((int)((e.getPoint().y)/100)*100);

			aa:
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (board[a][b].getY() == 100*i && board[a][b].getX() == 100*j) {
						//function goes here because both positions are available
						if (board[a][b].canMove(b, a, j, i)) {
						if (board[i][j] != null) {
							board[i][j].setX(800);
							board[i][j] = null;
						}
						board[i][j] = board[a][b];
						board[a][b] = null;
						break aa;
						}
						else {
							board[a][b].setX((int)(ogX));
							board[a][b].setY((int)(ogY));
							break aa;
						}
					}
				}
			}
			GUI.repaint();
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
			if (board[a][b]!=null) {
				board[a][b].setX((int)(e.getPoint().x-offsetX));
				board[a][b].setY((int)(e.getPoint().y-offsetY));
			}
			GUI.repaint();

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
		public static boolean mouseOnPiece(Piece piece, int x, int y) {
			if (piece == null) {
				return false;
			}
			//find if the click is on a piece
			return piece.getX() <= x &&  piece.getX()+100 >= x && piece.getY() <= y && piece.getY()+100>=y;
		}
}
