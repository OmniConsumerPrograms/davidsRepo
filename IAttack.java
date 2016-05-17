//Omni Consumer Programs
//Attack interface
import java.util.*;

public interface IAttack
{
   abstract String getAttackName();
   abstract void toAttack(Character hero, Character villain);
   abstract boolean validAttack(Character hero, Random gen);
}//end