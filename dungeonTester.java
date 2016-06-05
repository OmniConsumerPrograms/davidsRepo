import characterset.Battle;
import characterset.HeroGenerator;
import characterset.Party;
import interfaces.IBattle;
import interfaces.IParty;

//OCP
//Party Tester 

public class dungeonTester 
{
	public static void main(String[] args)
	{
		
		IParty heroes = new Party();
//		Party villains = new Party();
		HeroGenerator heroGen = new HeroGenerator();
		heroes = heroGen.chooseHeroes();
		heroes.partyString();
	
		//Here 
		
		for(int i = 0; i < 2; i++)
		{
			Battle battle = new Battle(heroes);
			battle.runBattle();
			heroes.partyString();
		}

		for( int i = 0; i < heroes.size(); i++)
		{
			heroes.getChar(i).charString();
		}
		
		//PartySaveManager PSM = new PartySaveManager( heroes );
		//PSM.printParty(heroes);
		
	}
	
}
