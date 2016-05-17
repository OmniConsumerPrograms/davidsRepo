//Omni Consumer Programs 
//Paladin

public class Paladin extends Hero
{
   public Paladin(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Paladin", 500, 45, 55, 50, .75, .25, 15 );

      IAttack attack = new NormalMeleeAttack();
      _attackList.add(attack);   
   
   }//end Paladin
   
      public void addLevelUpAttack1()
   {
      IAttack attack = new HammerOfRighteousness();
      
      _attackList.add(attack);
   }//end addLevelUoAttack1
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new SwordOfLight();
      _attackList.add(attack);
   }//end addLevelUpAttack2
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new DevineStorm();
      _attackList.add(attack); 
   }//end addLevelUpAttack3

}//end Paladin class