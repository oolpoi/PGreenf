import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends World
{
    GreenfootImage image = new GreenfootImage(400, 300);
    /**
     * Constructor for objects of class ScoreBoard.
     * 
     */
    public ScoreBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        addObject(new Score(),600,375);
        addObject(new Main(),600,650);
        showText(""+PlayWorld.score,600,435);
    }
    
}
