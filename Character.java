//Omni Consumer Programs
//Character Parent Class

abstract class Character
{
   private String _name;
   private int _hp;
   private int _maxHp;
   private int _defense;
   private int _hitMin;
   private int _hitMax;
   private double _hitPercent;
   private double _critPercent;
   private int _attackSpd;
   protected AttackList _attackList;

         
   //EVC
   protected Character(String name, int maxHp, int hitMin, int hitMax, int defense,
                        double hitPercent, double critPercent, int attackSpd)
   {
      _name = name;
      _hp = maxHp;
      _maxHp = maxHp;
      _defense = defense;
      _hitMin = hitMin;
      _hitMax = hitMax;
      _hitPercent = hitPercent;
      _critPercent = critPercent;
      _attackSpd = attackSpd;   
      
      _attackList = new AttackList();
    
   }//end EVC
   
   public boolean isLiving()
   {
      if( _hp > 0 )
         return true;
      return false;
   }//end isLiving
   
   public void setName(String name)
   {
      _name = name;
   }//end setName
   
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
   
   public void setDefense(int defense)
   {
      _defense = defense;
   }//end setDefense
   
   public int getDefense()
   {
      return _defense;
   }//end getDefense
   
   public void setHitMin(int hitMin)
   {
      _hitMin = hitMin;
   }//end setBaseHitAmount
   
   public int getHitMin()
   {
      return _hitMin;
   }//end getBaseHitAmount
   
   public void setHitMax(int hitMax)
   {
      _hitMax = hitMax;
   }//end setHitMax
   
   public int getHitMax()
   {
      return _hitMax;
   }//end getHitMax
   
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
   public String charInfo()
   {
      return this.getName() + ": " + this.getHp() + "hp";
   }//end heroInfo
   
   public final void attack(Character incomingCharacter, int choiceInput) 
   {
      IAttack attack = _attackList.getAttack(choiceInput);
      
      attack.toAttack(this, incomingCharacter);
   
   }//close attack 
   
   public void printAttacks() 
   {
      for(int i = 0; i < _attackList.size(); i++) 
      {
         System.out.println((i+1) + ". " + _attackList.getAttack(i).getAttackName());
      }
   }

   public boolean validAttackChoice(int x) 
   {
      if (x >= 0 && x < _attackList.size()) {
         return true;
      }
      
      return false;
   }
   
   
}