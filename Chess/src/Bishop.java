import java.awt.image.BufferedImage;

public class Bishop extends Piece {
	BufferedImage bishop;
	String color;

		public Bishop(int a, String color) {
			super(a);
			this.color = color;
			if (this.color == "white") {
				bishop = super.createImg("images/bishop.png");
			}
			else {
				bishop = super.createImg("images/bishopb.png");
			}
		}
		
		public BufferedImage getImage() {
			return bishop;
		}
		
		public boolean canMove(int one, int two, int three, int four) {
			
			if ((three >= one+1 || three <= one-1) && (four >= two+1 || four <= two-1)) {
				return true;
			} return false;
			
		}
		
}
