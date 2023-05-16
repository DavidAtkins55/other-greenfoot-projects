import greenfoot.*;

public class Leaf extends Actor {
    private int speed;

    public Leaf() {
        //makes a random number between 0 and 4
        int random_Number = Greenfoot.getRandomNumber(4);
        String[] images = {"cutoutleaf0.png", "cutoutleaf1.png" , "cutoutleaf2.png" ,"cutoutleaf3.png"};
       
        //the random_number in the sqaure brackets will chose a random entry from the images array above
        //say the random_number is two then it will chose the sencond entry in the list this is called indexing 
        setImage(images[random_Number]);

        speed = Greenfoot.getRandomNumber(5) + 1;
    }

    public void act() {
        setLocation(getX(), getY() + speed);
        setRotation(getRotation() + Greenfoot.getRandomNumber(6) - 3);

        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}
