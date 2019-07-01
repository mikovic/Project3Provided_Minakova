import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResetCountsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetCounts extends ActionButton
{
    /**
     * Act - do whatever the ResetCountsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ResetCounts()
    {
        super("Reset Counts");
    }
    public void performAction() 
    {
        // Add your action code here.
         MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.resetCounts();
    }    
     
}
