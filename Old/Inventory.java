//Omni Consumer Programs
//Inventory

import java.util.*;

public class Inventory
{
   private ArrayList<Item> _bag;
   
   public Inventory()
   {
      ArrayList<Item> currIn = new ArrayList<Item>();
      _bag = currIn;
      
   }//end EVC
   
   public void addItem( Item item )
   {
      _bag.add( item );
   }//end addItem
   
   public void removeItem( int oldItem )
   {
      _bag.remove( oldItem );
   }//end removeItem
   
   public int bagSize()
   {
      return _bag.size();
   }//end bagSize
   
   public Item getItem( int i )
   {
      return _bag.get( i );
   }//end getItem
}//end Inventory