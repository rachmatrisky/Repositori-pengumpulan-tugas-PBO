import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private GreenfootImage idle = new GreenfootImage("idle.png");
    private GreenfootImage up = new GreenfootImage("up.png");
    private GreenfootImage right = new GreenfootImage("right.png");
    private GreenfootImage left = new GreenfootImage("left.png");
    
    private GreenfootImage Uidle = new GreenfootImage("Uidle.png");
    private GreenfootImage Uwalk1 = new GreenfootImage("walkD1.png");
    private GreenfootImage Uwalk2 = new GreenfootImage("walkU2.png");
    private GreenfootImage Uwalk3 = new GreenfootImage("walkU3.png");
    
    private GreenfootImage Ridle = new GreenfootImage("Ridle.png");
    private GreenfootImage Rwalk1 = new GreenfootImage("Rwalk1.png");
    private GreenfootImage Rwalk2 = new GreenfootImage("Rwalk2.png");
    private GreenfootImage Rwalk3 = new GreenfootImage("Rwalk3.png");
    private GreenfootImage Rwalk4 = new GreenfootImage("Rwalk4.png");
    
    private GreenfootImage Dwalk1 = new GreenfootImage("walkD1.png");
    private GreenfootImage Dwalk2 = new GreenfootImage("walkD2.png");
    private GreenfootImage Dwalk3 = new GreenfootImage("walkD3.png");
    
    private GreenfootImage Lidle = new GreenfootImage(Ridle);
    private GreenfootImage Lwalk1 = new GreenfootImage(Rwalk1);
    private GreenfootImage Lwalk2 = new GreenfootImage(Rwalk2);
    private GreenfootImage Lwalk3 = new GreenfootImage(Rwalk3);
    private GreenfootImage Lwalk4 = new GreenfootImage(Rwalk4);
    
    private int delay = 4;
    private int speed = 3;
    private int frame;
    private boolean walking;
    private boolean facingRight;
    private boolean facingUp;
    private boolean isKeyPressed;
    
    private int score = 0;
    
    public Player()
    {
        setImage(idle);
        walking = false;
        
        Lwalk1.mirrorHorizontally();
        Lwalk2.mirrorHorizontally();
        Lwalk3.mirrorHorizontally();
        Lwalk4.mirrorHorizontally();
    }
    
    public void act()
    {
        checkKeys();
        seeChest();
    }
    
    public void seeChest()
    {
        Actor object = getOneIntersectingObject(Chest.class);
        if (object != null)
        {
            increaseScore();
            getWorld().removeObject(object);
        }
    }
    
    public void increaseScore()
    {
        score += 1;
        getWorld().showText("Score: " + score, 50, 25);
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void checkKeys()
    {
        isKeyPressed = false;
        if (Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("a"))
        {
            stopWalking();
            isKeyPressed = true;
        }
        else if (Greenfoot.isKeyDown("w"))
        {
            walkUp();
            setLocation(getX(), getY() - speed);
            isKeyPressed = true;
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            walkRight();
            setLocation(getX() + speed, getY());
            isKeyPressed = true;
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            walkDown();
            setLocation(getX(), getY() + speed);
            isKeyPressed = true;
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            walkLeft();
            setLocation(getX() - speed, getY());
            isKeyPressed = true;
        }
        
        if (!(isKeyPressed))
        {
            stopWalking();
        }
        
    }

    public void walkUp()
    {
        walking = true;
        facingRight = true;
        frame++;
        
        if (frame < 1 * delay)
        {
            setImage(Uwalk1);
        }
        else if (frame < 2 * delay)
        {
            setImage(Uwalk2);
        }
        else if (frame < 3 * delay)
        {
            setImage(Uwalk3);
            frame = 1;
        }
    }
    
    public void walkRight()
    {
        walking = true;
        facingRight = true;
        frame++;
        
        if (frame < 1 * delay)
        {
            setImage(Rwalk1);
        }
        else if (frame < 2 * delay)
        {
            setImage(Rwalk2);
        }
        else if (frame < 3 * delay)
        {
            setImage(Rwalk3);
        }
        else if (frame < 4 * delay)
        {
            setImage(Rwalk4);
            frame = 1;
        }
    }
    
    public void walkDown()
    {
        walking = true;
        facingRight = true;
        frame++;
        
        if (frame < 1 * delay)
        {
            setImage(Dwalk1);
        }
        else if (frame < 2 * delay)
        {
            setImage(Dwalk2);
        }
        else if (frame < 3 * delay)
        {
            setImage(Dwalk3);
            frame = 1;
        }
    }
    
    public void walkLeft()
    {
        walking = true;
        facingRight = false;
        frame++;
        
        if (frame < 1 * delay)
        {
            setImage(Lwalk1);
        }
        else if (frame < 2 * delay)
        {
            setImage(Lwalk2);
        }
        else if (frame < 3 * delay)
        {
            setImage(Lwalk3);
        }
        else if (frame < 4 * delay)
        {
            setImage(Lwalk4);
            frame = 1;
            return;
        }
    }
    
    public void stopWalking()
    {
        walking = false;
    }
}
