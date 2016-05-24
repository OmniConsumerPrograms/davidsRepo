//OCP
//Ogre villain

public class Ogre extends Villain {
	//String name, int hpMax, int attackMin, int attackMax, int speed, 
	//int phyDefense, int magDefense, int accuracy, int level	
	public Ogre() 
	{
		super("OP the Ogre", 150, 30, 40, 50, 30, 3, 90, 1);

		IAttack attack1 = new NormalMeleeAttack();
		attackList.addAttack(attack1);
		
		IAttack attack2 = new CrushingBlow();
		attackList.addAttack(attack2);		
	}

}
