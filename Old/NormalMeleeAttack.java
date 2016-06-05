//OCP
//

import java.util.Random;

public class NormalMeleeAttack implements IAttack 
{
	private String attackName;

	public NormalMeleeAttack()
	{
		this.attackName = "Normal Melee Attack";
	}
	
	@Override
	public String getAttackName() 
	{
		return this.attackName;
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
		Random randGen = new Random();
		boolean yes = validAttack(hero, randGen);
	   
		if( yes )
		{
			dmgAmt = Math.abs((randGen.nextInt() % (hero.getAttackMax()) + 1 ) + hero.getAttackMin());
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
