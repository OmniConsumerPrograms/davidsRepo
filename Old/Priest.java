
public class Priest extends Hero 
{
	private int choiceNum;
	
	public Priest() 
	{
		super("Priest", 100, 45, 55, 45, 5, 18,	85, 1, 3);

		this.choiceNum = 3;
		
		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Priest(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level, int choiceNum)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level, choiceNum);
	}		

	@Override
	void level3Attack() 
	{
		IAttack attack = new Smite();
		this.attackList.addAttack(attack);
	}

	@Override
	void level6Attack() 
	{
		IAttack attack = new MindSear();
		this.attackList.addAttack(attack);
	}

	@Override
	void level9Attack() 
	{
		IAttack attack = new ShadowFiend();
		this.attackList.addAttack(attack);
	}

	public int getChoiceNum() {
		return choiceNum;
	}

	public void setChoiceNum(int choiceNum) {
		this.choiceNum = choiceNum;
	}

}
