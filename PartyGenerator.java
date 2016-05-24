//OCP
//Party Generator

//import java.util.*;

public class PartyGenerator 
{
	private Party heroes;
	//private Party villains;
	private HeroGenerator heroGen;
	//private VillainGenerator villainGen;
	
	public PartyGenerator() 
	{
		heroes = new Party();
		//villains = new Party();
		heroGen = new HeroGenerator();
		//villainGen = new VillainGenerator();
	}
	
	public int build()
	{
		try
		{
			heroes = heroGen.chooseHeroes();
			//villains = villainGen.createVillains();
			System.out.println("Here is your Party:");
			heroes.partyString();
		}
		catch(Exception e)
		{
			System.out.println("Error building Party");
			return 906;
		}
		return 900;
	}

}
