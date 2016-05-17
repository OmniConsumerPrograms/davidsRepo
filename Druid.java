//Omni Consumer Programs 
//Druid

public class Druid extends Hero
{
   public Druid(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Druid", 500, 45, 55, 50, .75, .25, 15 );
   }//end Druid
   
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new MoonFire();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new SunFire();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Wraith();
      _attackList.add(attack); 
   }//end addLevelUpAttack3
   
}//end Druid class