import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ab extends Button
{
   
    GreenfootSound sound = new GreenfootSound("tele.wav");
    
    /**
     * Act - do whatever the Ab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        spawn();
    }
    public void spawn(){ 
    if(Greenfoot.mouseClicked(this)){
        
            if(PlayWorld.money>=200){
                PlayWorld.money-=200;
                sound.setVolume(50);
                sound.play();
                getWorld().addObject(new Archer(),1200,565);
        }
    } 
    }
    
    }
