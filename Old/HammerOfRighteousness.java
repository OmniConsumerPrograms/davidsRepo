//Omni Consumer Programs
//Hammer of Righteousness - Paladin Attack

import java.util.*;

public class HammerOfRighteousness implements IAttack
{
   private String _attackName;
   
   public HammerOfRighteousness()
   {
      _attackName = "Hammer of Righteousness";
   }//end HammerOfRighteousness
   
   public String getAttackName()
   {
      return _attackName;
   }//end getAttackName
   
   public void toAttack(Character hero, Character villain)
   {
      Random randGen = new Random();
      boolean yes = validAttack(hero, randGen);
   
      if( yes )
      {
         //int dmgAmt = randGen;
         System.out.println( hero.getName() + " hit!" );   
      }
      else
      {
         System.out.println( hero.getName() + " missed!" );
      }

   }//end toAttack
   
   public boolean validAttack(Character hero, Random randGen)
   {
      double randHit = Math.abs(randGen.nextDouble()) % ( 100 ) + 1;
   
      if( randHit <= hero.getHitPercent() )
         return true;
      return false;        
   }//end validAttack

}//end HammerOfRighteousness