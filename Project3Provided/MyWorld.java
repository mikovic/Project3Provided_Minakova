import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    // Two dices
    Dice dice1;
    Dice dice2;
    int numSides; // number of sides
    ArrayList<Bar> listBar; // arrayList with bars of a histogram
    int posX = 270; //initial coordinate on axis X
    int posY = 500; //initial coordinate on axis Y
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        numSides = 6; // initial numSides
        showText("Sides on Dice",80, 20); // Show text coordinats x and y
        //initialize buttons and add its in the myWorld. Show text Actions
        DecreaseSides decrease = new DecreaseSides(); 
        addObject(decrease, 50,50);
        showText("" + numSides, 80, 50);
        IncreaseSides increase = new IncreaseSides();
        addObject(increase, 110,50);
        showText("Actions", 80, 410);
        RollButton roll = new RollButton();
        addObject(roll, 80,450);
        Rollх10 roll10 = new Rollх10();
        addObject(roll10, 80,480);
        ResetCounts reset = new ResetCounts();
        addObject(reset, 80, 510);
        SortByValue sortByValue = new SortByValue();
        addObject(sortByValue, 80, 540); 
        SortByCount sortByCount = new SortByCount();
        addObject(sortByCount, 80, 570);
        listBar = new ArrayList<>(); // initial arrayList
        // initialize two dices and add its in the myWorld
        dice1 = new Dice(1);
        dice2 = new Dice(1);
        addObject(dice1, 80, 160);
        addObject(dice2, 80, 290);
        int widthBar = 500/(2 * numSides -1); //width bars in the histogram. Lenth of a histogram set 500 pixel          
        // initalize bars of the histogram an add its in the myWorld
        for(int i = 2; i <= 2*numSides; i++) {
            Bar bar= new Bar(posX, posY, i, 0, widthBar, 5);
            addObject(bar,posX, posY);
            //add bar in the ArrayList<Bar>. Roll value for Bar(i) between 2 and 12. Position Bar in the ArrayList pos = value -2;
            listBar.add(bar);     
            addObject(bar,posX, posY);
            Label label = new Label(i); // create Label in loop with values i =2...12(numSides =6)
            addObject(label, posX, posY+10);// add label in the myWorld
            // increase posX
            posX = posX + widthBar;
        }

    } 

    public void act() 
    {
        GreenfootImage img1 = dice1.getImg(); //get img from dice
        GreenfootImage img2 = dice2.getImg();
        int nDots1 = dice1.getnDots(); //get number dots
        int nDots2 = dice2.getnDots();
        dice1.redrawImage(img1,nDots1 ); // redraw image of the dice
        dice2.redrawImage(img2, nDots2);

    }

    public void decreaseSides() 
    {
        List<Bar> bars = getObjects(Bar.class);  // remove bars from the myWorld      
        removeObjects(bars);
        listBar.clear(); // ArrayList clear from bars

        if(numSides > 2) { // if statement true decrease numSiades and remove text with numSides
            numSides = numSides - 1;
            showText("" + numSides, 80, 50);
        }
        int widthBar = 500/(2 * numSides -1); // new width of bars
        List<Label> labels = getObjects(Label.class); // remove labels from myWorld
        removeObjects(labels);
        for(int i = 2; i <= 2*numSides; i++) {
            Bar bar= new Bar(posX, posY, i, 0, widthBar, 5); // create new bars and add its in the myWorld
            addObject(bar,posX, posY);
            Label label = new Label(i); // create new Label and set under bar
            addObject(label, posX, posY+10);

            listBar.add(bar);// add bar in the myWorld
            posX = posX + widthBar; // increase posX
        }
        posX = 270;// set starting position
        posY = 500;
    }

    public void increaseSides() {
        List<Bar> bars = getObjects(Bar.class); // remove all bars
        removeObjects(bars);
        listBar.clear(); //ArrayList<Bar> clear

        if(numSides < 12) {// if statement true increase numSiades and remove text with numSides
            numSides = numSides + 1;            
            showText("" + numSides, 80, 50);

        }
        int widthBar = 500/(2 * numSides -1); // new width of bars
        List<Label> labels = getObjects(Label.class); // remove Labels
        removeObjects(labels);
        for(int i = 2; i <= 2*numSides; i++) { 
            Bar bar= new Bar(posX, posY, i, 0, widthBar, 5);// initialize bar and add in the myWorld. width =widthBar - 2; heigt=5
            addObject(bar,posX, posY); // add Bar in the myWorld
            Label label = new Label(i);// initialize Label and add in the myWorld
            addObject(label, posX, posY+10);
            listBar.add(bar); // add Bar in the ArrayList<Bar>
            posX = posX + widthBar;
        }
        posX = 270; // set starting position
        posY = 500;
    }

    public void resetCounts(){
        List<Bar> bars = getObjects(Bar.class); // remove all bars
        removeObjects(bars);
        List<Label> labels = getObjects(Label.class);//// remove all labels
        removeObjects(labels);
        listBar.clear(); // ArrayList<Bar> clear
        int widthBar = 500/(2 * numSides -1);  // new width Bar      

        for(int i = 2; i <= 2*numSides; i++) {
            Bar bar= new Bar(posX, posY, i, 0, widthBar, 5);// crate Bar and add in the myWorld
            addObject(bar,posX, posY);
            Label label = new Label(i); // crate Label and add in the myWorld
            addObject(label, posX, posY+10);
            listBar.add(bar);    // add Bar to ArrayList<Bar>     

            posX = posX + widthBar;// increase posX
        }
        posX = 270; // set starting position
        posY = 500;
    }

    public void roll(){
        int nDots1 = 0; // initalize number of dots for dice1
        int nDots2 = 0; // initalize number of dots for dice2
        while(nDots1 == 0 || nDots2 == 0){ //while statment true call Greenfoot.getRandomNumber(numSides +1)
            nDots1 = Greenfoot.getRandomNumber(numSides +1);// getRandomNumber with 0 before number. So  numSides +1
            nDots2 = Greenfoot.getRandomNumber(numSides +1); 
        }
        dice1.set(nDots1); // initalize number of dots for dices
        dice2.set(nDots2);
        List<Bar> bars = getObjects(Bar.class); // remove bars and labels from the myWorld
        removeObjects(bars);
        List<Label> labels = getObjects(Label.class);
        removeObjects(labels);        
        int value = nDots1 + nDots2;//sum of dots
        Bar bar = listBar.get(value-2);// get bar from ArrayList<Bar>. Position Bar with roll value in the ArrayList<Bar> = value -2 
        int height = bar.getHeight();// get height of bar
        int count = bar.getCount();// get count/requency of bar
        count = count + 1; // increase count/requency of bar
        height = height +5; // increase height of bar
        bar.setHeight(height); // set height
        bar.setCount(count);  // set count
        bar.redraw(); // call nmethod redraw
        for(Bar rect: listBar){
            // get coordinats of Bar and add Bar to the myWorld 
            int posX = rect.getPosX();
            int posY = rect.getPosY();
            addObject(rect,posX, posY);
            Label label = new Label(rect.getValue());// Get roll value from Bar and create new Label
            addObject(label, posX, posY+10); //add Label to the myWorld

        }
        posX = 270; // set starting position
        posY = 500;
    }

    public void roll10(){
        for(int i =0; i < 10; i++) { //call metod roll 10 times
            roll();
        }
    }

    public void sortByCount(){
        listBar.sort(Comparator.comparing(Bar::getCount)); //Sort ArrayList with Comparator(field: getCount)
        List<Bar> bars = getObjects(Bar.class);   // remove bars from the myWorld     
        removeObjects(bars);
        List<Label> labels = getObjects(Label.class); // remove labels from the myWorld 
        removeObjects(labels);        
        int widthBar = 500/(2 * numSides -1);// new width of bar
        for(Bar rect: listBar){  //sorted listBar. Need to set new coordinate values
            rect.setPosX(posX); // set posX Bar 
            rect.setPosY(posY); // set posY   
            posX = posX +widthBar;// increase posX
        }
        for(Bar rect: listBar){ //sorted listBar
            int posX = rect.getPosX(); // get Bar posY 
            int posY = rect.getPosY(); // get Bar posY
            addObject(rect, posX, posY); // add bar to the myWorld
            Label label = new Label(rect.getValue()); // get roll value from bar and create Label
            addObject(label, posX, posY+10); // add Label to the myWorld

        }
        posX = 270; // set starting position
        posY = 500;
    }

    public void sortByValue(){
        listBar.sort(Comparator.comparing(Bar::getValue)); ////Sort ArrayList with Comparator(field: getValue)
        List<Bar> bars = getObjects(Bar.class);  // remove bars and labels from myWorld      
        removeObjects(bars);
        List<Label> labels = getObjects(Label.class);
        removeObjects(labels);        
        int widthBar = 500/(2 * numSides -1);// width Bar
        for(Bar rect: listBar){ //sorted listBar. Need to set new coordinate values
            rect.setPosX(posX); // set Bar posX 
            rect.setPosY(posY); // set Bar posY     
            posX = posX +widthBar; // increase posX
        }
        for(Bar rect: listBar){ //sorted listBar
            int posX = rect.getPosX(); // get Bar posX 
            int posY = rect.getPosY(); // get Bar posY 
            addObject(rect,posX, posY); // add Bar to the myWorld
            Label label = new Label(rect.getValue()); // Get roll value from Bar and create new Label 
            addObject(label, posX, posY+10);

        }
        posX = 270; // set starting position
        posY = 500;
    }

}
