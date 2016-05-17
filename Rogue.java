//Omni Consumer Programs 
//Rogue

public class Rogue extends Hero
{
   public Rogue(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Rogue", 500, 45, 55, 50, .75, .25, 15 );
   
      IAttack attack = new NormalMeleeAttack();
      _attackList.add(attack);
   
   }//end Rogue
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new SinisterStrike();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new Gourge();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Eviscerate();
      _attackList.add(attack); 
   }//end addLevelUpAttack3

}//end Rogue class