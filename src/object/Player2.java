package game;

public class Player2 extends Player{

	public Player2() {

	}

	public Player2(String nama, int hp) {
		super(nama, hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAttack() {
		int damage = 5;
		this.setHp(getHp() - damage);
	}
	
	@Override
	public void getAttackSW1() {//bomb
		int damage = this.weapon.get(0).getDamage();
		this.setHp(getHp() - damage);
		this.weapon.get(0).setValid(false);
	}

	@Override
	public void getAttackSW2() {//double damage
		int damage = weapon.get(1).getDamage();
		this.setHp(getHp() - damage);
		this.weapon.get(0).setValid(false);
	}

	@Override
	public void getEffectSI1() {//hp nambah
		int restorePoint = item.get(0).getEffect();
		this.setHp(getHp() + restorePoint);
		this.item.get(0).setValid(false);
	}

	@Override
	public void getEffectSI2() {//hp nambah juga
		int restorePoint = item.get(1).getEffect();
		this.setHp(getHp() + restorePoint);
		this.item.get(0).setValid(false);
	}

}
