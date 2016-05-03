//David Hinchman
//Omni Consumer Programs
//Heroes class

abstract class Hero extends Character
{
   private int _xp;
   private Level _level;
   //we will need an inventory class, talk with Brad

   protected Hero( String name, int maxHp, double baseHitAmount, double hitPercent, double critPercent, int attackSpd)
   {
      super(name, maxHp, baseHitAmount, hitPercent, critPercent, attackSpd);
   
      _xp = 0;
      
      _level = new Level();
      _level.setLevel( 1 );
   }//end EVC

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
   
   public Level getLevel()
   {
      return _level;
   }//end getLevel
}//end Heroes