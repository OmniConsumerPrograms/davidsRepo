//OCP
//Barbarian villain

public class Banshee extends Villain {
//String name, int hpMax, int attackMin, int attackMax, int speed, 
//int phyDefense, int magDefense, int accuracy, int level, int xp
	public Banshee() 
	{
		super("Banshee", 100, 30, 35, 50, 5, 15, 75, 1, 5);

		IAttack attack1 = new NormalVillainAttack();
		IAttack attack2 = new MindSear();
		attackList.addAttack(attack1);
		attackList.addAttack(attack2);
	}
}
