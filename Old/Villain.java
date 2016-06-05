//OCP
//Villain

public abstract class Villain extends Character 
{
	private int xp;
	protected Leveling level;
	
	public Villain(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int charLevel, int xp) 
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense,	magDefense, accuracy, charLevel, xp);
		
		this.xp = xp;
		level = new Leveling();
		level.setLevel( charLevel );			
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
