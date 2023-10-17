import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Animal
{
    private GreenfootImage image;
    int imageNumber = 1;
    
    private int speed = 2;
    Random rd = new Random();
    
    public Enemy()
    {
    }
    
    public void act()
    {
        animate("enemy");
        moveToLeft();
        disappearAndAppear();
    }

    public void animate(String imageName)
    {
        if (frame == 8)
        {
            image = new GreenfootImage("enemy" + imageNumber + ".png");
            setImage(image);
            image.mirrorHorizontally();
            frame = 1;
            imageNumber++;
        }
        else
        {
            frame++;
        }
        
        if (imageNumber > 3)
        {
            imageNumber = 1;
        }
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
