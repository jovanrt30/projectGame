package game;

public abstract class Weapon {
	private String name;
	private int damage;
	private boolean isValid;

	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String name, int damage, Boolean isValid) {
		super();
		this.name = name;
		this.damage = damage;
		this.isValid = isValid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	
	

}
