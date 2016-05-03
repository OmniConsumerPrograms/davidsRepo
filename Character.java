//David Hinchman
//Omni Consumer Programs
//Character Parent Class

abstract class Character
{
   private String _name;
   private int _hp;
   private int _maxHp;
   private double _baseHitAmount;
   private double _hitPercent;
   private double _critPercent;
   private int _attackSpd;
   
   //EVC
   protected Character(String name, int maxHp, double baseHitAmount,
                        double hitPercent, double critPercent, int attackSpd)
   {
      _name = name;
      _hp = maxHp;
      _maxHp = maxHp;
      _baseHitAmount = baseHitAmount;
      _hitPercent = hitPercent;
      _critPercent = critPercent;
      _attackSpd = attackSpd; 
   }//end EVC
   
   //check to make sure our hero is aline
   public boolean isLiving()
   {
      if( _hp > 0 )
         return true;
      return false;
   }//end isLiving
   
   //set the hero's name
   public void setName(String name)
   {
      _name = name;
   }//end setName
   
   //get the hero's name
   public String getName()
   {
      return _name;
   }//end getName
   
   //set and check hp is within range
   public void setHp(int hp)
   {
      if(hp < 0)
         _hp = 0;
      else if(hp > _maxHp)
         _hp = _maxHp;
      else
         _hp = hp;
   }//end setHp
   
   //hp get
   public int getHp()
   {
      return _hp;
   }//end getHp
   
   public void setBaseHitAmount( double baseHitAmount)
   {
      _baseHitAmount = baseHitAmount;
   }//end setBaseHitAmount
   
   public double getBaseHitAmount()
   {
      return _baseHitAmount;
   }//end getBaseHitAmount
   
   //set the hit percentage of our hero
   public void setHitPercent(double hitPercent)
   {
      _hitPercent = hitPercent;
   }//end setHitPercent
   
   //get the hit percentage of our hero
   public double getHitPercent()
   {
      return _hitPercent;
   }//end getHitPercent
   
   public void setCritPercent( double critPercent )
   {
      _critPercent = critPercent;
   }//end setCritPercent
   
   public double getCritPercent()
   {
      return _critPercent;
   }//end critPercent
   
   //set the attack speed of our hero
   public void setAttackSpd(int attackSpd)
   {
      _attackSpd = attackSpd;
   }//end setAttackSpd
   
   //get the arrack speed of out hero
   public double getAttackSpd()
   {
      return this._attackSpd;
   }//end getAttackSpd
   
   //toString for the hero 
   public String heroInfo()
   {
      return _name + ": " + this.getHp() + " hit points";
      
   }//end heroInfo
   
   
}