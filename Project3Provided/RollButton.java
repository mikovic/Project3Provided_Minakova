import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RollButton extends ActionButton
{
    /**
     * Act - do whatever the RollButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RollButton()
    {
        super("Roll");
    }
    public void performAction() 
    {
        // Add your action code here.
         MyWorld myWorld = (MyWorld) this.getWorld();
        myWorld.roll();
    }   
       
}
