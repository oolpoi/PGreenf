import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    GreenfootSound c = new GreenfootSound("click.wav");
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setScore();
        reset();
        returnMain();
    }
    //Set score page
    public void setScore(){
        if(EnemyCastle.win==0){
            setImage("Win.jpg");
        }
        if(EnemyCastle.win==1){
            setImage("Lose.jpg");
        }
    }
    //Reset to preparing a game
    public void reset(){
        PlayWorld.score = 0;
        PlayWorld.money = 1000;
        Difficulty.start = false;
        Difficulty.diff = -1;
    }
    //Back to main menu
    public void returnMain(){
    if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Home());
            c.setVolume(80);
            c.play();
        }
    }
}
