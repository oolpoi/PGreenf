import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Button
{
    GreenfootSound c = new GreenfootSound("click.wav");
    static boolean click = false;
    /**
     * Act - do whatever the Main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        start();
    }    
    public void start(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Home(false));
            c.setVolume(80);
            c.play();
            PlayWorld.time=0;
            PlayWorld.min=0;
            PlayWorld.second=0;
            PlayWorld.score = 0;
            PlayWorld.money=0;
        }
        
    }
}