//OCP
//Party Generator

public class PartyGenerator 
{
	private Party heroes;
	private HeroGenerator heroGen;
	
	public PartyGenerator() 
	{
		heroes = new Party();
		heroGen = new HeroGenerator();
	}
	
	public int build()
	{
		try
		{
			heroes = heroGen.chooseHeroes();
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
