import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Button
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        reStart();
    }
    public void reStart(){
        if(Greenfoot.mouseClicked(this)){
            c.setVolume(80);
            c.play();
            Greenfoot.setWorld(new PlayWorld());
            if(Difficulty.diff==1)PlayWorld.money = 1000;
            if(Difficulty.diff==2)PlayWorld.money = 800;
            if(Difficulty.diff==3)PlayWorld.money = 600;
            PlayWorld.time=0;
            PlayWorld.min=0;
            PlayWorld.second=0;
        }
        
    }
}
