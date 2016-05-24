
public class Mage extends Hero {

	public Mage() 
	{
		super("Mage", 90, 65, 70, 55, 3, 20, 85, 1);

		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Mage(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new FireBall();
		this.attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new Scortch();
		this.attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new PyroBlast();
		this.attackList.addAttack(attack);
	}

}
