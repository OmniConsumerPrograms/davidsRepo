import java.util.*;

public class VillainTurn extends BattleTurn 
{
	protected Random randomGenerator = new Random();
   
	public int chooseAttack(Character currentAttacker)
	{
		int choice;
		do 
		{
			choice = randomGenerator.nextInt(currentAttacker.attackList.size());
		}
		while (currentAttacker.validAttackChoice(choice) == false); 
		//return choice;      
		return 0;
	}	
   
	public int chooseEnemy(Party defenders)
	{
		return randomGenerator.nextInt(defenders.size());
 
	}
   
	public void checkDefenderLife(Character currentAttacker, Party defenders, Character currentDefender, int currentDefendersPos)
	{
		if (currentDefender.isAlive() == false) 
		{
			System.out.println(currentDefender.getName() + " was defeated!\n");     
			defenders.removeChar(currentDefendersPos);                  
		}
   	}

   	public int chooseHeal(Character hero) 
   	{
   		return 0;
   	}   
}