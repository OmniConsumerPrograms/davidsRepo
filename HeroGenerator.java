//OCP
//Hero Generator

import java.util.*;

public class HeroGenerator 
{
	private ArrayList<Hero> heroes;
	
	public HeroGenerator() 
	{
		heroes = new ArrayList<Hero>();
	      
		Hero tempChar;
	      
		tempChar = new Hunter();
		heroes.add(tempChar);
	      
		tempChar = new Rogue();
		heroes.add(tempChar);
	      	
		tempChar = new Priest();
		heroes.add(tempChar);
	      
		tempChar = new Warrior();
		heroes.add(tempChar);
	      
		tempChar = new Druid();
		heroes.add(tempChar);
	      
		tempChar = new Paladin();
		heroes.add(tempChar);
	      
		tempChar = new Mage();
		heroes.add(tempChar);
	      
		tempChar = new Shaman();
		heroes.add(tempChar);
   }     
	
	public void printHero()
	{
		Hero tempChar;
		for (int i = 0; i < heroes.size(); i++)
		{
			tempChar = heroes.get(i);
			System.out.println((i + 1) + ". " + tempChar.charString());
		}   
	}
	 
	public Party chooseHeroes()
	{  
		int count = 0, partySize = 0;
		boolean done = false;
		Scanner user = new Scanner(System.in);
		Party heroes = new Party();
	      
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
	      
		while( count < partySize )
		{
			int j = 1;
			System.out.println("Please choose  a member for your party:");
			printHero();
			int choice = -1;
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
				heroes.addChar(new Hunter());
			else if (choice == 2) 
				heroes.addChar(new Priest());
			else if (choice == 3) 
	        	 heroes.addChar(new Rogue());
			else if (choice == 4) 
	        	 heroes.addChar(new Warrior());   
			else if (choice == 5) 
	        	 heroes.addChar(new Druid());
			else if (choice == 6) 
	        	 heroes.addChar(new Paladin());
			else if (choice == 7) 
	        	 heroes.addChar(new Mage()); 
			else if (choice == 8) 
	        	 heroes.addChar(new Shaman()); 
		}      
	      return heroes; 
	   }


}
