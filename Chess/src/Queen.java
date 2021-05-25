import java.awt.image.BufferedImage;

public class Queen extends Piece {
	BufferedImage queen;
	String color;

		public Queen(int a, String color) {
			super(a);
			this.color = color;
			if (this.color == "white") {
				queen = super.createImg("images/queen.png");
			}
			else {
				queen = super.createImg("images/queenb.png");
			}
		}
		
		public BufferedImage getImage() {
			return queen;
		}
}
