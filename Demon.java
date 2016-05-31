//OCP
//Barbarian villain

public class Demon extends Villain {
//String name, int hpMax, int attackMin, int attackMax, int speed, 
//int phyDefense, int magDefense, int accuracy, int level, int xp
	public Demon() 
	{
		super("Demon", 175, 47, 56, 50, 23, 23, 75, 1, 7);

		IAttack attack1 = new NormalVillainAttack();
		IAttack attack2 = new Scortch();
		attackList.addAttack(attack1);
		attackList.addAttack(attack2);
	}
}
