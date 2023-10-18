import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    public void act()
    {
        seePlayer();
        moveRandomly();
    }
    
    public void moveRandomly()
    {
        move(1);
        if (Greenfoot.getRandomNumber(10) < 1)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        
        if (isAtEdge())
        {
            turn(180);
        }
    }
    
    public void seePlayer()
    {
        Actor object = getOneIntersectingObject(Player.class);
        if (object != null)
        {
            getWorld().removeObject(object);
        }
    }
}
