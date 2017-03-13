import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AllyCastle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllyCastle extends Allies
{
    public static int Hp = 1500;
    public int money = 0;
    /**
     * Act - do whatever the AllyCastle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        endGame();
        
    }
    public void endGame(){
       if(this.Hp<=0){
           Greenfoot.setWorld(new ScoreBoard());
           this.Hp=1500;
           EnemyCastle.win =1;
           PlayWorld.money=0;
        }
    }
}
