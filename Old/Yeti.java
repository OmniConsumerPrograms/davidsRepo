//OCP
//Yeti villain

public class Yeti extends Villain {
//String name, int hpMax, int attackMin, int attackMax, int speed, 
//int phyDefense, int magDefense, int accuracy, int level, int xp
	public Yeti() 
	{
		super("Yeti", 150, 30, 40, 50, 30, 3, 90, 1, 5);

		IAttack attack = new NormalVillainAttack();
		attackList.addAttack(attack);
	}
}
