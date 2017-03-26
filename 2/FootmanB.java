import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FootmanB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FootmanB extends Enemies
{
    /**
     * Act - do whatever the FootmanB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FootmanB(){
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        if(Difficulty.start){
        move((1*Difficulty.diff));  
        }
        die();
        attack();
    }
   public void die(){
       
        if(getWorld()!=null && getWorld().getObjects(Footman.class)!=null){  
             if(isTouching(Arrow.class)){
            getWorld().removeObject(this);
            PlayWorld.score+=10;
            PlayWorld.money+=100;
            //removeTouching(FootmanB.class);
        }
        
    }
    
    }
    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(AllyCastle.class)){
             getWorld().removeObject(this);
             AllyCastle.Hp-=30+Difficulty.diff*20;
             
            }
         
    }
   }    
}
