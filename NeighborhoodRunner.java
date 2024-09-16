import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

//instantiates the backgroundpainter
    BackgroundPainter BP = new BackgroundPainter();
//instantiates the painter
    BalloonPainter BLP = new BalloonPainter();
//paints the background
    BP.paintBackground("LightSkyBlue", 32);
//paints the final image
    BLP.paintBalloon("red","white");

    
  }
}