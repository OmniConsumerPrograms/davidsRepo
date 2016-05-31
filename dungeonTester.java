//OCP
//Party Tester 


public class dungeonTester 
{
	public static void main(String[] args)
	{
		Party heroes = new Party();
//		Party villains = new Party();
		HeroGenerator heroGen = new HeroGenerator();
		heroes = heroGen.chooseHeroes();
		heroes.partyString();
	
		for(int i = 0; i < 2; i++)
		{
			Battle battle = new Battle(heroes);
			battle.doBattle();
			heroes.partyString();
		}

		for( int i = 0; i < heroes.size(); i++)
		{
			heroes.getChar(i).statsString();
		}
		
		PartySaveManager PSM = new PartySaveManager( heroes );
		PSM.printParty(heroes);
		
	}
	
}
