//OCP
//Battle

import java.util.*;

public class Battle 
{
	protected Party heroes;
	protected Party villains;
	protected VillainGenerator VG;
	protected Random gen = new Random();
	
	public Battle(Party heroes)
	{
		this.heroes = heroes;
		this.villains = VG.generateVillains(heroes.size());
		villains.partyString();
	}

	public boolean theBattle()
	{
		boolean fled = false;
		System.out.println("You have encountered an group of Enemies!");
	
		while( partiesAlive() && fled == false )
		{
	         int currGoodPos = heroes.getTurn();
	         int currBadPos = villains.getTurn();
	         
	         Character currentGoodGuy = heroes.getChar(currGoodPos);
	         Character currentBadGuy = villains.getChar(currBadPos);
	         
	         HeroTurn turnGoodGuy = new HeroTurn();
	         VillainTurn turnBadGuy = new VillainTurn();
	         
	         if (currentGoodGuy.getSpeed() >= currentBadGuy.getSpeed()) 
	         {
	            fled = turnGoodGuy.executeTurn(heroes, villains); 
	            
	            if (partiesAlive() && fled == false ) 
	            {                
	               turnBadGuy.executeTurn(heroes, villains);
	            }
	            else {
	               break;
	            }                    
	         }    
	         else 
	         {                    
	            turnBadGuy.executeTurn(heroes, villains);
	            if (partiesAlive()) 
	            {                   
	               fled = turnGoodGuy.executeTurn(heroes, villains);
	            }
	            else {
	               break;
	            } 
	            
	         }
	      }
	      battleString();           
	      return fled;
	}
		
	public void battleString()
	{
		if(heroes.size() == 0)
		{
			System.out.println("Your party has defeated the enemy!");
			System.out.println();
		}
		else if(villains.size() == 0)
		{
			System.out.println("Your party has been defeated :'(" );
			System.out.println();
		}
	}
	
	public boolean partiesAlive()
	{
		if( heroes.size() > 0 && villains.size() > 0)
			return true;
		return false;
	}
	
}
