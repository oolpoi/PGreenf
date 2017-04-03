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
    //Remove and decrease Hp of hitting enemy
    public void remove(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){ 
            TankE t = (TankE) getOneIntersectingObject(TankE.class);
            FootmanE f= (FootmanE) getOneIntersectingObject(FootmanE.class);
            if(t!=null){
                t.tHP-=50;
                hi.setVolume(20);
                hi.play();
                getWorld().removeObject(this);
                } 
            
            else if(f!=null){
                f.HP-=40;
                hi.setVolume(20);
                hi.play();
                getWorld().removeObject(this);
                } 
                //remove when arrow is at the end of map
                else if(isAtEdge()){
            getWorld().removeObject(this);
        }
            }

    }
}

