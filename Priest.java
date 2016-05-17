//Omni Consumer Programs 
//Priest

public class Priest extends Hero
{
   public Priest(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Priest", 500, 45, 55, 50, .75, .25, 15 );
   }//end Priest
   
      public void addLevelUpAttack1()
   {
      IAttack attack = new Smite();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new MindSear();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Shadowfiend();
      _attackList.add(attack); 
   }//end addLevelUpAttack3

}//end Rogue Priest