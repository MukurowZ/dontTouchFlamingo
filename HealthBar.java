import greenfoot.*;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends GameUI 
{
    private BasicStatus owner;
    private int x;
    private int y;
    private double maxHp;
    
    public HealthBar(BasicStatus owner){
      super( owner.getPosition() );
      this.owner = owner;
      maxHp = owner.getMaxHp();
      double currentHp = owner.getCurrentHp()/owner.getMaxHp();
      x = 50;
      y = 5;
      animNormal = new GreenfootImage( (int) (currentHp*x), y);
      animNormal.setColor( Color.GREEN );
      animNormal.fillRect( 0, 0, (int) (currentHp*x), y );
      setImage( animNormal );
    }
    
    @Override
    public void action(){
      double currentHp = owner.getCurrentHp()/owner.getMaxHp();
      if( currentHp-0 > 0.01 ){
          setLocation( (int)(owner.getPosition().getX()-((1-currentHp)*x/2)), owner.getPosition().getY()-(owner.getSize().getY()/2) );
          animNormal.scale( (int) (currentHp*x), y);
          if( currentHp > 0.75 ) animNormal.setColor( Color.GREEN );
          else if( currentHp > 0.35 ) animNormal.setColor( Color.ORANGE );
          else animNormal.setColor( Color.RED );
          animNormal.fillRect( 0, 0, (int) (currentHp*x), y );
          setImage( animNormal );
      }
    }
    
}
