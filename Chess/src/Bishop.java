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
}
