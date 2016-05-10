//Attack interface

public interface IAttack
{
   abstract String getAttackName();
   abstract void toAttack(Character offense, Character defense);
   abstract boolean validAttack(Character offense);
}//end 