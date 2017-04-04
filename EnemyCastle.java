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
    private long timeStarted2 = System.currentTimeMillis();
    public static int win = -1;
    /**
     * Act - do whatever the EmemyCastle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        t();
        spawnUnit();
        endGame();
    }
    
    public void spawnUnit(){//Spawn units (Footman)
    long currentTime = System.currentTimeMillis();
    long elapsedTime = currentTime - timeStarted;
    int count =0;
    //Set delay time to spawn unit
    if(Difficulty.diff==1){
     if (elapsedTime / 300 > 10)
    {
    timeStarted = currentTime;
    getWorld().addObject(new FootmanE(),0,565);
   } 
   }
   else if(Difficulty.diff==2){
     if (elapsedTime / 300 > 7)
    {
    timeStarted = currentTime;
     getWorld().addObject(new FootmanE(),0,565);
   }
   }
   else if(Difficulty.diff==3){
     if (elapsedTime / 300 > 4)
    {
    timeStarted = currentTime;
     getWorld().addObject(new FootmanE(),0,565);
   }
   } 
   }
   //Spawn Tank from spawn point
   public void t(){
        long currentTime = System.currentTimeMillis();
    long elapsedTime = currentTime - timeStarted2;
       if (elapsedTime / 300 > 40)
    {
    timeStarted2 = currentTime;
     getWorld().addObject(new TankE(),0,560);
   }
    }
    //Win the game when castle destroy
   public void endGame(){
       if(this.Hp<=0){
           Greenfoot.setWorld(new ScoreBoard());
           this.Hp=2000;
           this.win = 0;
           PlayWorld.money=0;
        }
    }
    
}
