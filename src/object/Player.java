package game;

import java.util.Vector;

public abstract class Player {
	private String nama;
	private int hp;
	protected Vector<Weapon> weapon = new Vector<Weapon>();
	protected Vector<Item> item = new Vector<Item>();;

	public Player() {
		Weapon SW1 = new SpecialWeapon1(); SW1.setValid(true);//bomb
		Weapon SW2 = new SpecialWeapon2(); SW2.setValid(true);//double damage
		weapon.add(SW1);
		weapon.add(SW2);
		
		Item SI1 = new SpecialItem1(); SI1.setValid(true);//healing
		Item SI2 = new SpecialItem2(); SI2.setValid(true);//defense
		item.add(SI2);
		item.add(SI1);
	}

	public Player(String nama, int hp) {
		this();
		this.nama = nama;
		this.hp = hp;
	}
	
	public abstract void getAttack();
	public abstract void getAttackSW1();//idx = 0;
	public abstract void getAttackSW2();//idx = 1;
	
	public abstract void getEffectSI1();//idx = 0;
	public abstract void getEffectSI2();//idx = 1;

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
