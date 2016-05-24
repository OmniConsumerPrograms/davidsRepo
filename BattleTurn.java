public abstract class BattleTurn 
{
  final boolean executeTurn(Party heroes, Party villains) 
  {
      int attackersPos = heroes.getTurn();
      int defendersPos = villains.getTurn();
      
      Character currentAttacker = heroes.getChar(attackersPos);
      
      int menuChoice = optionsMenu(currentAttacker);

      while (menuChoice == 3) {
         System.out.println("Current good guys: ");
         heroes.partyString();
         
         System.out.println("Current bad guys: ");
         villains.partyString();
         
         menuChoice = optionsMenu(currentAttacker);
      }  
       
      if (menuChoice == 4) 
         return true;   
      
      if (menuChoice == 1) 
      {
         int choice = chooseAttack(currentAttacker);
         
         int currentDefendersPos = chooseOpponent(villains);
         
         Character currentDefender = villains.getChar(currentDefendersPos);
         
         executeAttack(currentAttacker, currentDefender, choice);
         checkDefenderLife(currentAttacker, villains, currentDefender, currentDefendersPos);
          
      }    
      
      advanceTurnOrder(heroes, villains);
      
      return false;
   }
   
   public int optionsMenu(Character currentAttacker) {
      int x = 1;
      
      System.out.println(currentAttacker.getName() + " is attacking!");
      
      return x;
   }   
   
   public void useItem(Hero user) 
   {
      return;
   }
   
   abstract int chooseAttack(Character currentAttacker);
   abstract int chooseOpponent(Party defenders);
   
   public void executeAttack(Character currentAttacker, Character currentDefender, int choice) 
   {
      currentAttacker.attack(currentAttacker, choice);
   }
   
   abstract void checkDefenderLife(Character currentAttacker, Party defenders, Character currentDefender, int defendersPos); 
   
   public void advanceTurnOrder(Party attackers, Party defenders) 
   {
      attackers.turnPlusPlus();
      if (attackers.getTurn() >= attackers.size())
         attackers.setTurn(0);
      if (defenders.getTurn() >= defenders.size())
         defenders.setTurn(0);
   }
}