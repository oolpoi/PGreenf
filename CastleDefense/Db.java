import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Db here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Db extends Button
{
    GreenfootSound sound = new GreenfootSound("tele.wav");
    /**
     * Act - do whatever the dB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        spawnUlti();
    }    
    public void spawnUlti(){ 
    if(Greenfoot.mouseClicked(this)){
            if(PlayWorld.money>=500){
                PlayWorld.money-=500;
                sound.setVolume(50);
                sound.play();
                getWorld().addObject(new Dragon(),1100,565);
        }
        
    }
    
    }
}
