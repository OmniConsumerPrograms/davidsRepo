//Omni Consumer Programs
//Normal Magic Attack

import java.util.*;

public class NormalMagicAttack implements IAttack
{
   private String _attackName;
   
   public NormalMagicAttack()
   {
      _attackName = "Magic Attack";
   }//end EVC
   
   public String getAttackName()
   {
      return _attackName;
   }//end getAttackName
   
   public void toAttack(Character offense, Character defense)
   {
      
   }//end toAttack

   public boolean validAttack(Character offense, Random randGen)
   {
      return true;
   }//end validAttack
}//end NormalMagicAttack