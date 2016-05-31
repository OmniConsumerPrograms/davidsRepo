//OCP
//Barbarian villain

public class Barbarian extends Villain {
//String name, int hpMax, int attackMin, int attackMax, int speed, 
//int phyDefense, int magDefense, int accuracy, int level, int xp
	public Barbarian() 
	{
		super("Barbarian", 125, 45, 50, 50, 3, 20, 75, 1, 5);

		IAttack attack1 = new NormalVillainAttack();
		IAttack attack2 = new SinisterStrike();
		attackList.addAttack(attack1);
		attackList.addAttack(attack2);
	}
}
