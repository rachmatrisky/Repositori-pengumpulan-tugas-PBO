import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(860, 500, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        Car car1 = new Car();
        car1.setRotation(180);
        addObject(car1, 430, 200);
        
        Car car2 = new Car();
        car2.setRotation(180);
        addObject(car2, 430, 340);
        
        Ambulance ambulance1 = new Ambulance();
        addObject(ambulance1, 430, 270);
        
        Ambulance ambulance2 = new Ambulance();
        addObject(ambulance2, 430, 400);
    }
}
