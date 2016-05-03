//David Hinchman
//Omni Consumer Programs
//Villian class extends Character

abstract class Villian extends Character
{
   private int _xp;
   
   public Villian(String name, int maxHp, double hitPercent, int attackSpd, int xp)
   {
      super(name, maxHp, hitPercent, attackSpd);
      
      _xp = xp;
   }//end Villian EVC

   public int getXp()
   {
      return _xp;
   }//end getXp

}//end Villian class