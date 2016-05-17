import java.util.*;

public class VillainGenerator
{
   //private ArrayList<Villain> villains;   
   
   public VillainGenerator()
   {
      
   }//end VillainGenerator
   
   public Party getVillains()
   {
      Party villains = new Party();
   
      villains.addHero(new Yeti("Steve the Yeti"));
      villains.addHero(new Troll("Tom the Troll"));
      villains.addHero(new Ogre("OP the Ogre"));
   
      return villains;
   }//end getVillains
   
}//end VillainGenerator