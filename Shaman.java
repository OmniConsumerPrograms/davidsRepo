//Omni Consumer Programs 
//Shaman

public class Shaman extends Hero
{
   public Shaman(String name)
   {
   //String name, int maxHp, double baseHitAmount,
   //double hitPercent, double critPercent, int attackSpd
      super( "Shaman", 500, 45, 55, 50, .75, .25, 15 );
   }//end Shaman
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new StormStrike();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new LavaLash();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Windfury();
      _attackList.add(attack); 
   }//end addLevelUpAttack3

}//end Shaman class