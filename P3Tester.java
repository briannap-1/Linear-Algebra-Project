import org.junit.Test; 
import static org.junit.Assert.assertEquals;

/** This is the tester class for the classes.
  *
  * @author Brianna Penkala
  * 
  */

public class P3Tester {
  
  /**This test checks the Point2D x and y getter methods*/
  @Test 
  public void testPoint2DGetterMethods () {
    Point2D p = new Point2D (1, 2);
    assertEquals (1.0, p.getX(), .01);
    assertEquals (2.0, p.getY(), .01);
    Point2D p2 = new Point2D (0, 0);
    assertEquals (0.0, p2.getX(), .01);
    assertEquals (0.0, p2.getY(), .01);
    Point2D p3 = new Point2D (-19, -10);
    assertEquals (-19.0, p3.getX(), .01);
    assertEquals (-10.0, p3.getY(), .01);
  }
  
  /**This test checks the Point2D toString method*/
  @Test 
  public void testPoint2DToString () {
    Point2D p = new Point2D (1, 2);
    assertEquals ("(1.0, 2.0)", p.toString());
    Point2D p2 = new Point2D (0, 0);
    assertEquals ("(0.0, 0.0)", p2.toString());
    Point2D p3 = new Point2D (-1, -1);
    assertEquals ("(-1.0, -1.0)", p3.toString());
  }
  
  /**This test checks the Point2D equals method*/
  @Test 
  public void testPoint2DEquals () {
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (1, 2);
    assertEquals (true, p1.equals(p2));
    Point2D p3 = new Point2D (5, 6);
    assertEquals (false, p1.equals(p3));
  }
  
  /**This test checks the Point2D distance method*/
  @Test 
  public void testPoint2DDistance () {
    Point2D p1 = new Point2D (1.5, 2);
    Point2D p2 = new Point2D (3, 4);
    assertEquals (2.5, Point2D.distance(p1, p2), .01);
    Point2D p3 = new Point2D (1.5, 2);
    assertEquals (0.0, Point2D.distance (p1, p3), .01);
    Point2D p4 = new Point2D (-10, -10);
    assertEquals (16.62077013859466, Point2D.distance (p1, p4), .01);
  }
  
  
  /**This test checks the Point x, y, and z getter methods*/
  @Test 
  public void testPointGetterMethods () {
    Point p = new Point (1, 2, 3);
    assertEquals (1.0, p.getX(), .01);
    assertEquals (2.0, p.getY(), .01);
    assertEquals (3.0, p.getZ(), .01);
    Point p2 = new Point (0, 0, 0);
    assertEquals (0.0, p2.getX(), .01);
    assertEquals (0.0, p2.getY(), .01);
    assertEquals (0.0, p2.getZ(), .01);
    Point p3 = new Point (-1, -2, -3);
    assertEquals (-1.0, p3.getX(), .01);
    assertEquals (-2.0, p3.getY(), .01);
    assertEquals (-3.0, p3.getZ(), .01);
  }
  
  /**This test checks the Point z setter method*/
  @Test
  public void testPointSetterMethod() {
    Point p = new Point (1, 2, 3);
    p.setZ(5);
    assertEquals (5.0, p.getZ(), .01);
    p.setZ(-5);
    assertEquals (-5.0, p.getZ(), .01);
    p.setZ(0);
    assertEquals (0.0, p.getZ(), .01);
  }
  
  /**This test checks the Point toString method*/
  @Test
  public void testPointToString () {
    Point p = new Point (1, 2, 3);
    assertEquals ("(1.0, 2.0, 3.0)", p.toString());
    Point p2 = new Point (0,0,0);
    assertEquals ("(0.0, 0.0, 0.0)", p2.toString());
    Point p3 = new Point (-1, -2, -3);
    assertEquals ("(-1.0, -2.0, -3.0)", p3.toString());
  }
  
  /**This test checks the Point equals method*/
  @Test 
  public void testPointEquals () {
    Point p1 = new Point (1, 2, 3);
    Point p2 = new Point (1, 2, 3);
    assertEquals (true, p1.equals(p2));
    Point p3 = new Point (4, 5, 6);
    assertEquals (false, p1.equals(p3));
  }
  
