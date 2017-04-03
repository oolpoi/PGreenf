import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FootmanE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TankE extends Enemies
{
    static int tHP=300;
    /**
     * Act - do whatever the FootmanE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Difficulty.start){
            move((1*Difficulty.diff));
        }
        ani();
        damage();
        die();
        attack();
    }
    //Remove this from world when its die
   public void die(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
            
            if(this.tHP<=0){
                
                PlayWorld.score+=5;
                 PlayWorld.money+=100;
                 getWorld().removeObject(this);
                 tHP=300;
            }
        
    }
    }
    //Damage the ally castle
    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(AllyCastle.class)){
             getWorld().removeObject(this);
             AllyCastle.Hp-=10+Difficulty.diff*20;
             
            }
         
    }
   }
    //Create the animation
       public void ani(){
        if(PlayWorld.second%2==1){
            setImage("rF.png");
        }
        if(PlayWorld.second%2==0){
            setImage("rF2.png");
        }
            
    }
    //Damage calculation
    public void damage(){
        Arrow a = (Arrow) getOneIntersectingObject(Arrow.class);
            if(a!=null){
                this.tHP=tHP-50;
            }
    }
    
}
