package figglewatts.conspectus.tile;

import javax.swing.ImageIcon;

public class Tile {
	private int tileID;
	private int sheetID;
	public int getTileID() {
		return tileID;
	}
	public void setTileID(int tileID) {
		this.tileID = tileID;
	}
	public int getSheetID() {
		return sheetID;
	}
	public void setSheetID(int sheetID) {
		this.sheetID = sheetID;
	}
	
	public Tile(int tileID, int sheetID) {
		this.tileID = tileID;
		this.sheetID = sheetID;
	}
}
