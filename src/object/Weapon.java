package object;

import java.awt.Image;

public abstract class Weapon extends Item{
	int jancok;

	protected int damage;
	//jancok
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public abstract Image getImage();
	public abstract int getDamage();

}
