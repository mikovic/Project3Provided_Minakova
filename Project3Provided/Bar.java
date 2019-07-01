import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar extends Actor
{
    /**
     * Act - do whatever the Rectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int height;  //   height of Bar
    private GreenfootImage img; //GreenfootImage
    private int value;   // roll value
    private int count;   //  count/frequency
    private int width;   // width of bar
    private int posX;    // coordinats of Bar
    private int posY;
    public Bar(int posX, int posY, int value, int count,int width, int height) { //Constructor for Bar
     this.posX = posX; // initialize coordinats
     this.posY = posY;
     this.value = value;// initialize value
     this.count = count;// initialize count
     this.width = width;// initialize width
     this.height = height;  // initialize height 
     img = new GreenfootImage( width-4, height/2); // new empty img 
     
     img.setColor(Color.RED); //set color
     img.fill();   // draw rect
     img.drawRect(0, 0, width, height);  
     // set image     
     setImage(img);
     
        
    }
    
    public void redraw(){
     img = new GreenfootImage( this.width-4, this.height); //new empty img
     // set color
     img.setColor(Color.RED);
     
     img.fillRect(0, 0, this.width-4, this.height/2);// draw rect    
     setImage(img); // set image
    }
    public void setHeight(int height) {//set Height
        this.height = height;
    }
    public int getHeight() {   //get Height
        return height;
    }
    public void setValue(int value) {  // set value
        this.value = value;
    }
    public int getValue() {   // get value
        return value;
    }
    public void setCount(int count) {  // set Count
        this.count = count;
    }
    public int getCount() {  //get Count
        return count;
    }
    public int getPosX() { // get posX
        return posX;
    }
    public int getPosY() {  // get posY
        return posY;
    }
    public void setPosX(int posX) {  // set posX
        this.posX = posX;
    }
    public void setPosY(int posY) {   // set posY
        this.posY = posY;
    }
}
