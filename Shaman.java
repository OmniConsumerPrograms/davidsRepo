//OCP
//Shaman

public class Shaman extends Hero {

	public Shaman() 
	{
		//		super("Warrior", 120, 55, 65, 45, 20, 5, 80, 1);

		super("Shaman", 115, 55, 60, 40, 15, 10, 80, 1);

		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Shaman(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new StormStrike();
		this.attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new LavaLash();
		this.attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new Windfury();
		this.attackList.addAttack(attack);
	}

}
