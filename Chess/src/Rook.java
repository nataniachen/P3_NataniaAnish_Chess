import java.awt.image.BufferedImage;

public class Rook extends Piece {
	BufferedImage rook;
	String color;

		public Rook(int a, String color) {
			super(a);
			this.color = color;
			if (this.color == "white") {
				rook = super.createImg("images/rook.png");
			}
			else {
				rook = super.createImg("images/rookb.png");
			}
		}
		
		public BufferedImage getImage() {
			return rook;
		}
}
