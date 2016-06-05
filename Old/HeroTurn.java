import java.util.*;

public class HeroTurn extends BattleTurn 
{
	protected Random randomGenerator = new Random();
   
   	public int chooseAttack(Character curAttacker)
   	{
   		int choice = -1;
   		boolean done = false;
   		Hero hero = (Hero)curAttacker;
   		Scanner user = new Scanner(System.in);
   		
   		System.out.println("Choose an attack: ");
   		hero.attackString();      
      
   		do 
   		{
   			try 
   			{
   				choice = user.nextInt() - 1;
   			} 
   			catch (InputMismatchException e) 
   			{
   				user.nextLine();
   				System.out.println("\nPlease enter a number from the list to choose an attack.");
   			}
   		}
   		while (curAttacker.validAttackChoice(choice) == false); 
      
   		return choice;
   	}
   	
   	public int chooseHeal( Character curAttacker )
   	{
   		int choice = -1;
   		boolean done = false;
   		Hero hero = (Hero)curAttacker;
   		Scanner user = new Scanner(System.in);
   		
   		System.out.println("Choose a Heal: ");
   		hero.healString();
   		
   		return choice;
   	}
   	
   public int chooseEnemy(Party enemies)
   {
	  int choice = -1;
      Scanner user = new Scanner(System.in);      
      do 
      {
         System.out.println("Who would you like to attack?");
         enemies.partyString();
               
         try 
         {
   		  choice = user.nextInt();
         } catch (InputMismatchException e) 
         {
            user.nextLine();
            
            System.out.println("\nPlease enter a number from the list of bad guys.");
         }//close try-catch
      }
      while (choice < 1 || choice > enemies.size());
            
      return choice - 1;
   }

   public int menu(Character hero)
   {
	   int choice = 0;
	   boolean done = false;
	   Scanner user = new Scanner(System.in);
	         
	   while (done == false && choice < 1 && choice > 3);          
	   {
		   System.out.println(hero.getName() + "s turn. Make a selection");    
		   System.out.println("1. Attack  \n2. Heal \n3. Use Item  \n4. Party Stats");
		   try 
		   {
			   choice = user.nextInt();
			   if( choice >= 1 && choice <= 3 )
				   ;//done = true;
			   else
				   System.out.println( "***Invalid entry, please try again***" );              
		   } 
		   catch (InputMismatchException e) 
		   {
			   //user.nextLine();     
			   System.out.println("***Invalid entry, please try again***");
		   }
	   }
	   return choice;
   }
   
   public void checkDefenderLife(Character currentAttacker, Party defenders, Character currentDefender, int currentDefendersPos)
   {
      if (currentDefender.isAlive() == false) 
      {
         System.out.println(currentAttacker.getName() + " defeated " + currentDefender.getName() + "!\n");          
         Villain defender = (Villain)currentDefender;
         int gainedXP = defender.getXp();         
         Hero attacker = (Hero)currentAttacker;         
         attacker.setXp(attacker.getXp() +gainedXP);         
         attacker.levelUp(attacker);          
         defenders.removeChar(currentDefendersPos);                           
      }  
   }  
}