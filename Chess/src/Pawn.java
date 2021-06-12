import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Pawn extends Piece {
BufferedImage pawn;
String color;
private boolean wwasMoved, bwasMoved;

	public Pawn(int a, String color) {
		super(a);
		this.color = color;
		wwasMoved = false;
		bwasMoved = false;
		if (this.color == "white") {
			pawn = super.createImg("images/pawn.png");
		}
		else {
			pawn = super.createImg("images/pawnb.png");
		}
	}
	
	public ArrayList isLegal(Piece board[][]) {
		
		ArrayList<Integer> legal = new ArrayList<Integer>(); 
		
		
		return legal;
	}
	
	public BufferedImage getImage() {
		return pawn;
	};

//	public boolean canMove(int one, int two, int three, int four) {
//		if (color == "white" && one == three && (four == two-2 | four == two-1)) {
//			return true;
//		}
//		else if (color == "black" && one == three && (four == two+2 | four == two+1)) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean canMove(int one, int two, int three, int four) {
		if (wwasMoved == false) {
			if (color == "white" && one == three && (four == two-2 | four == two-1)) {
				return true;
			} 
		} return false;	
	}
	
	
}
