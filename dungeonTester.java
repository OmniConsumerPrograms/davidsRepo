import characterset.Battle;
import characterset.HeroGenerator;
import characterset.Party;
import characterset.PartyManager;
import interfaces.IBattle;
import interfaces.IParty;

//OCP
//Party Tester 

public class dungeonTester 
{
	public static void main(String[] args)
	{
		
		PartyManager PM = new PartyManager();
		
		//PM.set(hero);
		
		
		IParty heroes = new Party();
		HeroGenerator heroGen = new HeroGenerator();
		heroes = heroGen.chooseHeroes();
		heroes.partyString();
	
		//Here 
		
		//for(int i = 0; i < 2; i++)
		//{
			Battle battle = new Battle(heroes);
			int j = 1;
			int k = battle.runBattle(j);
			System.out.println(k);
			heroes.partyString();
		//}

		for( int i = 0; i < heroes.size(); i++)
		{
			heroes.getChar(i).charString();
		}
		
		PartySaveManager PSM = new PartySaveManager( heroes );
		PSM.printParty(heroes);
		
	}
	
}
