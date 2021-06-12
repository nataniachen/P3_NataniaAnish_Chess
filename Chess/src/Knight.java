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
		
		public boolean canMove(int one, int two, int three, int four) {
			if (((three == one+1|| three == one-1)&&(four == two+2|| four == two-2)) || ((three == one+2|| three == one-2)&&(four==two+1|| four == two-1))) {
				return true;
			}
			return false;
		}
			
		
		
}
