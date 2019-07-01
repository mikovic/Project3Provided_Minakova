import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Label(int i){
        // Constructor        
        
        String text = ""+ i; //Create text from number(roll value)
        GreenfootImage img= new greenfoot.GreenfootImage(20,40);  // new empty image
        img.setFont(new Font("Times New Roman", false, false, 20)); // set Font
        img.drawString(text,0,30);   // draww text(from number) 
        setImage(img); // set image
        
    
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
