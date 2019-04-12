package object;

import java.awt.Image;

public abstract class Item {
	

	protected int x,y,width,height;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Image getImage();
	

}
