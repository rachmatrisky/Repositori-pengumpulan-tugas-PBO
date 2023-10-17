import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Animal
{   
    private GreenfootImage image;
    
    public Bird()
    {
        image = new GreenfootImage("image3.png");
        setImage(image);
    }
    
    public void act()
    {
        fallDown();
        jump();
        animate("image");
        die();
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
    
    public void die()
    {
        if (getOneIntersectingObject(Enemy.class) != null)
        {
            Greenfoot.stop();
            getWorld().removeObject(this);
        }
    }
}
