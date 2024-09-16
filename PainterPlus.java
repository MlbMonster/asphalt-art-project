import org.code.neighborhood.*;

public class PainterPlus extends Painter {
//allows the painter to turn right instead of having to turn left three times
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
//takes all the paint when the painter goes over a bucket
  public void takeAllPaint() {
    while(isOnBucket()) {
      takePaint();
    }
  }
  
}