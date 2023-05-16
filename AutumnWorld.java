import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AutumnWorld  extends World
{
    private ScoreBoard scoreBoard; // A reference to the scoreboard object
    
    private static final int probability = 1;
    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public AutumnWorld()
    {    
        // Create a new world 750 by 500 pixels in size.
        super(750, 500, 1);
        scoreBoard = new ScoreBoard(); // Create a new scoreboard object
        addObject(scoreBoard, 50, 25); // Add it to the world at a fixed position
        addObject(new Catcher(), getWidth() / 2, getHeight() - 50);
    }
    
   /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        new AutumnWorld();
        if (Greenfoot.getRandomNumber(100) < probability) {
            addObject(new Leaf(), Greenfoot.getRandomNumber(750), 0);
            //chooses where 
        }
        scoreBoard.update();
 
    }
    
}
