import java.util.*;

public class HeroTurn extends BattleTurn 
{
   protected Random randomGenerator = new Random();
   
   public int chooseAttack(Character currentAttacker)
   {
      //allow user to choose an attack
      Hero attacker = (Hero)currentAttacker;
      
      System.out.println("Choose an attack: ");
      attacker.attackListString();      
   		
      Scanner kb = new Scanner(System.in);
      
      int choice = 99;
      
      do 
      {
         try 
         {
   		  choice = kb.nextInt() - 1;
         } 
         catch (InputMismatchException e) 
         {
            kb.nextLine();
            
            System.out.println("\nPlease enter a number from the list to choose an attack.");
         }//close try-catch
      }
      while (currentAttacker.validAttackChoice(choice) == false); 
      
      return choice;

   }
   
   public int chooseOpponent(Party defenders)
   {
      Scanner kb = new Scanner(System.in);
      
      int choice = 99;
      
      do 
      {
         System.out.println("Who would you like to attack?");
         defenders.partyString();               
         try 
         {
   		  choice = kb.nextInt();
         } catch (InputMismatchException e) 
         {
            kb.nextLine();
            
            System.out.println("\nPlease enter a number from the list of bad guys.");
         }//close try-catch
      }
      while (choice < 1 || choice > defenders.size());
            
      return choice - 1;

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
   
   public int optionsMenu(Character currentGoodGuy)
   {
      //allow user to choose an option
      System.out.println(currentGoodGuy.getName() + " is up. What would you like to do?");
    
      System.out.println("1. Attack \t 2. Print Stats ");      
   		
      Scanner kb = new Scanner(System.in);
      
      int choice = 99;
      
      while (choice < 1 || choice > 4)
      {
         try 
         {
   		  choice = kb.nextInt();
           
         } catch (InputMismatchException e) 
         {
            kb.nextLine();
            
            System.out.println("\nPlease enter a number from the list to choose an option.");
         }//close try-catch
         
         if (choice < 1 || choice > 4) {
            System.out.println("\nPlease enter a number from the list to choose an option.");
         }   
            
      }
      
      return choice;

   }   
}