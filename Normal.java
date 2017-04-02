import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Difficulty
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the Normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        start();
    }  
      public void start(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new PlayWorld());
            Difficulty.start = true;
            Difficulty.diff = 2;
            PlayWorld.money=800;
            c.play();
        }
        
    }
}
