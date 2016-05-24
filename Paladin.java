
public class Paladin extends Hero {

	public Paladin() 
	{
		super("Paladin", 120, 45, 55, 45, 21, 8, 85, 1);

		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}

	public Paladin(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level);
	}		
	
	@Override
	void level3Attack() 
	{
		IAttack attack = new SwordOfLight();
		this.attackList.addAttack(attack);
		
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new HammerOfJustice();
		this.attackList.addAttack(attack);
		
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new DevineStorm();
		this.attackList.addAttack(attack);
		
	}

}
