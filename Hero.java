//Omni Consumer Programs
//Heroes class

abstract class Hero extends Character
{
   private int _xp;
   private Level _level;
   protected Inventory _inventory;
   
   protected Hero( String name, int maxHp, int hitMin, int hitMax, 
                   int defense, double hitPercent, double critPercent, int attackSpd)
   {
      super(name, maxHp, hitMin, hitMax, defense, hitPercent, critPercent, attackSpd);

      _inventory = new Inventory();
      _xp = 0;
      _level = new Level();
      _level.setLevel( 1 );
   }//end EVC
   
   //All Heroes must have these methods for leveling up
   abstract void addLevelUpAttack1();
   abstract void addLevelUpAttack2();
   abstract void addLevelUpAttack3();

   public void setXp(int xp)
   {
      _xp = xp;
   }//end setXp
   
   public int getXp()
   {
      return _xp;
   }//end getXp
   
   public void setLevel(int level)
   {
      _level.setLevel(level);
   }//end setLevel
   
   public int getLevel()
   {
      return _level.getLevel();
   }//end getLevel
   
   public Item getInvItem( int i )
   {
      return _inventory.getItem(i);
   }
   
   public int inventorySize()
   {
      return _inventory.bagSize();
   }//end inventorySize
   
   public String charString()
   {
      String s = "";
      s = this.getName() + ", Level: " + getLevel();
      return s;
   }//end toString
}//end Heroes