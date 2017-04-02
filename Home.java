
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    GreenfootSound s = new GreenfootSound("BG.wav");
    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        playSound();
        
        prepare();
    }
    public Home(boolean playSound)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        
        prepare();
    }
    

    public void prepare(){
        Difficulty.start = false;
        Archer archer = new Archer();
        addObject(archer,1127,604);
        Archer archer2 = new Archer();
        addObject(archer2,1069,681);
        Archer archer3 = new Archer();
        addObject(archer3,1037,618);
        Footman footman = new Footman();
        addObject(footman,962,675);
        Footman footman2 = new Footman();
        addObject(footman2,929,608);
        Footman footman3 = new Footman();
        addObject(footman3,873,654);
        ArcherE archere = new ArcherE();
        addObject(archere,75,687);
        ArcherE archere2 = new ArcherE();
        addObject(archere2,120,623);
        ArcherE archere3 = new ArcherE();
        addObject(archere3,168,659);
        FootmanE footmane = new FootmanE();
        addObject(footmane,266,631);
        FootmanE footmane2 = new FootmanE();
        addObject(footmane2,220,686);
        FootmanE footmane3 = new FootmanE();
        addObject(footmane3,315,672);
        Start start = new Start();
        addObject(start,315,448);
        CD cd = new CD();
        addObject(cd,625,296);
        cd.setLocation(690,326);
        removeObject(cd);
        removeObject(start);
        CD cd2 = new CD();
        addObject(cd2,602,339);
        Easy easy = new Easy();
        addObject(easy,465,506);
        Hard hard = new Hard();
        addObject(hard,623,509);
        Normal normal = new Normal();
        addObject(normal,771,510);
        normal.setLocation(616,557);
        hard.setLocation(768,502);
        normal.setLocation(624,508);
        normal.setLocation(616,505);
        hard.setLocation(768,509);
        easy.setLocation(390,508);
        normal.setLocation(587,503);
        HTP htp = new HTP();
        addObject(htp,594,634);
        htp.setLocation(591,624);
        cd2.setLocation(589,339);
    }
    public void strted(){
        s.playLoop();
    }
    public void stopped(){
        s.stop();
    }
    public void playSound(){
        s.setVolume(20);
        s.playLoop();
    }
    public void stopSound(){
        s.stop();
    }
    
}