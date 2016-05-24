//OCP
//Villain Generator
//Creates a random amount of villains from one to the size of the heroes' party size

import java.util.*;

public class VillainGenerator 
{
	private ArrayList<Villain> villains;
	
	public VillainGenerator() 
	{
		villains = new ArrayList<Villain>();
	      
		Villain tempChar;
	      
		tempChar = new Yeti();
		villains.add(tempChar);
	      
		tempChar = new Ogre();
		villains.add(tempChar);
	}
	
	public Party generateVillains(int numVillains)
	{
		int i, tempVillain;
		Party villainsParty = new Party();
		Random gen = new Random();
		
		for(i = 0; i < numVillains; i++)
		{	
			tempVillain = gen.nextInt(10) + 1;
			Villain vil = pickVillain( tempVillain );
			
			villainsParty.addChar(vil);
		}
		return villainsParty;
	}
	
	public Villain pickVillain(int typeVillain)
	{
		Villain villain = null;
		
		if(typeVillain < 5)
			villain = new Yeti();
		else if(typeVillain < 10)
			villain = new Ogre();
		
		return villain;
	}
	
	public void printHero()
	{
		Villain tempChar;
		for (int i = 0; i < villains.size(); i++)
		{
			tempChar = villains.get(i);
			System.out.println((i + 1) + ". " + tempChar.charString());
		}   
	}

}
