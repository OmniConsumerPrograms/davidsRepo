//OCP
//Warrior

public class Warrior extends Hero {

	public Warrior() 
	{
		super("Warrior", 120, 55, 65, 45, 20, 5, 80, 1);
		
		IAttack attack = new NormalMeleeAttack();
		attackList.addAttack(attack);
	}
	
	public Warrior(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new CrushingBlow();
		attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new Execute();
		attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new Whirlwind();
		attackList.addAttack(attack);
	}

}
