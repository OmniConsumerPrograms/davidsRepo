//Omni Consumer Programs 
//Hunter

public class Hunter extends Hero
{
   public Hunter(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Hunter", 500, 45, 55, 50, .75, .25, 15 );
      
      IAttack attack = new NormalMeleeAttack();
      _attackList.add(attack);

      
   }//end Hunter
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new AutoShot();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new SteadyShot();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new MultiShot();
      _attackList.add(attack); 
   }//end addLevelUpAttack3
   
}//end Hunter class