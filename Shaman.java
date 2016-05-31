//OCP
//Shaman

public class Shaman extends Hero 
{
	private int choiceNum;
	
	public Shaman() 
	{
		super("Shaman", 115, 55, 60, 40, 15, 10, 80, 1, 8);

		this.choiceNum = 8;
		
		IAttack attack = new NormalMeleeAttack();
		this.attackList.addAttack(attack);
	}
	
	public Shaman(String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level, int choiceNum)
	{
		super(name, hpMax, attackMin, attackMax, speed, phyDefense, magDefense, accuracy, level, choiceNum);
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

	public int getChoiceNum() {
		return choiceNum;
	}

	public void setChoiceNum(int choiceNum) {
		this.choiceNum = choiceNum;
	}

}
