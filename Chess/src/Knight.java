import java.awt.image.BufferedImage;

public class Knight extends Piece {
	BufferedImage knight;
	String color;

		public Knight(int a, String color) {
			super(a);
			this.color = color;
			if (this.color == "white") {
				knight = super.createImg("images/knight.png");
			}
			else {
				knight = super.createImg("images/knightb.png");
			}
		}
		
		public BufferedImage getImage() {
			return knight;
		}
}
