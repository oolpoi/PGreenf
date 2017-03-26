import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FootmanO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FootmanO extends Enemies
{
    /**
     * Act - do whatever the FootmanO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FootmanO(){
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
            PlayWorld.score+=15;
            PlayWorld.money+=150;
            
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
