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
    private int timer;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //this.x+=1;
        this.setLocation(this.x, this.y);
        if(timer > 0) timer--;
        if(Greenfoot.isKeyDown("left")){
            this.x-=5;
        }
         if(Greenfoot.isKeyDown("right")){
            this.x+=5;
        }
         if(Greenfoot.isKeyDown("down")){
            this.y+=5;
        }
         if(Greenfoot.isKeyDown("up")){
            this.y-=5;
        }
         if(Greenfoot.isKeyDown("space") && timer == 0){
            getWorld().addObject(new Bullet(getRotation()), getX(), getY());
            timer = 15;
        }
    }   
    public Rocket(){
        this.x = 20;//getWorld().getWidth() / 2;
        this.y = 250;//getWorld().getHeight() / 2;
        this.setLocation(this.x, this.y);
    }
}
