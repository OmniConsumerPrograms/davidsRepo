//OCP
//Character

abstract class Character 
{
	private String name;
	private int hpMax;
	private int hp;
	private int attackMin;
	private int attackMax;
	private int speed;
	private int phyDefense;
	private int magDefense;
	private int accuracy;
	protected AttackList attackList;
	
	public Character(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy)
	{
		this.setName(name);
		this.setHpMax(hpMax);
		this.setHp(hpMax);
		this.setAttackMin(attackMin);
		this.setAttackMax(attackMax);
		this.setSpeed(speed);
		this.setPhyDefense(phyDefense);
		this.setMagDefense(magDefense);
		this.setAccuracy(accuracy);
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackMin() {
		return attackMin;
	}

	public void setAttackMin(int attackMin) {
		this.attackMin = attackMin;
	}

	public int getAttackMax() {
		return attackMax;
	}

	public void setAttackMax(int attackMax) {
		this.attackMax = attackMax;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPhyDefense() {
		return phyDefense;
	}

	public void setPhyDefense(int phyDefense) {
		this.phyDefense = phyDefense;
	}

	public int getMagDefense() {
		return magDefense;
	}

	public void setMagDefense(int magDefense) {
		this.magDefense = magDefense;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public boolean isAlive()
	{
		if( this.hp > 0)
			return true;
		return false;
	}
	
	public String charString()
	{
		return this.name + ": " + this.getHp();
	}
	
	public final void attack(Character incomingCharacter, int choiceInput) 
	{
		IAttack attackToExecute = attackList.getAttack(choiceInput);
	      
		attackToExecute.toAttack(this, incomingCharacter);
	}
	
	public boolean validAttackChoice(int x) 
	{
		if (x >= 0 && x < attackList.size())
			return true;	      
		return false;
	}

}
