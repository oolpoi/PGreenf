import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBall extends Actor
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
    //Deleting all of units that touching this
    public void remove(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){ 
            TankE t = (TankE) getOneIntersectingObject(TankE.class);
            FootmanE f= (FootmanE) getOneIntersectingObject(FootmanE.class);
            if(t!=null){
                t.tHP-=1000;
                hi.setVolume(20);
                hi.play();

                } 
            
            else if(f!=null){
                f.HP-=1000;
                hi.setVolume(20);
                hi.play();

                } 
            }
            //Remove when is at edge
            
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

}
