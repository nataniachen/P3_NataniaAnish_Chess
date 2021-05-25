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
	}
}
