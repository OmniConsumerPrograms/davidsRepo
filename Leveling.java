
//OCP
//Leveling 

public class Leveling 
{
	private int level;
	
	public Leveling() 
	{
		//Blank Default Constructor 
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public void levelUp(Hero hero)
	{
		int checkLevel = checkLevel(hero);		
		
		hero.setLevel(checkLevel);
		
		if(checkLevel != this.level) 
		{
			System.out.println("Congratulations!");
			System.out.println(hero.getName() + " has reached level " + hero.getLevel());
			hero.setHpMax(hero.getHpMax() + 25);
			hero.setHp( hero.getHpMax());
			System.out.println("Health increased to " + hero.getHpMax() );
			hero.setAttackMin( hero.getAttackMin() + 10);
			hero.setAttackMax(hero.getAttackMax() + 10);
			System.out.println("Attack increased to " + hero.getAttackMin() + " - " + hero.getAttackMax() );
			hero.setAccuracy(hero.getAccuracy() + 2);
			System.out.println("Accuracy increaded t0 " + hero.getAccuracy());
			hero.setMagDefense(hero.getMagDefense() + 11);
			System.out.println("Magical Defense increased to " + hero.getMagDefense());
			hero.setPhyDefense(hero.getPhyDefense() + 11);
			System.out.println("Physical Defense increased to " + hero.getPhyDefense());

			

	        if(checkLevel == 4)
	        	levelUp4(hero);
	        else if(checkLevel == 8)
	            levelUp8(hero);
	        else if(checkLevel == 12)
	            levelUp12(hero);
		}
		
		this.level = checkLevel;
	}
	
	public int checkLevel(Hero hero)
	{
		int checkLevel = 1;
		
		if (hero.getXp() <= 5)
			checkLevel = 1;	         
		else if(hero.getXp() > 5 && hero.getXp() < 15)
			checkLevel = 2;	      
		else if(hero.getXp() >= 15 && hero.getXp() < 30)
			checkLevel = 3;	      
		else if(hero.getXp() >= 30 && hero.getXp() < 50)
			checkLevel = 4;	      
		else if(hero.getXp() >= 50 && hero.getXp() < 75)
			checkLevel = 5;		
		else if(hero.getXp() >= 75 && hero.getXp() < 105)
			checkLevel = 6;	      
		else if(hero.getXp() >= 105 && hero.getXp() < 140)
			checkLevel = 7;	      
		else if(hero.getXp() >= 140 && hero.getXp() < 180)
			checkLevel = 8;
		else if(hero.getXp() >= 180 && hero.getXp() < 215)
			checkLevel = 9;
		else if(hero.getXp() >= 215 && hero.getXp() < 265)
			checkLevel = 10;
		else if(hero.getXp() >= 265 && hero.getXp() < 320)
			checkLevel = 11;	      
		else if(hero.getXp() >= 320 && hero.getXp() < 380)
			checkLevel = 12;	      
		else if(hero.getXp() >= 380 && hero.getXp() < 445)
			checkLevel = 13;
		else if(hero.getXp() >= 445 && hero.getXp() < 515)
			checkLevel = 14;	      
		else
			checkLevel = 15;
		
		return checkLevel;
	}
	
	private void levelUp4(Hero hero)
	{
		hero.level3Attack();		
		System.out.println(hero.getName() + " gets a new attack!");
		System.out.println(hero.attackList.getAttack(1).getAttackName());
		
	}
	
	private void levelUp8(Hero hero)
	{
		hero.level6Attack();
		System.out.println(hero.getName() + " gets a new attack!");
		System.out.println(hero.attackList.getAttack(2).getAttackName());		
	}
	
	private void levelUp12(Hero hero)
	{
		hero.level9Attack();		
		System.out.println(hero.getName() + " gets a new attack!");
		System.out.println(hero.attackList.getAttack(3).getAttackName());
	}
}

