import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Animal
{   
    public Bird()
    {
        setImage(new GreenfootImage("image3.png"));
    }
    
    public void act()
    {
        fallDown();
        jump();
        animate("image");
    }
    
    public void jump()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            setLocation(getX(), getY() - 10);
        }
    }
    
    public void fallDown()
    {
        setLocation(getX(), getY() + 2);
        
        if (getY() == getWorld().getHeight() - 1)
        {
            Greenfoot.stop();
        }
    }
}
