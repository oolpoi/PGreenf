import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Difficulty
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        start();
    }
    //Set play world to Easy
    public void start(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PlayWorld());
            Difficulty.start = true;
            Difficulty.diff = 1;
            PlayWorld.money=1000;
            c.setVolume(80);
            c.play();
        }
        
    }
}
