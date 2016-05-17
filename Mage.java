//Omni Consumer Programs 
//Mage

public class Mage extends Hero
{
   public Mage(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Mage", 500, 45, 55, 50, .75, .25, 15 );
   }//end Mage
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new Scortch();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new Fireball();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Pyroblast();
      _attackList.add(attack); 
   }//end addLevelUpAttack3

}//end Mage class