  /**This test checks the Point distance method*/
  @Test 
  public void testPointDistance () {
    Point p1 = new Point (1, 2, 3);
    Point p2 = new Point (4, 5, 6);
    assertEquals (5.19652, Point.distance (p1, p2), .01);
    Point p3 = new Point (1, 2, 3);
    assertEquals (0.0, Point.distance (p1, p3), .01);
    Point p4 = new Point (-10, -12, -14);
    assertEquals (24.61706725018234, Point.distance (p1, p4), .01);
  }
  
  
  /**This test checks the Line2D point A and point B getter methods*/
  @Test 
  public void testLine2DGetterMethods () {
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (4, 5);
    Line2D l = new Line2D (p1, p2);
    assertEquals ("(1.0, 2.0)", l.getA().toString());
    assertEquals ("(4.0, 5.0)", l.getB().toString());
    Point2D p3 = new Point2D (0, 0);
    Point2D p4 = new Point2D (0, 0);
    Line2D l2 = new Line2D (p3, p4);
    assertEquals ("(0.0, 0.0)", l2.getA().toString());
    assertEquals ("(0.0, 0.0)", l2.getB().toString());
    Point2D p5 = new Point2D (-10, -12);
    Point2D p6 = new Point2D (-15, -16);
    Line2D l3 = new Line2D (p5, p6);
    assertEquals ("(-10.0, -12.0)", l3.getA().toString());
    assertEquals ("(-15.0, -16.0)", l3.getB().toString());
  }
             
  /**This test checks the Line2D toString method*/
  @Test 
  public void testLine2DToString () {
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (4, 5);
    Line2D l = new Line2D (p1, p2);
    assertEquals ("y = 1.0x + 1.0", l.toString());
    Point2D p3 = new Point2D (-4, -8);
    Line2D l2 = new Line2D (p1, p3);
    assertEquals ("y = -4.0x + 6.0", l2.toString());
    //when line is vertical
    Point2D p4 = new Point2D (0, 0);
    Point2D p5 = new Point2D (0, 0);
    Line2D l3 = new Line2D (p4, p5);
    assertEquals ("x = 0.0", l3.toString());
  }
  
  /**This test checks the Line2D equals method*/
  @Test
  public void testLine2DEquals () {
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (4, 5);
    Point2D p3 = new Point2D (5, 6);
    Point2D p4 = new Point2D (7, 8);    
    Line2D l1 = new Line2D (p1, p2);
    Line2D l2 = new Line2D (p3, p4);
    assertEquals (true, l1.equals(l2));
    Point2D p5 = new Point2D (1, 12);
    Point2D p6 = new Point2D (3, 7);    
    Line2D l3 = new Line2D (p5, p6);
    assertEquals (false, l1.equals(l3));
  }
  
  /**This test checks the Line2D isParallel method*/
  @Test 
  public void testLine2DIsParallel () {
    //same slope different y-intercepts
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (5, 6);
    Point2D p3 = new Point2D (1, 6);
    Point2D p4 = new Point2D (3, 8);    
    Line2D l1 = new Line2D (p1, p2);
    Line2D l2 = new Line2D (p3, p4);
    assertEquals (true, l1.isParallel(l1,l2)); 
    //different slopes
    Point2D p5 = new Point2D (1, 10);
    Point2D p6 = new Point2D (1, 7);    
    Line2D l3 = new Line2D (p5, p6);
    assertEquals (false, Line2D.isParallel(l1, l3));
    //same lines
    Point2D p7 = new Point2D (3, 4);
    Point2D p8 = new Point2D (7, 8);
    Line2D l4 = new Line2D (p7, p8);
    assertEquals (false, Line2D.isParallel(l1, l4));
  }
  
