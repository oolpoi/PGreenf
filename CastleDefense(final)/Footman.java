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
    GreenfootImage i1 = new GreenfootImage("aF.png");
    GreenfootImage i2 = new GreenfootImage("Fw.png");
    /**
     * Act - do whatever the Footman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Set the base movement of Footman
        if(Difficulty.start){
        move(-2);
        }
        ani();
        attack();
        die();
        
    }
    //Remove the footman when die
    public void die(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){  
            if(isTouching(FootmanE.class)){
            getWorld().removeObject(this);
        }
    }
    }
    //When touching damage the castle
    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(EnemyCastle.class)){
             getWorld().removeObject(this);
             EnemyCastle.Hp-=30;
             PlayWorld.money+=100;
             return;
            }
    }
    }
    //animation
    public void ani(){
        if(PlayWorld.second%2==1){
            setImage(i2);
        }
        if(PlayWorld.second%2==0){
            setImage(i1);
        }
            
    }
}
