import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void takeAllPaint() {
    while(isOnBucket()) {
      takePaint();
    }
  }
  
}