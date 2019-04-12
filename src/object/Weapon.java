package object;

import java.awt.Image;

public abstract class Weapon extends Item{

	protected int damage;
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public abstract Image getImage();
	public abstract int getDamage();

}
