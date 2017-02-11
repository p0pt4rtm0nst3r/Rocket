import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private int direction, speed;
   // private int timer;
    
    public Bullet(int dir){
        direction = dir;
        speed = 15;
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // if(timer > 0) timer--;
        // Add your action code here.
       // if(timer == 0 && Greenfoot.isKeyDown("space"))
        {
        
       // timer = 5;
        }
        setRotation(direction);
        move(speed);
        if(isAtEdge())
        {
           getWorld().removeObject(this);
        }
    }    
}
