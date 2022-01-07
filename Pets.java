
/**
 * Write a description of class Pets here.
 *
 * @author Shiroya R.
 * @version 03-18-2020
 */
public class Pets
{
    private String petName;
    private String petType;
    private double costToAdopt;
    
    public Pets()
    {
        petName = new String("unknown");
        petType = new String("Unknown");
        costToAdopt = 0;
        
    }
    
    public Pets(String pType, String pName, double cost)
    {
        petName = new String(pName);
        petType = new String(pType);
        costToAdopt = cost;
        
    }
    
    public String toString()
    {
        return "\nPet Name: " + this.petName + "\tPet Type: " + 
        this.petType + "\tCost To Adopt: " + this.costToAdopt;
        
    }
    
    public boolean equals(Pets other)
    {
        return this.petName.equals(other.petName)
        && this.petType.equals(other.petType);
         
    }
    
    public int compareTo(Pets other)
    {
        int adoption;
        if(this.costToAdopt > other.costToAdopt)
        {
            adoption = 1;
        }
        else if(this.costToAdopt == other.costToAdopt)
        {
            adoption = 0;
        }
        else
        {
            adoption = -1;
        }
        return adoption;
    }
}
