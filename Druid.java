
public class Druid extends Hero 
{
	private int choiceNum = 5;
	
	public Druid() 
	{
		super("Druid", 110, 45, 55, 45, 5, 20, 85, 1, 5);
		
		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Druid(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level, int choiceNum)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level, choiceNum);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new SunFire();
		this.attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new MoonFire();
		this.attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new Wraith();
		this.attackList.addAttack(attack);
	}

	public int getChoiceNum() {
		return choiceNum;
	}

	public void setChoiceNum(int choiceNum) {
		this.choiceNum = choiceNum;
	}
}
