import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Dice extends Actor
{
    /**
     * Act - do whatever the Dice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int nDots;       // number dots
    private GreenfootImage img; // GreenfootImage 
    public Dice(int nDots ) // Constructor
    {

        this.nDots = nDots; // init number of dots
        img = DiceImageGenerator.generateImage(nDots); // generate GreenfootImage
        setImage(img); // set GreenfootImage

        // we are not yet clicked, so use the unclicked image for now.

    }   

    public void redrawImage(GreenfootImage existingDiceImage, int newValue){ // redraw image
        DiceImageGenerator.redrawImage(img, newValue);
    }

    public void act() 
    {
        // Add your action code here.
    } 
    //Setter and Getter 
    public GreenfootImage getImg() {
        return img;
    }

    public int getnDots(){
        return nDots;
    }

    public void set(int nDots){
        this.nDots = nDots;
    }
}
