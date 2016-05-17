//Omni Consumer Programs
//battleTester

import java.util.*;

public class battleTester
{

   public static void main( String[] args )
   {   
      int partySize;
      Scanner user = new Scanner( System.in );

      Party heroes = new Party();
      
      heroes = getHeroes( user ); 
      
      heroes.partyString();
   }
   
   public static Party getHeroes( Scanner user )
   {
      int partySize = 0;
      boolean done = false;

      while( done == false )
      {  
         try
         {
            System.out.println( "How many Heroes would you like in your party?" );
            System.out.println( "You can have 4 to 8 Heroes" );
            System.out.println( "Party Size: " );   
            partySize = user.nextInt();
            if( partySize >= 4 && partySize <= 8 )
               done = true;
            else
               System.out.println( "***Invalid entry, please try again***" );
         }
         catch( InputMismatchException o )
         {
            System.out.println( "***Invalid entry, please try again***" );
            user.nextLine();
         }
      }      
      
      Party heroes = new Party();
      HeroChoices heroesChoices = new HeroChoices();
      heroes = heroesChoices.chooseHeroes( partySize );
      
      return heroes;      
   }//end getHeroes
   
}