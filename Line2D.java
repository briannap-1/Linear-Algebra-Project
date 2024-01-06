/** This class represents a 2D line.
  * 
  @author Brianna Penkala
  *
  */
public class Line2D extends GeneralLine{
  
  /** This field stores the first point in the line*/
  private Point2D pointA;
  /** This field stores the second point in the line*/
  private Point2D pointB;
  
  /** This constructor intializes the points of the line
    * @param pointA the first point to make the line
    * @param pointB the second point to make the line
    */
  public Line2D (GeneralPoint pointA, GeneralPoint pointB) { 
    setA (pointA);
    setB (pointB);
    setSlope();
  }
  
  /**This method returns the slope-intercept equation for a 2D line
    * @return the slope intercept equation of a 2D line
    */
  @Override
  public String toString () {
    if (getA().toString().equals ("(0.0, 0.0)") && getB().toString().equals ("(0.0, 0.0)"))
      return "x = 0.0";
    else
      return "y = " + getSlope() + "x + " + getYIntercept();
  }
  
  /**This method checks if two lines are parallel
    * @param line1 the first line to be considered
    * @param line2 the second line to be considered 
    * @return true if the lines are parallel; false otherwise
    */
  public static boolean isParallel (GeneralLine line1, GeneralLine line2) {
    if (line1.getSlope() == line2.getSlope() && line1.getYIntercept() != line2.getYIntercept())
      return true;
    else
      return false;
  }
    
  /**This method returns the intersection if the lines intersect    //need to fix and adjust for types (generics possibly)
    * @param line1 the first line to be considered
    * @param line2 the second line to be considered 
    * @return the intersection point of the two lines if it exists; null otherwise
    */  
  public static GeneralPoint intersection (GeneralLine line1, GeneralLine line2) { 
    if (Line2D.isParallel(line1, line2))
      return null;
    else {
    double x = (line2.getYIntercept() - line1.getYIntercept()) / (line1.getSlope() - line2.getSlope()); //first part of intersection calculation
      double y = (line1.getSlope() * x + line1.getYIntercept()); //second part of intersection calculation
      return new Point2D (x, y);
    }
   } 
}
    