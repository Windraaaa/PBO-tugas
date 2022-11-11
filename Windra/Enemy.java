import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int delay = 0;
    public Enemy()
    {
        setRotation(180);
        
    }
    public Enemy(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    public int speed = 3;
    public void act()
    {
        enemyMove();
    }
    
    void enemyMove(){
        move(speed);
        
        if(isAtEdge())
        getWorld().removeObject(this);
    }
}

