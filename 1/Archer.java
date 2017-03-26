import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Archer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Allies
{
     private long timeStarted = System.currentTimeMillis();
     GreenfootSound sho = new GreenfootSound ("shot.wav");  
    /**
     * Act - do whatever the Archer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        /*if(Difficulty.start){
        move(0);
    }*/
    shoot();
    die();
    
    }
    public void shoot(){
        if(Difficulty.start){
    long currentTime = System.currentTimeMillis();
    long elapsedTime = currentTime - timeStarted;
    
     if (elapsedTime / 400 > 10)
     {
    timeStarted = currentTime;
     getWorld().addObject(new Arrow(),getX(),getY());
     sho.setVolume(80);
     sho.play();
    }
    
    }
    
    }
    public void die(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){  
            if(isTouching(FootmanE.class)){
            getWorld().removeObject(this);
        }
    }
    }
     
}
