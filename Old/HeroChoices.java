//Omni Consumer Programs
//User choices the Characters

import java.util.*;

public class HeroChoices
{
   private ArrayList<Hero> heroes;
   
   public HeroChoices()
   {
      heroes = new ArrayList<Hero>();
      
      Hero tempChar;
      
      tempChar = new Hunter("Hunter");
      heroes.add(tempChar);
      
      tempChar = new Rogue("Rogue");
      heroes.add(tempChar);
      
      tempChar = new Priest("Priest");
      heroes.add(tempChar);
      
      tempChar = new Warrior("Warrior");
      heroes.add(tempChar);
      
      tempChar = new Druid("Druid");
      heroes.add(tempChar);
      
      tempChar = new Paladin("Paladin");
      heroes.add(tempChar);
      
      tempChar = new Mage("Mage");
      heroes.add(tempChar);
      
      tempChar = new Shaman("Shaman");
      heroes.add(tempChar);
   }     

   public void printHeroChoices()
   {
      Hero tempChar;
      
      for (int i = 0; i < heroes.size(); i++)
      {
         tempChar = heroes.get(i);
         
         System.out.println((i + 1) + ". " + tempChar.charString());
      }   
   }
 
   public Party chooseHeroes( int partySize )
   {  
      int count = 0;
      boolean done = false;
      Scanner user = new Scanner(System.in);
      Party goodGuys = new Party();
      
      while( count < partySize )
      {
         System.out.println("Please choose a member for your party:");
      
         printHeroChoices();
         
         int choice = 99;
         
         Hero tempChar;
                
         while (done == false && choice < 1 && choice > heroes.size());          
         {
            try 
            {
         	   choice = user.nextInt();
              
               if( choice >= 1 && choice <= 8 )
               {
                  done = true;
                  count++;
               }
               else
                  System.out.println( "***Invalid entry, please try again***" );              
            } 
            catch (InputMismatchException e) 
            {
               user.nextLine();
               
               System.out.println("***Invalid entry, please try again***");
            }
         }
         
         if (choice == 1) 
            goodGuys.addHero(new Hunter("Hunter"));
            
         else if (choice == 2) 
            goodGuys.addHero(new Priest("Priest"));
            
         else if (choice == 3) 
            goodGuys.addHero(new Rogue("Rogue"));
            
         else if (choice == 4) 
            goodGuys.addHero(new Warrior("Warrior"));   
         
         else if (choice == 5) 
            goodGuys.addHero(new Druid("Druid"));
            
         else if (choice == 6) 
            goodGuys.addHero(new Paladin("Paladin"));
            
         else if (choice == 7) 
            goodGuys.addHero(new Mage("Mage")); 
            
         else if (choice == 8) 
            goodGuys.addHero(new Shaman("Shaman")); 
      }      
    
      return goodGuys; 
   }

}//HeroChoices