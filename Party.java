//Omni Consumer Programs
//Party

import java.util.*;

public class Party
{
   private ArrayList<Character> _party;
   protected Random _randGen = new Random();
   private boolean _active;
   private int _turn;
   
   public Party()
   {
      _active = true;
      ArrayList<Character> party = new ArrayList<Character>();
      _party = party;
      _turn = 0;
   }//end party
   
   public Character getHero( int i )
   {
      return _party.get( i );
   }//end getHero 
   
   public int getTurn()
   {
      return _turn;
   }//end getHero
   
   public void resetTurn()
   {
      _turn = 0;
   }//end resetTurn
   
   public void turnPlusPlus()
   {
      _turn++;
   }//end turnPlusPlus
   
   public void addHero(Character hero)
   {
      _party.add(hero);
   }//end addHero
   
   public void removeHero(int i)
   {
      _party.remove(i);
   }//end removeHero
   
   public int size()
   {
      return _party.size();
   }//end size
   
   public int partySize()
   {
      return _party.size();
   }//end size
   
   public void partyString()
   {
      int i;
      Character curr;
      
      for(i = 0; i < partySize(); i++ )
      {
         curr = getHero(i);
         System.out.println((i+1) + ": " + curr.charInfo() );
      }
   }//end printParty
     
}//end Party