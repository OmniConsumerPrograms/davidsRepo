//OCP
//Rogue

public class Rogue extends Hero {

	public Rogue() {
		super("Rogue", 105, 45, 60, 60, 15, 3, 85, 1);
	
		IAttack attack = new NormalMeleeAttack();
		attackList.addAttack(attack);
	}
	
	public Rogue(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new SinisterStrike();
		attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new Gourge();
		attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new Eviscerate();
		attackList.addAttack(attack);
		
	}

}
