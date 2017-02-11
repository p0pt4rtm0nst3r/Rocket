import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int hp = 10;
    private int x, y;
    private int random;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.x -= (int) (Math.random() * 2) + 1;
        random = (int) (Math.random() * 10) + 1;
        if(random > 5)
        this.y += 2;
        else
        this.y -= 2;
        this.setLocation(this.x, this.y);
        if(isAtEdge())
        {
           getWorld().removeObject(this);
        }
        //if(intersects)
        {
            
        }
    }    
    public Enemy(){
        this.x = 500;
        this.y = 250;
        this.setLocation(this.x, this.y);
    }
}
