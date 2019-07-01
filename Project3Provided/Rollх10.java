import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rollх10Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rollх10 extends ActionButton
{
    /**
     * Act - do whatever the Rollх10Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rollх10()
    {
        super("Roll х10");
    }
    public void performAction() 
    {
        // Add your action code here.
         MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.roll10();
    }   
        
}
