import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Difficulty
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        start();
    }    
     //Set play world to Hard
    public void start(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PlayWorld());
            Difficulty.start = true;
            Difficulty.diff = 3;
            PlayWorld.money=600;
            c.play();
        }
        
    }
}
