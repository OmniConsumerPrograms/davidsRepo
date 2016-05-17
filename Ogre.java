//Omni Consumer Programs
//Villain - Ogre

import java.util.*;

public class Ogre extends Villain
{
   private String _villainName;

   public Ogre( String name )
   {
      //public Villian(String name, int maxHp, double hitMin, hitMax, int defense, 
      //            double hitPercent, double critPercent, int attackSpd, int xp)
      

      super( name, 5000, 69, 70, 50, .85, .25, 40, 6 ); 
   }//end EVC

   public void setName( String name )
   {
      _villainName = name;
   }
   
   public String getName()
   {
      return _villainName;
   }


}//end Ogre