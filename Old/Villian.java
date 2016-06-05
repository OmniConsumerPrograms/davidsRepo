//Omni Consumer Programs
//Villian class extends Character

abstract class Villain extends Character
{
   private int _xp;
   
   public Villain(String name, int maxHp, double hitMin, double hitMax, int defense, 
                  double hitPercent, double critPercent, int attackSpd, int xp)
   {
      super(name, maxHp, hitMin, hitMax, defense, hitPercent, critPercent, attackSpd);
      
      _xp = xp;
   }//end Villain EVC

   public void setXp( int xp )
   {
      _xp = xp;
   }//end setXp
   
   public int getXp()
   {
      return _xp;
   }//end getXp
   
}//end Villain class