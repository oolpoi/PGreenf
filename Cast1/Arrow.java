import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    public int hit=0;
    GreenfootSound hi = new GreenfootSound("tele.wav");
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-3);
        remove();
    }
    public void remove(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){ 
            int count=0;
            if(isTouching(FootmanE.class)||isTouching(TankE.class)){
                count++;
                getWorld().removeObject(this);
                hi.setVolume(80);
                
            }
            
            }
         
        
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}

