//OCP
//Party Tester 


public class dungeonTester 
{
	public static void main(String[] args)
	{
		Party heroes = new Party();
		HeroGenerator heroGen = new HeroGenerator();
		heroes = heroGen.chooseHeroes();
		heroes.partyString();
	}
}