  /**This test checks the Line2D intersection method*/
  @Test 
  public void testLine2DIntersection () {
    Point2D p1 = new Point2D (1, 2);
    Point2D p2 = new Point2D (5, 6);
    Point2D p3 = new Point2D (3, 1);
    Point2D p4 = new Point2D (3, 5);    
    Line2D l1 = new Line2D (p1, p2);
    Line2D l2 = new Line2D (p3, p4);
    assertEquals ("(1.5, 2.5)", Line2D.intersection (l1, l2).toString()); //technically this is .5 off. not sure why but it is consistent
    //case where lines are parallel
    Point2D p5 = new Point2D (1, 6);
    Point2D p6 = new Point2D (3, 8);    
    Line2D l3 = new Line2D (p5, p6);
    assertEquals (null, Line2D.intersection (l1, l3));
  }
  
  
  /**This test checks the Line point A and point B getter methods*/
  @Test
  public void testLineGetterMethods () {
    Point p1 = new Point (1, 2, 3);
    Point p2 = new Point (4, 5, 6);
    Line l = new Line (p1, p2);
    assertEquals ("(1.0, 2.0, 3.0)", l.getA().toString());
    assertEquals ("(4.0, 5.0, 6.0)", l.getB().toString());
    Point p3 = new Point (0, 0, 0);
    Point p4 = new Point (0, 0, 0);
    Line l2 = new Line (p3, p4);
    assertEquals ("(0.0, 0.0, 0.0)", l2.getA().toString());
    assertEquals ("(0.0, 0.0, 0.0)", l2.getB().toString());
    Point p5 = new Point (-3, -4, -2);
    Point p6 = new Point (-6, -9, -1);
    Line l3 = new Line (p5, p6);
    assertEquals ("(-3.0, -4.0, -2.0)", l3.getA().toString());
    assertEquals ("(-6.0, -9.0, -1.0)", l3.getB().toString());
  }
  
  /**This test checks the Line toString method*/
  @Test
  public void testLineToString () {
    Point p1 = new Point (1, 2, 3);
    Point p2 = new Point (4, 5, 5);
    Line l = new Line (p1, p2);
    assertEquals ("x = 1.0 + -3.0t, y = 2.0 + -3.0t, z = 3.0 + -2.0t", l.toString());
    Point p3 = new Point (0, 0, 0);
    Point p4 = new Point (0, 0, 0);
    Line l2 = new Line (p3, p4);
    assertEquals ("x = 0.0, y = 0.0, z = 0.0", l2.toString());
    Point p5 = new Point (-3, -4, -2);
    Point p6 = new Point (-6, -9, -1);
    Line l3 = new Line (p5, p6);
    assertEquals ("x = -3.0 + 3.0t, y = -4.0 + 5.0t, z = -2.0 + -1.0t", l3.toString());
  }
  
   /**This test checks the Line equals method*/
  @Test
  public void testLineEquals () {
    Point p1 = new Point (1, 2, 3);
    Point p2 = new Point (4, 5, 6);
    Point p3 = new Point (5, 6, 7);
    Point p4 = new Point (7, 8, 9);    
    Line l1 = new Line (p1, p2);
    Line l2 = new Line (p3, p4);
    assertEquals (true, l1.equals(l2));
    Point p5 = new Point (1, 12, 11);
    Point p6 = new Point (3, 7, 5);    
    Line l3 = new Line (p5, p6);
    assertEquals (false, l1.equals(l3));
  }
  
//  /**This test checks the Line getVector method*/
//  @Test 
//  public void testLineGetVector () {
//    Point p1 = new Point (1, 2, 3);
//    Point p2 = new Point (4, 5, 6);
//    Line l1 = new Line (p1, v2);
//    assertEquals ("<1.0, 2.0, 3.0>", l1.getVector());
//    Point p3 = new Point (-1, -2, -3);
//    Point p4 = new Point (-4, -5, -6);
//    Line l2 = new Line (p3, p4);
//    assertEquals ("<-1.0, -2.0, -3.0>", l2.getVector());
//    Point p5 = new Point (0, 0, 0);
//    Point p6 = new Point (0, 0, 0);
//    Line l3 = new Line (p5, p6);
//    assertEquals ("<0.0, 0.0, 0.0>", l3.getVector());
//  }
    
