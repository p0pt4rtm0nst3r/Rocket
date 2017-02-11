import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int hp = 100;
    private int x, y;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.x+=1;
        this.setLocation(this.x, this.y);
    }   
    public Rocket(){
        this.x = 2;//getWorld().getWidth() / 2;
        this.y = 2;//getWorld().getHeight() / 2;
        this.setLocation(this.x, this.y);
    }
}
