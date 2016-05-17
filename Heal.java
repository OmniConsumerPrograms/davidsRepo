//Omni Consumer Programs
//Heal 

import java.util.*;

public class Heal implements IAttack
{
   private String _attackName;
   
   public Heal()
   {
      _attackName = "Heal";
   }//end EVC
   
   public String getAttackName()
   {
      return _attackName;
   }//end getAttackName
   
   public void toAttack(Character offense, Character defense)
   {
   
   }
   
   public boolean validAttack(Character offense, Random randGen)
   {
      return true;
   }//end validAttack
   
}//end Heal