//Omni Consumer Programs 
//Warrior

public class Warrior extends Hero
{
   public Warrior(String name)
   {
   //String name, int maxHp, double baseHitAmount, 
   //int defense, double hitPercent, double critPercent, int attackSpd
      super( "Warrior", 500, 45, 55, 50, .50, .50, 15 );

      IAttack attack = new NormalMeleeAttack();
      
      _attackList.add(attack);
   }//end Warrior
   
   public void addLevelUpAttack1()
   {
      IAttack attack = new CrushingBlow();
      
      _attackList.add(attack);
   }//end addCrushingBlow
   
   public void addLevelUpAttack2()
   {
      IAttack attack = new Whirlwind();
      _attackList.add(attack);
   }//end addLevelUpAttack3
   
   public void addLevelUpAttack3()
   {
      IAttack attack = new Execute();
      _attackList.add(attack); 
   }//end addLevelUpAttack3
}//end Warrior class
