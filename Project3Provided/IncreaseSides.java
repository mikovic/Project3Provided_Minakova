import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IncreaseSidesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IncreaseSides extends ActionButton
{
    /**
     * Act - do whatever the IncreaseSidesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public IncreaseSides()
    {
        super(" + ");
    }
    public void performAction() 
    {
        // Add your action code here.
        MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.increaseSides();
    }    
}
