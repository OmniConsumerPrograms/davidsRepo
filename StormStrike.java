//OCP
//Shaman Attack

import java.util.Random;

public class StormStrike implements IAttack 
{
	private String attackName;
	
	public StormStrike()
	{
		this.attackName = "Storm Strike";
	}

	@Override
	public String getAttackName() 
	{
		return attackName;
	}
	
	@Override
	public void setAttackName(String attackName)
	{
		this.attackName = attackName;
	}
	
	
	@Override
	public void toAttack(Character hero, Character villain)
	{
		int dmgAmt;
		double modDmg;
		Random randGen = new Random();
		boolean yes = validAttack(hero, randGen);
		
		if( yes )
		{
			dmgAmt = Math.abs((randGen.nextInt() % (hero.getAttackMax()) + 1 ) + hero.getAttackMin());
			modDmg = dmgAmt;
			modDmg = modDmg * 1.25;
			dmgAmt = (int)modDmg;
			villain.setHp( villain.getHp() - dmgAmt );
			System.out.println( hero.getName() + "'s " + getAttackName() + " hit " 
					+ villain.getName() + " for " + dmgAmt + "hp." ); 
			System.out.println(villain.getName() + " has " + villain.getHp() + "hp.");
		}
	      else
	      {
	         System.out.println( hero.getName() + " missed!" );
	         System.out.println(villain.getName() + " has " + villain.getHp() + "hp." );
	      }
	}

	@Override
	public boolean validAttack(Character hero, Random gen)
	{
		double randHit = Math.abs(gen.nextDouble()) % ( 100 ) + 1;
	   
		if( randHit <= hero.getAccuracy() )
			return true;
	    return false;        
	   }
}