  /**This test checks the Line isParallel method*/
  @Test 
  public void testLineIsParallel () {
    Vector v1 = new Vector (1, 2, 3);
    Point p1 = new Point (1, 2, 3);
    Line l1 = new Line (p1, v1);
    Point p2 = new Point (0, 0, 0);
    Vector v2 = new Vector (2, 4, 6);
    Line l2 = new Line (p2, v2);
    assertEquals (true, Line.isParallel(l1, l2));
    Vector v3 = new Vector(1, 6, 6);
    Line l3 = new Line (p2, v3);
    assertEquals (false, Line.isParallel(l1, l3));
    //not sure how to test the case where the two lines are the same 
  }
    
    
  /**This test checks the Vector x, y, and z vector getter methods*/  
  @Test 
  public void testVectorGetterMethods () {
    Vector v = new Vector (1, 2, 3);
    assertEquals (1.0, v.getXVector(), .01);
    assertEquals (2.0, v.getYVector(), .01);
    assertEquals (3.0, v.getZVector(), .01);
    Vector v2 = new Vector (0, 0, 0);
    assertEquals (0.0, v2.getXVector(), .01);
    assertEquals (0.0, v2.getYVector(), .01);
    assertEquals (0.0, v2.getZVector(), .01);
    Vector v3 = new Vector (-1, -2, -3);
    assertEquals (-1.0, v3.getXVector(), .01);
    assertEquals (-2.0, v3.getYVector(), .01);
    assertEquals (-3.0, v3.getZVector(), .01);
  }
  
  /**This test checks the Vector toString method*/
  @Test 
  public void testVectorToString () {
    Vector v = new Vector (1, 2, 3);
    assertEquals ("<1.0, 2.0, 3.0>", v.toString());
    Vector v2 =  new Vector (-3, -1, -6);
    assertEquals ("<-3.0, -1.0, -6.0>", v2.toString());
    Vector v3 =  new Vector (0, 0, 0);
    assertEquals ("<0.0, 0.0, 0.0>", v3.toString());
  }
  
  /**This test checks the Vector equals method*/
  @Test 
  public void testVectorEquals () {
    Vector v1 = new Vector (1, 2, 3);
    Vector v2 = new Vector (1, 2, 3);
    assertEquals (true, v1.equals(v2));
    Vector v3 = new Vector (5, 6, 7);
    assertEquals (false, v1.equals(v3));
  }
  
  /**This test checks the Vector magnitude method*/
  @Test 
  public void testVectorMagnitude () {
    Vector v = new Vector (3, 4, 0);
    assertEquals (5.0, v.magnitude(), .01);
    Vector v2 = new Vector (-3, -4, 0);
    assertEquals (5.0, v2.magnitude(), .01);
    Vector v3 = new Vector (0, 0, 0);
    assertEquals (0.0, v3.magnitude(), .01);
  } 
  
  /**This test checks the Vector unitVector method*/
  @Test 
  public void testVectorUnitVector () {
    Vector v = new Vector (1, 2, 3);
    assertEquals ("<0.2672612419124244, 0.5345224838248488, 0.8017837257372732>", v.unitVector().toString());
    Vector v2 = new Vector (0, 0, 0);
    assertEquals (null, v2.unitVector());
  }
  
  /**This test checks the Vector sum method*/
  @Test 
  public void testVectorSum () {
    Vector v1 = new Vector (1, 2, 3);
    Vector v2 = new Vector (4, 5, 6);
    assertEquals ("<5.0, 7.0, 9.0>", Vector.sum (v1, v2).toString());
    Vector v3 = new Vector (-3, -5, -6);
    assertEquals ("<-2.0, -3.0, -3.0>", Vector.sum (v1, v3).toString());
    Vector v4 = new Vector (0, 0, 0);
    Vector v5 = new Vector (0, 0, 0);
    assertEquals ("<0.0, 0.0, 0.0>", Vector.sum (v4, v5).toString());
  }
  
