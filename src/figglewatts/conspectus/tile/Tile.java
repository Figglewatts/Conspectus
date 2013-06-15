package figglewatts.conspectus.tile;

import javax.swing.ImageIcon;

public class Tile {
	private ImageIcon texture;
	private String name;
	public ImageIcon getTexture() {
		return texture;
	}
	public void setTexture(ImageIcon texture) {
		this.texture = texture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Tile(String name, ImageIcon texture) {
		this.name = name;
		this.texture = texture;
	}
}
