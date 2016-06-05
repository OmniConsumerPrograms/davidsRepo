//OCP
//Attack Interface

import java.util.Random;

public interface IAttack {
	
	abstract String getAttackName();
	
	abstract void setAttackName(String attackName);

	abstract void toAttack(Character hero, Character villain);
	
	abstract boolean validAttack(Character hero, Random gen);
}