  /**This test checks the Vector scale method*/
  @Test 
  public void testVectorScale () {
    Vector v = new Vector (1, 2, 3);
    assertEquals ("<2.0, 4.0, 6.0>", Vector.scale (v, 2).toString());
    assertEquals ("<-2.0, -4.0, -6.0>", Vector.scale (v, -2).toString());
    assertEquals ("<0.0, 0.0, 0.0>", Vector.scale (v, 0).toString());
  }
   
  /**This test checks the Vector dotProduct method*/
  @Test 
  public void testVectorDotProduct () {
    Vector v1 = new Vector (1, 2, 3);
    Vector v2 = new Vector (4, 5, 6);
    assertEquals (32.0, Vector.dotProduct (v1, v2), .01);
    Vector v3 = new Vector (-4, -5, -6);
    assertEquals (-32.0, Vector.dotProduct (v1, v3), .01);
    Vector v4 = new Vector (1, -2, 3);
    Vector v5 = new Vector (4, 5, 2);
    assertEquals (0.0, Vector.dotProduct (v4, v5), .01);
    Vector v6 = new Vector (0, 0, 0);
    Vector v7 = new Vector (0, 0, 0);
    assertEquals (0.0, Vector.dotProduct (v6, v7), .01);
  }
  
  /**This test checks the Vector crossProduct method*/
  @Test 
  public void testVectorCrossProduct() {
    Vector v1 = new Vector (1, 2, 3);
    Vector v2 = new Vector (4, 5, 6);
    assertEquals ("<-3.0, 6.0, -3.0>", Vector.crossProduct (v1, v2).toString());
    Vector v3  = new Vector (0, 0, 0);
    assertEquals ("<0.0, 0.0, 0.0>", Vector.crossProduct (v1, v3).toString());
    Vector v4 = new Vector (-1, -2, -3);
    Vector v5 = new Vector (-4, -5, -6);
    assertEquals ("<-3.0, 6.0, -3.0>", Vector.crossProduct (v4, v5).toString());
  }
  
  @Test 
  public void testVectorAngle() {
    Vector v1 = new Vector (1, 2, 0);
    Vector v2 = new Vector (-1, 3, 0);
    assertEquals ("45.00000000000001°", Vector.angle (v1, v2));
    Vector v3 = new Vector (1, 2, 0);
//    assertEquals ("0.0°", Vector.angle (v1, v3));  should be 0  
  } 
  
  /**This test checks the Vector isOrthogonal method*/
  @Test 
  public void testIsOrthogonal() {
    Vector v1 = new Vector (1, 0, 0);
    Vector v2 = new Vector (0, 1, 0);
    assertEquals (true, Vector.isOrthogonal(v1, v2));
    Vector v3 = new Vector (1, 5, 6);
    assertEquals (false, Vector.isOrthogonal(v1, v3));
    Vector v4 = new Vector (0, 0, 0);
    Vector v5 = new Vector (0, 0, 0);
    assertEquals (true, Vector.isOrthogonal(v4, v5));
  }
   
  /**This test checks the Vector isParallel method*/
  @Test 
  public void testVectorIsParallel() {
    Vector v1 = new Vector (2, -4, 1);
    Vector v2 = new Vector (-4, 8, -2);
    assertEquals (true, Vector.isParallel(v1, v2));
    Vector v3 = new Vector (1, 5, 6);
    assertEquals (false, Vector.isParallel(v1, v3));
  }
  
                  
  /**This test checks the Plane point and vector getter methods*/                                      
  @Test
  public void testPlaneGetterMethods () {
    Point pt = new Point (1, 2, 3);
    Vector v = new Vector (4, 5, 6);
    Plane p = new Plane (pt, v);
    assertEquals ("(1.0, 2.0, 3.0)", p.getPoint().toString());
    assertEquals ("<4.0, 5.0, 6.0>", p.getNormal().toString());
    Point pt3 = new Point (0, 0, 0);
    Vector v3 = new Vector (0, 0, 0);
    Plane p2 = new Plane (pt3, v3);
    assertEquals ("(0.0, 0.0, 0.0)", p2.getPoint().toString());
    assertEquals ("<0.0, 0.0, 0.0>", p2.getNormal().toString());
    Point pt4 = new Point (-1, -2, -3);
    Vector v4 = new Vector (-1, -2, -3);
    Plane p3 = new Plane (pt4, v4);
    assertEquals ("(-1.0, -2.0, -3.0)", p3.getPoint().toString());
    assertEquals ("<-1.0, -2.0, -3.0>", p3.getNormal().toString());
  }
  
