import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter BP = new BackgroundPainter();

    BalloonPainter BLP = new BalloonPainter();

    BP.paintBackground("LightSkyBlue", 32);

    BLP.paintBalloon("red","white");

    
  }
}