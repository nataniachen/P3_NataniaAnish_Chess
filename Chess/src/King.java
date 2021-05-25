import java.awt.image.BufferedImage;

public class King extends Piece {
	BufferedImage king;
	String color;

		public King(int a, String color) {
			super(a);
			this.color = color;
			if (this.color == "white") {
				king = super.createImg("images/king.png");
			}
			else {
				king = super.createImg("images/kingb.png");
			}
		}
		
		public BufferedImage getImage() {
			return king;
		}
}
