import java.util.*;
import java.io.*;

public class PartySaveManager extends SaveLoadManager
{
	private Party heroes; 	
	
	public PartySaveManager(Party heroes) 
	{
		this.setHeroes(heroes);
	}
	
	//String name, int hpMax, int attackMin, int attackMax, int speed, int phyDefense, int magDefense, int accuracy, int level
	public void printParty( Party heroes )
	{
		int i;
		PrintWriter fout;
		fout = openFout( heroes );
		System.out.println("printParty before for");
		
		fout.println( heroes.size() );
		
		for( i = 0; i < heroes.size(); i++)
		{

			
			//all of the gets go here
		}
		fout.close();
	}
	
	public PrintWriter openFout( Party heroes )
	{
		PrintWriter fout = null;
		boolean done = false;
		String foutName;
		Scanner user = new Scanner(System.in);
		System.out.println("openFout before while");
		while( done == false )
		{
			System.out.println("Enter file name for saving the game: ");
			foutName = user.nextLine();
			
			try
			{
				fout = new PrintWriter( foutName );
				savedGames.add(foutName);
				done = true;
			}
			catch( FileNotFoundException e)
			{
				System.out.println("Could not open " + foutName);
				System.out.println("Try again");
			}
			
		}
		return fout;
	}

	public Party getHeroes() {
		return heroes;
	}

	public void setHeroes(Party heroes) {
		this.heroes = heroes;
	}
	
	
	
	

}
