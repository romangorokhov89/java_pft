package rs.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testCoordinates1(){
    Coordinates c = new Coordinates(2, 0,2,0);
    Assert.assertEquals(c.distance(),0.0);
  }

  @Test
  public void testCoordinates2(){
    Coordinates c = new Coordinates(2, 0,1,0);
    Assert.assertEquals(c.distance(),1.0);
  }

  @Test
  public void testCoordinates3(){
    Coordinates c = new Coordinates(0, 2,0,2);
    Assert.assertEquals(c.distance(),3.0);
  }

  @Test
  public void testCoordinates4(){
    Coordinates c = new Coordinates(0, 2,0,0);
    Assert.assertEquals(c.distance(),2.0);
  }
}