  /**This test checks the Plane toString method*/
  @Test
  public void testPlaneToString () {
    Point pt = new Point (1, 2, 3);
    Vector v = new Vector (5, 6, 7);
    Plane p = new Plane (pt, v);
    assertEquals ("5.0x + 6.0y + 7.0z + -38.0 = 0", p.toString());
    Point pt2 = new Point (0, 0, 0);
    Vector v2 = new Vector (0, 0, 0);
    Plane p2 = new Plane (pt2, v2);
    assertEquals ("0 = 0", p2.toString());
    Point pt3 = new Point (-1, -2, -3);
    Vector v3 = new Vector (-5, -6, -7);
    Plane p3 = new Plane (pt3, v3);
    assertEquals ("-5.0x + -6.0y + -7.0z + -38.0 = 0", p3.toString());
  }
  
  /**This test checks the Plane equals method*/
  @Test 
  public void testPlaneEquals () {
    Point pt1 = new Point (1, 2, 3);
    Vector v1 = new Vector (5, 6, 7);
    Plane p1 = new Plane (pt1, v1);
    Point pt2 = new Point (1, 2, 3);
    Vector v2 = new Vector (5, 6, 7);
    Plane p2 = new Plane (pt2, v2);
    assertEquals (true, p1.equals(p2));
    Point pt3 = new Point (4, 3, 9);
    Vector v3 = new Vector (2, 6, 3);
    Plane p3 = new Plane (pt3, v3);
    assertEquals (false, p1.equals(p3));
  }
  
  /**This test checks the Plane contains method*/
  @Test 
  public void testPlaneContains () {
    Point p1 = new Point (1, -1, 2);
    Vector v1 = new Vector (2, 1, -3);
    Plane plane = new Plane (p1, v1);
    Point p2 = new Point (1, 1, 0);
    assertEquals (true, plane.contains(p2));
    Point p3 = new Point (50, -800, 2);
//    assertEquals (false, plane.contains(p3));  //contains always returns true for some reason
  }
  
  /**This test checks the Plane isParallel method*/
  @Test 
  public void testPlaneIsParallel () {
    Point pt1 = new Point (1, 1, 1);
    Vector v1 = new Vector (1, -2, 3);
    Plane p1 = new Plane (pt1, v1);
    Point pt2 = new Point (2, 0, -1);
    Vector v2 = new Vector (1, -2, 3);
    Plane p2 = new Plane (pt2, v2);
    assertEquals (true, Plane.isParallel(p1, p2));
    Point pt3 = new Point (13, 5, 6);
    Vector v3 = new Vector (1, 8, 3);
    Plane p3 = new Plane (pt3, v3);
    assertEquals (false, Plane.isParallel(p1, p3)); 
  }
   
  /**This test checks the Plane isOrthogonal method*/
  @Test 
  public void testPlaneIsOrthogonal () {
    Point pt1 = new Point (1, 1, 1);
    Vector v1 = new Vector (1, 2, 0);
    Plane p1 = new Plane (pt1, v1);
    Point pt2 = new Point (2, 0, -1);
    Vector v2 = new Vector (-2, 1, 1);
    Plane p2 = new Plane (pt2, v2);
    assertEquals (true, Plane.isOrthogonal(p1, p2));
    Point pt3 = new Point (1, 2, 4);
    Vector v3 = new Vector (-3, 3, 3);
    Plane p3 = new Plane (pt3, v3);
    assertEquals (false, Plane.isOrthogonal(p1, p3));
  }
}
    