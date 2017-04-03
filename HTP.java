import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HTP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HTP extends Button
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the HTP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        htp();
    }    
    //Return to Home page
    public void htp(){
    if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HowToPlay());
            c.setVolume(80);
            c.play();
        }
    }
}
