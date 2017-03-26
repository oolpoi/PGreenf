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
            if(isTouching(FootmanE.class) ){
                getWorld().removeObject(this);
                hi.setVolume(80);
                if(isAtEdge()){
                    getWorld().removeObject(this);
                }
            }
        }
        else if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){  
           if(isTouching(FootmanB.class) ){
              getWorld().removeObject(this);
              
              hi.setVolume(80);
             if(isAtEdge()){
                    getWorld().removeObject(this);
                }
           }
        } 
        
        else if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){  
           if(isTouching(FootmanO.class) ){
              getWorld().removeObject(this);
             
              hi.setVolume(80);
              if(isAtEdge()){
                    getWorld().removeObject(this);
                }
           }
        }
        
        
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        
        //removeTouching(Arrow.class);
    }
}

