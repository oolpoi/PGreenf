import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayWorld extends World
{
    public static int money = 0;
    public static int score = 0;
    public static int time = 0;
    public static int min = 0;
    public static int second = 0;
     /**
     * Constructor for objects of class PlayWorld.
     * 
     */
    public PlayWorld()
    {  
        
        super(1200, 750, 1); 
        addObject(new Ab(),699,654);
        addObject(new Fb(),582,654);//
        prepare();
    }
    public void act(){
        showText("Money : "+money,1100,100);
        showText("Score : "+score,1100,120);
        if(time>-1){
            time++;
            if(time==60)second++;
            time = ((time*60)/60)%60; 
            if (second==60){min ++;
                second/=60;
            }
        showText("Time : "+min+"."+second,600,120);
    }
        showText("Health : "+AllyCastle.Hp,1100,140);
        showText("Health : "+EnemyCastle.Hp,100,140);
    }
    public void prepare(){
        EnemyCastle ememycastle = new EnemyCastle();
        addObject(ememycastle,124,402);

        AllyCastle allycastle = new AllyCastle();
        addObject(allycastle,1199,392);
        
        allycastle.setLocation(1199,388);
        ememycastle.setLocation(1,363);
        
        addObject(new Ab(),699,654);
        addObject(new Fb(),582,654);
        
        addObject(new Restart(),1100,650);
        
    }
}
