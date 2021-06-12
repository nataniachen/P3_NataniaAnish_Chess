import java.awt.image.BufferedImage;

public class Rook extends Piece {
	BufferedImage rook;

		public Rook(int a, String color) {
			super(a);
			super.color = color;
			if (super.color == "white") {
				rook = super.createImg("images/rook.png");
			}
			else {
				rook = super.createImg("images/rookb.png");
			}
		}
		
		public BufferedImage getImage() {
			return rook;
		}
		
		public boolean canMove(int one, int two, int three, int four) {
			
			if ((((three >= one+1 || three <= one-1)) && four == two) || (((four <= two+1 || four >= two-1)) && three == one)) {
					return true;
			} return false;
						
			}

}
