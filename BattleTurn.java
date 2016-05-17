//Omni Consumer Programs
//BattleTurn

public abstract class BattleTurn 
{

  final boolean executeTurn(Party attackers, Party defenders) {
      //gets position of both attacker and defender
      int attackersPos = attackers.getTurn();
      int defendersPos = defenders.getTurn();
      
      //gets currentAttacker (so we can pass this as a parameter)
      Character currentAttacker = attackers.getHero(attackersPos);
      
      //calls menu choice, which is overwritten in goodGuyTurn to display options, does nothing but return 1 for badGuyTurn
      int menuChoice = optionsMenu(currentAttacker);
      
      //use item instead of attacking
      if (menuChoice == 2)
      {
         Hero user = (Hero) currentAttacker;
         
         if(user.inventorySize() != 0)
         {
            useItem(user);

         }
         else 
         {
            System.out.println(currentAttacker.getName() + "'s inventory is empty. They must stand and fight!\n");
                     
            menuChoice = 1;
         }      
      }
      
      //prints stats menu if goodGuy chose this option
      while (menuChoice == 3) {
         System.out.println("Current good guys: ");
         attackers.partyString();
         
         System.out.println("Current bad guys: ");
         defenders.partyString();
         
         menuChoice = optionsMenu(currentAttacker);
      }  
       
      //flees if goodGuy chose this option
      if (menuChoice == 4) 
         return true;   
      
      //carries out attack if menu choice equals 1
      if (menuChoice == 1) 
      {
         //allows character to choose attack from attacksInventory
         int choice = chooseAttack(currentAttacker);
         
         //allows character to choose an opponent 
         int currentDefendersPos = chooseOpponent(defenders);
         
         //gets currentDefender (so we can pass this as a parameter)
         Character currentDefender = defenders.getHero(currentDefendersPos);
         
         //carries out attack and clean up steps
         executeAttack(currentAttacker, currentDefender, choice);
         checkDefenderLife(currentAttacker, defenders, currentDefender, currentDefendersPos);
          
      }    
      
      advanceTurnOrder(attackers, defenders);
      
      return false;
   }//close battleTurn
   
   //hook that is overwritten in goodGuyTurn
   public int optionsMenu(Character currentAttacker) {
      int x = 1;
      
      System.out.println(currentAttacker.getName() + " is attacking!");
      
      return x;
   }   
   
   //hook for item using capabale characters
   public void useItem(Hero user) 
   {
      return;
   }
   
   //both of these methods are overwritten in both goodGuy and badGuy turns
   abstract int chooseAttack(Character currentAttacker);
   abstract int chooseOpponent(Party defenders);
   
   //executes attack the same for either type of turn
   public void executeAttack(Character currentAttacker, Character currentDefender, int choice) 
   {
      currentAttacker.attack(currentDefender, choice);

   }
   
   //overwritten in both goodGuy and badGuy turns 
   abstract void checkDefenderLife(Character currentAttacker, Party defenders, Character currentDefender, int defendersPos); 
   
   //advances turn order for the party when a character's turn is completed
   public void advanceTurnOrder(Party attackers, Party defenders) 
   {
      attackers.turnPlusPlus();

      //if turn order of attackers reaches end of attackers, reset turn order to beginning
      if (attackers.getTurn() >= attackers.size()) {
         attackers.resetTurn();
      } 
      
      //check that defenders turnPos is still valid
      if (defenders.getTurn() >= defenders.size()) {
         defenders.resetTurn();
      } 

   }//close advanceTurnOrder

}//close BattleTurn