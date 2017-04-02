import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FootmanE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FootmanE extends Enemies
{
    int HP=40;
    GreenfootImage im = new GreenfootImage("eF.png");
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
        attack();

    }
   public void damage(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
             if(HP<=0){
             
             PlayWorld.score+=5;
             PlayWorld.money+=50;
             getWorld().removeObject(this);
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
   public void changePic(){
        if(Difficulty.diff==1){

        }
        if(Difficulty.diff==2){
            
        }
        if(Difficulty.diff==3){
            
        }
    }
       public void ani(){
        if(PlayWorld.second%2==1){
            setImage("eF.png");
        }
        if(PlayWorld.second%2==0){
            setImage("eF2.png");
        }
            
    }
    
}
