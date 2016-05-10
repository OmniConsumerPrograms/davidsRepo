//Omni Consumer Programs
//Normal Attack

import java.util.*;

public class NormalAttack implements IAttack
{
   private String _attackName;
   
   public NormalAttack()
   {  
      _attackName = "Normal Attack";
   }//end NormalAttack
   
   public String getAttackName()
   {
      return _attackName;
   }//end getAttackName
   
   public void toAttack(Character offense, Character defense)
   {
      boolean yes = validAttack(offense);
   
      if( yes )
      {
         System.out.println( offense.getName() + " hit!" );   
      }
      else
      {
         System.out.println( offense.getName() + " missed!" );
      }
   }//end toAttack
   
   public boolean validAttack(Character offense)
   {
      Random gen = new Random();
      double randHit = Math.abs(gen.nextDouble()) % ( 100 ) + 1;
   
      if( randHit <= offense.getHitPercent() )
         return true;
      return false;        
   }//end validAttack
   
}//end normalAttack