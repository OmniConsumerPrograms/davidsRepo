import java.util.*;

public class Battle
{
	protected Party heroes;
	protected Party villains;
	protected VillainGenerator VG = new VillainGenerator();
	protected Random randomGenerator = new Random();
      
	public Battle(Party heroes)
	{
		this.heroes = heroes;
		this.villains = VG.generateVillains(heroes.size());
	}
   
	public boolean doBattle()
	{
		System.out.println("You have encountered ");
		boolean fled = false;
      
		while (checkPartiesAlive() && fled == false) 
		{
			int currGoodPos = heroes.getTurn();
			int currBadPos = villains.getTurn();
         
			Character currentHero = heroes.getChar(currGoodPos);
			Character currentVillain = villains.getChar(currBadPos);
         
			HeroTurn turnHero = new HeroTurn();
			VillainTurn turnVillain = new VillainTurn();
         
			if (currentHero.getSpeed() >= currentVillain.getSpeed()) 
			{
				fled = turnHero.executeTurn(heroes, villains); 
            
				if (checkPartiesAlive() && fled == false ) 
				{                
					turnVillain.executeTurn(villains, heroes);
				}
				else 
				{
					break;
				}   
                              
			}     
			else 
			{                    
				turnVillain.executeTurn(villains, heroes);

				if (checkPartiesAlive()) 
				{                   
					fled = turnHero.executeTurn(heroes, villains);
				}
           
				else 
				{
					break;
				} 
            
			}
		}      
		printResult();
        return fled;
        
	}
	
	public boolean checkPartiesAlive() 
	{
		return heroes.size() > 0 && villains.size() > 0;  
	}
   
	public void printResult() 
	{
		if(villains.size() <= 0)
		{
			System.out.println("Your party has survived! Good work!\n");
		}
		if (heroes.size() <= 0) 
		{ 
			System.out.println("Your party has been defeated! It is a sad day\n"); 
		}   	
	}
}