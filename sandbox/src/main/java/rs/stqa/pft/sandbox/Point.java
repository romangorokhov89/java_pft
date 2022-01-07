package rs.stqa.pft.sandbox;

public class Point {
  public static void main(String[] args) {

    Coordinates c = new Coordinates(2, 2,4,4);
    System.out.println("расстояние между точками = " + distance(c));
  }

  public static double distance (Coordinates c) {
    return Math.sqrt((c.x2-c.x1)*(c.x2-c.x1)+(c.y2-c.y1)*(c.y2-c.y1));
  }
}
