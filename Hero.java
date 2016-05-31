//OCP
//Hero

abstract class Hero extends Character 
{
	private int xp;
	private Leveling level;
	//protected Inventory inventory;//got to get from brad
	
			  //String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level
	public Hero(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int charLevel, int choiceNum) 
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, charLevel, choiceNum);
		
		this.xp = 0;
		level = new Leveling();
		level.setLevel( charLevel );		
	}
	
	abstract void level3Attack();
	abstract void level6Attack();
	abstract void level9Attack();

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public void levelUp(Hero hero)
	{
		this.level.levelUp(hero);
	}

	public String charString()
	{
		String charString = "";
		charString = getName() + ": Level " + this.level.getLevel() + ": " + getHp() + "hp: " + getXp() + "xp";
		return charString;		
	}	
	
	public void attackListString()
	{
		int i;
		for( i = 0; i < attackList.size(); i++)
			System.out.println( (i+1) + ") " + attackList.getAttack(i) );
	}

	public boolean validChoice(int i)
	{
		if( i >= 0 && i < attackList.size())
			return true;
		return false;
	}
	
	
}
