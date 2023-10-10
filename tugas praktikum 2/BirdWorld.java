import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdWorld extends World
{

    /**
     * Constructor for objects of class BirdWorld.
     * 
     */
    public BirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        setBackground(new GreenfootImage("background.png"));
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bird bird = new Bird();
        addObject(bird, 145,185);
        
        Cloud cloud1 = new Cloud("cloud1.png", 1);
        addObject(cloud1, 660, 100);
        
        Cloud cloud2 = new Cloud("cloud2.png", 1);
        addObject(cloud2, 800, 350);
        
        Cloud cloud3 = new Cloud("cloud3.png", 1);
        addObject(cloud3, 770, 400);
        
        setPaintOrder(Bird.class, Cloud.class);
    }
}
