import java.awt.image.BufferedImage;

public class Pawn extends Piece {
BufferedImage pawn;
String color;

	public Pawn(int a, String color) {
		super(a);
		this.color = color;
		if (this.color == "white") {
			pawn = super.createImg("images/pawn.png");
		}
		else {
			pawn = super.createImg("images/pawnb.png");
		}
	}
	
	public BufferedImage getImage() {
		return pawn;
	};
	
	public boolean canMove(int one, int two, int three, int four) {
		if (color == "white" && one == three && (four == two-2 | four == two-1)) {
			return true;
		}
		else if (color == "black" && one == three && (four == two+2 | four == two+1)) {
			return true;
		}
		return false;
	}
}
