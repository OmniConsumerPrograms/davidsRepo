import java.util.Random;

public class Heal 
{
	private String attackName;
	
	public Heal() 
	{
		this.attackName = "Heal";
	}
	
	public String getAttackName()
	{
		return this.attackName;
	}
	
	public void setAttackName( String attackName )
	{
		this.attackName = attackName;
	}
	
	public void toAttack( Character hero1, Character hero2)
	{
		int healAmt;
		Random randGen = new Random();
		
		healAmt = Math.abs((randGen.nextInt() % (hero1.getAttackMax()) + 1 ) + hero1.getAttackMin() );
		hero2.setHp(hero2.getHp() + healAmt);
		System.out.println("You healed " + hero2.getName() + " for " + healAmt);
		System.out.println(hero2.getName() + " has " + hero2.getHp() + "hp");
	}

}