import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SortByCountButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortByCount extends ActionButton
{
    /**
     * Act - do whatever the SortByCountButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SortByCount()
    {
        super("Sort By Count");
    }
    
    public void performAction() 
    {
        // Add your action code here.
         MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.sortByCount();
    }   
      
}
