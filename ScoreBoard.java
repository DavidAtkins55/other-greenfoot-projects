import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScoreBoard extends Actor
{
    private int score; // A variable to store the score
    
    public ScoreBoard()
    {
        score = 0; // Initialize the score to zero
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK)); // Set the image of the actor to show the score
    }
    
    public void update()
    {
        World world = getWorld(); // Get a reference to the world
        Catcher catcher = world.getObjects(Catcher.class).get(0); // Get a reference to the catcher object
        if (catcher.isTouchingLeaf()) // Check if the catcher is touching any leaf object
        {
            score++;
            catcher.removeTouchingLeaf(); // Remove the leaf object from the world
            setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK)); // Update the image of the actor to show the new score
        }
    }
}
