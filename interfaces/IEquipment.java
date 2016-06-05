// OCP 
//Equipment Interface

package interfaces;

public interface IEquipment extends IUsable
{
	public int getID();
	
	public String getName();
	
	public String getEquipmentType();
	
	public int getEventID();
	
	public int getDurability();
	
	public double getWeight();
	
	public void setTier(int tier);
	
	public int getTier();
	
	public int getSpeed();
	
	public int getPhysicalDefense();
	
	public int getMagicalDefense();
		
	public double getValue();
	
	public int getPFLimit();
}