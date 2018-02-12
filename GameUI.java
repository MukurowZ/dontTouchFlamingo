import greenfoot.*;
/**
 * Write a description of class GameUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameUI extends Actor
{
    private Vector2 position;
    protected GreenfootImage animNormal;
    protected GreenfootImage animClick;
    public GameUI()
    {
    }

    public GameUI(Vector2 position)
    {
        this.position = position;
    }
    
    public void setImages(GreenfootImage animNormal, GreenfootImage animClick){
      this.animNormal = animNormal;
      this.animClick = animClick;
    }
    public GreenfootImage getImageNormal(){
      return animNormal;
    }
    public GreenfootImage getImageClick(){
      return animClick;
    }
    public Vector2 getPosition(){
      return position;
    }
    // next frame
    public void action(){
      
    }
}
