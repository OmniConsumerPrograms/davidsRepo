//OCP
//Villain

public abstract class Villain extends Character 
{
	private int xp;
	protected Leveling level;
	protected AttackList attackList;
	
	public Villain(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int charLevel) 
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense,	magDefense, accuracy);
		
		//this.xp = 0;
		level = new Leveling();
		level.setLevel( charLevel );		
		
		attackList = new AttackList();
		IAttack attack = new NormalMeleeAttack();
		attackList.addAttack(attack);		
	}

	public int getXp() 
	{
		return xp;
	}

	public void setXp(int xp) 
	{
		this.xp = xp;
	}
	
	public String charString()
	{
		String charString = "";
		charString = getName() + ": Level " + this.level.getLevel() + ": " + getHp() + "hp";
		return charString;		
	}	
	
	

}
