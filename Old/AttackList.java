//OCP
//AttackList to hold Hero/Villain attacks

import java.util.*;

public class AttackList 
{
	private ArrayList<IAttack> attacks;
	
	public AttackList()
	{
		ArrayList<IAttack> attacks = new ArrayList<IAttack>();
		this.attacks = attacks;
	}
	
	public IAttack getAttack(int find)
	{
		return attacks.get(find);
	}
	
	public void addAttack(IAttack addAttack)
	{
		this.attacks.add(addAttack);
	}
	
	public void removeAttack(int removeAttack)
	{
		this.attacks.remove(removeAttack);
	}
	
	public int size()
	{
		return this.attacks.size();
	}
	
	
	
}
