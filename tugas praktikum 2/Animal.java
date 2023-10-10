import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int frame = 1;
    private int imageNumber = 1;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void animate(String imageName)
    {
        if (frame == 8)
        {
            setImage(new GreenfootImage(imageName + imageNumber + ".png"));
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
}
