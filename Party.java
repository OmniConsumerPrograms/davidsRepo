//OCP
//Party

import java.util.*;

public class Party 
{
	private int turn;
	private boolean active; 
	protected Random gen;
	private ArrayList<Character> party;
	
	public Party() 
	{
		this.setTurn(0);
		this.setActive(true);
		this.gen = new Random();
		this.setParty(new ArrayList<Character>());
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	public void turnPlusPlus()
	{
		this.turn++;
	}	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public ArrayList<Character> getParty() {
		return party;
	}

	public void setParty(ArrayList<Character> party) {
		this.party = party;
	}
	
	public Character getChar(int i)
	{
		return this.party.get(i);
	}
	
	public void addChar(Character theChar)
	{
		this.party.add(theChar);
	}
	
	public void removeChar(int i)
	{
		this.party.remove(i);
	}
	
	public int size()
	{
		return this.party.size();
	}
	
	public void partyString()
	{
		int i;
		Character cur;
		
		for( i = 0; i < size(); i++)
		{
			cur = getChar(i);
			System.out.println((i+1) +  ", " + cur.charString() );
		}
	}

}
