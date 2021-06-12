import java.awt.image.BufferedImage;

public class King extends Piece {
	BufferedImage king;
	String color;

		public King(int a, String color) {
			super(a);
			super.color = color;
			if (super.color == "white") {
				king = super.createImg("images/king.png");
			}
			else {
				king = super.createImg("images/kingb.png");
			}
		}
		
		public BufferedImage getImage() {
			return king;
		}
		
		public boolean canMove(int one, int two, int three, int four) {
			
			if (three == one+1 || three == one-1 || four == two-1 || four == two+1) {
				return true;
			} return false;
				
	}

}
