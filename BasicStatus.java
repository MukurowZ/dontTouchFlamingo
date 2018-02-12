import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class BasicStatus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BasicStatus extends Actor{
  private String name;
  private int totalPoint = 0;
  
  // UI
  private HealthBar hpBar;
  
  
  // movement
  private int direction = 1; // 1 down 2 left 3 up 4 right
  private Vector2 position;
  private Animation currentAnim;
  private Vector2 size;
  private int speed;
  private boolean isMoving = false;
  private int animDelay = 1;
  protected int maxDelay;
  
  // Dead
  protected Animation die;
  private boolean isDead;
  private int dieTime = 0;
  

  // Base Status
  private double currentHp;
  private double hp;
  
  // Scale of each status
  private double scaleHp;

  
  public BasicStatus(double hp){
    this.hp   = hp;
  }
  
  // status = scale x basic stat
  public void resetStat(){
    this.hp   = scaleHp;
  }
  
  // getter setter
  public double getCurrentHp(){
    return currentHp;
  }
  // get max hp
  public double getMaxHp(){
    return hp;
  }
  // Get All Info
  public String toString(){
    String ans = "";  
    ans += "Health Point :    " + hp + '\n' ;
    ans += "Current HP   :    " + currentHp + '\n';
    return ans;
  }
  // Restore Regen mana
  public void restore(){
    healHp(hp);
  }
  
  public void healHp(double addedHp){
    if( currentHp + addedHp > hp )
      currentHp = hp;
    else
      currentHp += addedHp;
  }
  
  // set position
  public void setPosition(Vector2 v){
    position = v;
  }
  public Vector2 getPosition(){
    return position;
  }
  
  // Move
  public void walk(){
        switch( direction ){
          case 1:
            position = new Vector2(position.getX() , position.getY() + speed);
            setLocation( position.getX(), position.getY() );
            break;
          case 2:
            position = new Vector2(position.getX() - speed, position.getY());
            setLocation( position.getX(), position.getY() );
            break;
          case 3:
            position = new Vector2(position.getX() , position.getY() -  speed);
            setLocation( position.getX(), position.getY() );
            break;
          case 4:
            position = new Vector2(position.getX() + speed, position.getY());
            setLocation( position.getX(), position.getY() );
            break;
        }
  }
  
  public void walk(int steps){
        switch( direction ){
          case 1:
            position = new Vector2(position.getX() , position.getY() + speed*steps);
            setLocation( position.getX(), position.getY() );
            break;
          case 2:
            position = new Vector2(position.getX() - speed*steps, position.getY());
            setLocation( position.getX(), position.getY() );
            break;
          case 3:
            position = new Vector2(position.getX() , position.getY() -  speed*steps);
            setLocation( position.getX(), position.getY() );
            break;
          case 4:
            position = new Vector2(position.getX() + speed*steps, position.getY());
            setLocation( position.getX(), position.getY() );
            break;
        }
    
  }
  
  public void setAnimation(Animation anim){
    this.currentAnim = anim;
  }
  
  public Animation getAnimation(){
    return currentAnim;  
  }
  // Action each 
  public void act(){
    
    if( isDead  ){
         dieTime++;
         if( dieTime >= 20 ){
            getWorld().removeObject(this);
         }
    }
    else if( animDelay++ >= maxDelay  ){
        setImage( currentAnim.getFrame() );
        
        animDelay = 0;
        
        //Test
        //getDamage( 0.1 );
    }
    if( currentHp > 0 ){
        hpBar.action();
    }else if( currentHp <= 0 && !isDead ){
        getWorld().removeObject(hpBar);
        die();
    }
  }
  
  public void setSize(Vector2 size){
    this.size = size;  
  }
  public Vector2 getSize(){
    return size;  
  }
  public int getDirect(){
    return direction;
  }
  public void setDirect(int d){
    direction = d;
  }
  public void setSpeed(int s){
    speed = s;  
  }
  public int getSpeed(){
    return speed;  
  }
  public void setIsMoving(boolean b){
    this.isMoving = b;
  }
  public boolean isMoving(){
    return isMoving;
  }
  public int nextStep(){
    switch( direction ){
          case 1:
          return position.getY() + speed;
          case 2:
           return position.getX() - speed;
          case 3:
            return position.getY() -  speed;
          case 4:
            return position.getX() + speed;
    }
    return 0;
  }
  

  public void getDamage(double dmg){
    
  }
  
  public void die(){
    currentAnim = die;
    isDead = true;
  }
  public boolean isDead(){
    return isDead;  
  }
  
  // All stat

  
  public String getName(){
    return name;  
  }
  
}
