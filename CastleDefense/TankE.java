import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TankE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TankE extends Enemies
{
    /**
     * Act - do whatever the TankE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Difficulty.start){
        move((1*Difficulty.diff));  
        }
        ani();
        die();
        attack();
    }    
    public void die(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
            int count = 0;
           
             if(isTouching(Arrow.class)||isTouching(FireBall.class)){
                
                 
               
                
            getWorld().removeObject(this);

            PlayWorld.score+=15;
            PlayWorld.money+=150;
        
        }
    }
    }
    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(AllyCastle.class)){
             getWorld().removeObject(this);
             AllyCastle.Hp-=60+Difficulty.diff*20;
             
            }
         
    }
   }
   
       public void ani(){
        if(PlayWorld.second%2==1){
            setImage("rF.png");
        }
        if(PlayWorld.second%2==0){
            setImage("rF2.png");
        }
            
    }
}
