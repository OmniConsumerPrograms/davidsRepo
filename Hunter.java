
public class Hunter extends Hero 
{
	private int choiceNum = 1;
	
	public Hunter() 
	{
		super("Hunter", 100, 45, 50, 45, 15, 3, 85, 1, 1);

		setChoiceNum(1);
		
		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Hunter(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level, int choiceNum)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level, choiceNum);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new AutoShot();
		this.attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new SteadyShot();
		this.attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new MultiShot();
		this.attackList.addAttack(attack);
	}

	public int getChoiceNum() {
		return choiceNum;
	}

	public void setChoiceNum(int choiceNum) {
		this.choiceNum = choiceNum;
	}

}
