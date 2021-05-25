	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Piece {
	    private int position;
	    
	    public Piece(int A) {
	        position = A;
	    }
	    
	    public int getPosition() {
	        return position;
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
		
	}
