package object;

import java.util.Vector;

public abstract class Characters {
	private String nama;
	private int hp;
	private Vector<Weapon> weapon;
	private Vector<Item> item;
	
	public Characters(String nama, int hp, Vector<Weapon> weapon, Vector<Item> item) {
		super();
		this.nama = nama;
		this.hp = hp;
		this.weapon = weapon;
		this.item = item;
	}

	public void getAttack() {
		
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Vector<Weapon> getWeapon() {
		return weapon;
	}

	public void setWeapon(Vector<Weapon> weapon) {
		this.weapon = weapon;
	}

	public Vector<Item> getItem() {
		return item;
	}

	public void setItem(Vector<Item> item) {
		this.item = item;
	}
}
