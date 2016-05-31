public abstract class BattleTurn 
{
	abstract int chooseAttack(Character hero);
	abstract int chooseHeal(Character hero);
	abstract int chooseEnemy(Party villains);
	abstract void checkDefenderLife(Character currentAttacker, Party defenders, Character currentDefender, int defendersPos);
	
	final boolean executeTurn(Party attackers, Party defenders) 
	{
		int attackersPos = attackers.getTurn();
		int defendersPos = defenders.getTurn();
      
		Character currentAttacker = attackers.getChar(attackersPos);
      
		int menuChoice = menu(currentAttacker);
            
		if (menuChoice == 1) 
		{
			int choice = chooseAttack(currentAttacker);
			int currentDefendersPos = chooseEnemy(defenders);
			Character currentDefender = defenders.getChar(currentDefendersPos);
			executeAttack(currentAttacker, currentDefender, choice);
			checkDefenderLife(currentAttacker, defenders, currentDefender, currentDefendersPos);  
		}
		
		if(menuChoice == 2)
		{
			int choice = chooseHeal(currentAttacker);
		}
		
		while (menuChoice == 4) 
		{
			System.out.println("Your Heroes: ");
			attackers.partyString();
         
			System.out.println("The Villains: ");
			defenders.partyString();
         
			menuChoice = menu(currentAttacker);
		}    
          
		advanceTurnOrder(attackers, defenders);
      	return false;
	}
   
	public int menu(Character currentAttacker) 
	{
		int i = 1;
		System.out.println(currentAttacker.getName() + " is attacking!");  
		return i;
	}   
   
	public void executeAttack(Character currentAttacker, Character currentDefender, int choice) 
	{
		currentAttacker.attack(currentDefender, choice);
	}

	public void advanceTurnOrder(Party attackers, Party defenders) 
	{
		attackers.turnPlusPlus();
		if (attackers.getTurn() >= attackers.size()) 
			attackers.setTurn(0);      
		if (defenders.getTurn() >= defenders.size()) 
			defenders.setTurn(0);
	}
}