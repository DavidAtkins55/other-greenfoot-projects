 import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random.*;


public class Catcher extends Actor
{
    Random getRandomNumber = new Random();
    int score = 0;
    public void act() 
    {
        move();
        checkCollision();
    } 
    
    public boolean isTouchingLeaf()
    {
    return (getOneIntersectingObject(Leaf.class) != null);
    }

    public void removeTouchingLeaf()
    {
    removeTouching(Leaf.class);
    }
    
    public void move() {
    if (Greenfoot.isKeyDown("right")) {
        setLocation(getX() + 5, getY());
    }
    if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - 5, getY());
    }
    }
    public void checkCollision() {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        if (leaf != null) {
            score++;
            getWorld().removeObject(leaf);
        }
    }
    public int getScore() {
        return score;
    }
}
