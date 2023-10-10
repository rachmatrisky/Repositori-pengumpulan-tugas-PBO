import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    Random rd = new Random();
    
    public Cloud(String cloudImage, int cloudSpeed)
    {
        setImage(new GreenfootImage(cloudImage));
        speed = cloudSpeed;
    }
    
    public void act()
    {
        moveToLeft();
        disappearAndAppear();
    }
    
    public void moveToLeft()
    {
        setLocation(getX() - speed, getY());
    }
    
    public void disappearAndAppear()
    {
        if (getX() == 0) {
            setLocation(getWorld().getWidth(), rd.nextInt(getWorld().getHeight()));
        }
    }
}
