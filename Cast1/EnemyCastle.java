import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EmemyCastle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyCastle extends Enemies
{
    public static int Hp = 2000;
    private long timeStarted = System.currentTimeMillis();
    public static int win = -1;
    /**
     * Act - do whatever the EmemyCastle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        spawnUnit();
        endGame();
    }
    public void prepare(){
        Hp = Hp*Difficulty.diff;
    }
    public void spawnUnit(){
    long currentTime = System.currentTimeMillis();
    long elapsedTime = currentTime - timeStarted;
    if(Difficulty.diff==1){
     if (elapsedTime / 300 > 10)
    {
    timeStarted = currentTime;
     getWorld().addObject(new FootmanE(),0,565);
     
   }
   
   }
   else if(Difficulty.diff==2){
     if (elapsedTime / 230 > 10)
    {
    timeStarted = currentTime;
     getWorld().addObject(new FootmanE(),0,565);
   }
  
   }
   else if(Difficulty.diff==3){
     if (elapsedTime / 150 > 10)
    {
    timeStarted = currentTime;
     getWorld().addObject(new FootmanE(),0,565);
   }
   
   } 
   }
   public void endGame(){
       if(this.Hp<0){
           Greenfoot.setWorld(new ScoreBoard());
           this.Hp=2000;
           this.win = 0;
           PlayWorld.money=0;
           PlayWorld.time =0;
        }
    }
}
