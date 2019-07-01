import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SortByValueButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortByValue extends ActionButton
{
    /**
     * Act - do whatever the SortByValueButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SortByValue()
    {
        super("Sort By Value");
    }
    public void performAction() 
    {
        // Add your action code here.
         MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.sortByValue();
    } 
       
}
