import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Birds extends BasicStatus {
  
  private double mp;
  private double currentMp;
  private double scaleMp;
  private String namePlayer;
  
  private Animation walkingDown;
  private Animation walkingLeft;
  private Animation walkingUp;
  private Animation walkingRight;
  
  private Animation standDown;
  private Animation standLeft;
  private Animation standUp;
  private Animation standRight;
  private Animation attackAnimation;
  
  public void setPlayerName(String namePlayer){
    this.namePlayer = namePlayer;
  }
  
  public void setWalkingDown(Animation walkingDown){
    this.walkingDown = walkingDown;
  }
  public void setWalkingLeft(Animation walkingLeft){
    this.walkingLeft = walkingLeft;
  }
  public void setWalkingUp(Animation walkingUp){
    this.walkingUp = walkingUp;
  }
  public void setWalkingRight(Animation walkingRight){
    this.walkingRight = walkingRight;
  }
  
  public Animation getWalkingDown(){
    return walkingDown;
  }
  public Animation getWalkingLeft(){
    return walkingLeft;
  }
  public Animation getWalkingUp(){
    return walkingUp;
  }
  public Animation getWalkingRight(){
    return walkingRight;
  }
  
  public void setStandDown(Animation standDown){
    this.standDown = standDown;
  }
  public void setStandLeft(Animation standLeft){
    this.standLeft = standLeft;
  }
  public void setStandUp(Animation standUp){
    this.standUp = standUp;
  }
  public void setStandRight(Animation standRight){
    this.standRight = standRight;
  }
  
  public Animation getStandDown(){
    return standDown;
  }
  public Animation getStandLeft(){
    return standLeft;
  }
  public Animation getStandUp(){
    return standUp;
  }
  public Animation getStandRight(){
    return standRight;
  }
  
}
