import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

   public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();
      paintLine(color, size);
      turnToEast();
    }

    paintLine(color, size);
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (canMove()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
    paint(color);
  }

  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      if (canMove()) {
        move();
      }
      turnLeft();
    }
  }

  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
}