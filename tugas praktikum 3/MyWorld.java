import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Player player;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("score : 0", 50, 25);
        
        player = new Player();
        
        addObject(player, 300, 200);
        
        addSlimeRandomly(4);
        addChestRandomly(7);
    }
    
    public void act()
    {
        checkGameOver();
    }
    
    public void addSlimeRandomly(int number)
    {
        for (int i = 0; i < number; i++)
        {
            addObject(new Slime(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    public void addChestRandomly(int number)
    {
        for (int i = 0; i < number; i++)
        {
            addObject(new Chest(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    public void checkGameOver()
    {
        if (player.getScore() == 7)
        {
            showText("Game Over - You Win!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
        
        if (getObjects(Player.class).isEmpty())
        {
            showText("Game Over - You Lose!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
