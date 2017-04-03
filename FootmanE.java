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
    String pic;
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
        changePic();
    }
    //Damage calculating
   public void damage(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
             if(HP<=0){
             
             PlayWorld.score+=5;
             PlayWorld.money+=50;
             getWorld().removeObject(this);
            }
    }
    }
    //Damage against Ally castle
    public void attack(){
        if(getWorld()!=null&&getWorld().getObjects(Footman.class)!=null){
         if(isTouching(AllyCastle.class)){
             getWorld().removeObject(this);
             AllyCastle.Hp-=30+Difficulty.diff*20;
             
            }
         
    }
   }
   //Change picture for each Difficulty
   public void changePic(){
        if(Difficulty.diff==1){
            pic="eF";
        }
        if(Difficulty.diff==2){
            this.setImage("B.png");
            pic="B";
        }
        if(Difficulty.diff==3){
            this.setImage("O.png");
            pic="0";
        }
    }
    //Animation
       public void ani(){
           if(pic=="eF"){
        if(PlayWorld.second%2==1){
            setImage("eF.png");
        }
        if(PlayWorld.second%2==0){
            setImage("eF2.png");
        }  
    }
    else if(pic=="B"){
        if(PlayWorld.second%2==1){
            setImage("B (2).png");
        }
        if(PlayWorld.second%2==0){
            setImage("B.png");
        }
            
    }
    else if(pic=="O"){
        if(PlayWorld.second%2==1){
            setImage("O(2).png");
        }
        if(PlayWorld.second%2==0){
            setImage("O.png");
        }
            
    }
}
}
