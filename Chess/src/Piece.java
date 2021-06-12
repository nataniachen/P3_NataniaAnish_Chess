import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Piece {
	    private int position;
		private int x;
		private int y;
		private BufferedImage img;
		protected Color colour;
		
	    public Piece(int A) {
	        position = A;
	        switch (A) {
	        case 1:
	        x = 0;
	        y = 0;
	        break;
	    case 2:
	        x = 100;
	        y = 0;
	        break;
	    case 3:
	        x = 200;
	        y = 0;
	        break;
	    case 4:
	        x = 300;
	        y = 0;
	        break;
	    case 5:
	        x = 400;
	        y = 0;
	        break;
	    case 6:
	        x = 500;
	        y = 0;
	        break;
	    case 7:
	        x = 600;
	        y = 0;
	        break;
	    case 8:
	        x = 700;
	        y = 0;
	        break;
	    case 9:
	        x = 0;
	        y = 100;
	        break;
	    case 10:
	        x = 100;
	        y = 100;
	        break;
	    case 11:
	        x = 200;
	        y = 100;
	        break;
	    case 12:
	        x = 300;
	        y = 100;
	        break;
	    case 13:
	        x = 400;
	        y = 100;
	        break;
	    case 14:
	        x = 500;
	        y = 100;
	        break;
	    case 15:
	        x = 600;
	        y = 100;
	        break;
	    case 16:
	        x = 700;
	        y = 100;
	        break;
	    case 49:
	        x = 0;
	        y = 600;
	        break;
	    case 50:
	        x = 100;
	        y = 600;
	        break;
	    case 51:
	        x = 200;
	        y = 600;
	        break;
	    case 52:
	        x = 300;
	        y = 600;
	        break;
	    case 53:
	        x = 400;
	        y = 600;
	        break;
	    case 54:
	        x = 500;
	        y = 600;
	        break;
	    case 55:
	        x = 600;
	        y = 600;
	        break;
	    case 56:
	        x = 700;
	        y = 600;
	        break;
	    case 57:
	        x = 0;
	        y = 700;
	        break;
	    case 58:
	        x = 100;
	        y = 700;
	        break;
	    case 59:
	        x = 200;
	        y = 700;
	        break;
	    case 60:
	        x = 300;
	        y = 700;
	        break;
	    case 61:
	        x = 400;
	        y = 700;
	        break;
	    case 62:
	        x = 500;
	        y = 700;
	        break;
	    case 63:
	        x = 600;
	        y = 700;
	        break;
	    case 64:
	        x = 700;
	        y = 700;
	        break;
	        }
	    }
	    
	    public int getPosition() {
	        return position;
	    }
	    
		public BufferedImage createImg(String a) {
			try {
				img = ImageIO.read(new File(a));
				return img;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		public BufferedImage getImg() {
			return img;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y= y;
		}
		//parameters: one: og X, two: og Y, three: new X, four: new Y
				public boolean canMove(int one, int two, int three, int four) {
					return false;
				}
	}
