/**
 * Write a description of class Vector2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector2{
  private double x;
  private double y;
  public Vector2(double x, double y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return (int)x;
  }
  public int getY(){
    return (int)y;
  }
  public void setXY( double x, double y ){
    this.x = x;
    this.y = y;
  }
  public void setVector2(Vector2 v){
    this.x = v.getX();
    this.y = v.getY();
  }
}
