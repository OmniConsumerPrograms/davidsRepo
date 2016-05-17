//Omni Consumer Programs
//AttackList

import java.util.ArrayList;

public class AttackList
{
   private ArrayList<IAttack> _attackList;
   
   public AttackList()
   {
      ArrayList<IAttack> newAttackList = new ArrayList<IAttack>();
      _attackList = newAttackList;
   }//end AttackList
   
   public void add(IAttack attack)
   {
      _attackList.add(attack);
   }//end add
   
   public int size()
   {
      return _attackList.size();
   }//end size
   
   public IAttack getAttack(int i)
   {
      return _attackList.get(i);
   }//end getAttack
   
}//end AttackList