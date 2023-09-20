import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle extends Actor
{
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    Random random = new Random();
    int[] degrees = {100, -100};
    int randomDegree = degrees[random.nextInt(degrees.length)];
    
    public void act()
    {
        move(5);
        turnRandom();
        turnAtEdge();
        checkCollision();
    }
    
    public void turnRandom() 
    {
        if (Greenfoot.getRandomNumber(100) < 7)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
    
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(180);
        }
    }
    
    public void checkCollision()
    {
        if (getOneIntersectingObject(null) != null)
        {
            turn(randomDegree);
        }
    }
}
