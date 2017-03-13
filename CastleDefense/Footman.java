import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Footman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Footman extends Allies
{
    public int Hp = 300;
    public int damage = 25 ;
    
    /**
     * Act - do whatever the Footman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Difficulty.start){
        move(-2);  
        }
        attack();
        die();
    }
    public void die(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){  
            if(isTouching(FootmanE.class)){
            getWorld().removeObject(this);
        }
    }
    }

    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(EnemyCastle.class)){
             getWorld().removeObject(this);
             EnemyCastle.Hp-=30;
             PlayWorld.money+=100;
             return;
            }
         return;
    }
    }
}
