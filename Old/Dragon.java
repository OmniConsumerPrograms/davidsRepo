//OCP
//Dragon

public class Dragon extends Villain {

	public Dragon() 
	{
		super("Dragon", 250, 50, 55, 50, 50, 3, 75, 1, 9);
	
		IAttack attack1 = new NormalVillainAttack();
		IAttack attack2 = new FireBall();
		attackList.addAttack(attack1);
		attackList.addAttack(attack2);
	}

}
