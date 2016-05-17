//Omni Consumer Programs
//Execite - Warrior Attack

import java.util.*;

public class Execute implements IAttack
{
   private String _attackName;
   
   public Execute()
   {
      _attackName = "Execute";
   }//end EVC
   
   public String getAttackName()
   {
      return _attackName;
   }//end getAttackName
   
   public void toAttack(Character hero, Character villain)
   {
      int dmgAmt;
      Random randGen = new Random();
      boolean yes = validAttack(hero, randGen);
   
      if( yes )
      {
         dmgAmt = randGen.nextInt() % ((hero.getHitMax() - hero.getHitMin())+1);
         villain.setHp( villain.getHp() - dmgAmt );
         System.out.println( hero.getName() + "'s " + getAttackName() + " hit " 
                              + villain.getName() + " for " + dmgAmt + "hp." ); 
         System.out.println(villain.getName() + " has " + villain.getHp() + "hp.");
      }
      else
      {
         System.out.println( hero.getName() + " missed!" );
         System.out.println(villain.getName() + " has " + villain.getHp() + "hp." );

      }
   }//end toAttack
      
   public boolean validAttack(Character hero, Random randGen)
   {
      double randHit = Math.abs(randGen.nextDouble()) % ( 100 ) + 1;
   
      if( randHit <= hero.getHitPercent() )
         return true;
      return false;        
   }//end validAttack

}//end Execute
