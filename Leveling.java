
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
    
		
		
		if(checkLevel != this.level) 
		{
			System.out.println("Congratulations! " + hero.getName() + " leveled up to " + checkLevel + "!");
				
			if(checkLevel == 1)
			{
				levelUp1(hero);
	            System.out.println(hero.getName() + "'s maximum and minimum damage values have increased and all damage has been healed!\n");
	        }   
	         
	        else if(checkLevel == 2)
	        {
	            levelUp2(hero);
	            System.out.println(hero.getName() + "'s maximum HP has increased and all damage has been healed!\n");
	        }  
			
	        else if(checkLevel == 3)
	        {
	            levelUp3(hero);
	            System.out.println(hero.getName() + " learned a new special attack and all damage has been healed!\n");
	        }  
	        
	        else if(checkLevel == 4)
	        {
	        	levelUp4(hero);
	            System.out.println(hero.getName() + "'s speed has increased and all damage has been healed!\n");
	        }  
	         
	        else if(checkLevel == 5)
	        {
	        	 levelUp5(hero);
	        	 System.out.println(hero.getName() + "'s hit chance is now 100% and all damage has been healed!\n");
	        } 
			
	        else if(checkLevel == 6)
			{
				levelUp6(hero);
	            System.out.println(hero.getName() + "'s maximum and minimum damage values have increased and all damage has been healed!\n");
	        }   
	         
	        else if(checkLevel == 7)
	        {
	            levelUp7(hero);
	            System.out.println(hero.getName() + "'s maximum HP has increased and all damage has been healed!\n");
	        }  
	         
	        else if(checkLevel == 8)
	        {
	            levelUp8(hero);
	            System.out.println(hero.getName() + " learned a new special attack and all damage has been healed!\n");
	        }  
	         
	        else if(checkLevel == 9)
	        {
	            levelUp9(hero);
	            System.out.println(hero.getName() + "'s speed has increased and all damage has been healed!\n");
	        }  
			
	        else if(checkLevel == 10)
			{
				levelUp10(hero);
	            System.out.println(hero.getName() + "'s maximum and minimum damage values have increased and all damage has been healed!\n");
	        }   
	         
	        else if(checkLevel == 11)
	        {
	            levelUp11(hero);
	            System.out.println(hero.getName() + "'s maximum HP has increased and all damage has been healed!\n");
	        }  
	         
	        else if(checkLevel == 12)
	        {
	            levelUp12(hero);
	            System.out.println(hero.getName() + " learned a new special attack and all damage has been healed!\n");
	        }  
	         
	        else if(checkLevel == 13)
	        {
	            levelUp13(hero);
	            System.out.println(hero.getName() + "'s speed has increased and all damage has been healed!\n");
	        }  
	        
	        else if(checkLevel == 14)
	        {
	            levelUp14(hero);
	            System.out.println(hero.getName() + "'s speed has increased and all damage has been healed!\n");
	        }  
	        
	        else if(checkLevel == 15)
	        {
	            levelUp15(hero);
	            System.out.println(hero.getName() + "'s speed has increased and all damage has been healed!\n");
	        }  
	        
	        //hero's HP gets increased to it's max
	        hero.setHpMax(hero.getHpMax()); 
	         
		}
	      
		this.level = checkLevel;
	}

	private void levelUp1(Hero hero)
	{
		
	}
	
	private void levelUp2(Hero hero)
	{
		
	}
	
	private void levelUp3(Hero hero)
	{
		
	}
	
	private void levelUp4(Hero hero)
	{
		
	}
	
	private void levelUp5(Hero hero)
	{
		
	}
	
	private void levelUp6(Hero hero)
	{
		
	}
	
	private void levelUp7(Hero hero)
	{
		
	}
	
	private void levelUp8(Hero hero)
	{
		
	}
	
	private void levelUp9(Hero hero)
	{
		
	}
	
	private void levelUp10(Hero hero)
	{
		
	}
	
	private void levelUp11(Hero hero)
	{
		
	}
	
	private void levelUp12(Hero hero)
	{
		
	}
	
	private void levelUp13(Hero hero)
	{
		
	}
	
	private void levelUp14(Hero hero)
	{
		
	}
	
	private void levelUp15(Hero hero)
	{
		
	}
}
	
	
	
	
	
	
/*   
	private void updateLevel_1(Hero hero) 
	{      
	      //hero gets increased damageMin and damageMax
	      int damageMin = hero.getAttackMax();
	      
	      hero.setAttackMin(damageMin);
	      
	      hero.setAttackMax(damageMin *2);
	      
	   }  
	   
	   private void updateLevel_2(Hero hero) 
	   {
	      //hero gets higher HPMax
	      int HPMax = hero.getHPMax();
	      
	      hero.setHPMax((int)(HPMax * 0.5) + HPMax); 
	   } 
	   
	   private void updateLevel_3(Hero hero) 
	   {
	      //hero learns a new attack
	      hero.addSecondSpecial();
	   } 
	   
	   private void updateLevel_4(Hero hero) 
	   {
	      //hero's speed increases
	      hero.setSpeed(hero.getSpeed() + 2);
	   } 
	   
	   private void updateLevel_5(Hero hero) 
	   {      
	      //hero's hit chance becomes 100%
	      hero.setHitChance(1.0);
	   } 
*/

