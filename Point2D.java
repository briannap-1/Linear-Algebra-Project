/** This class represents a 2D point.
  * 
  @author Brianna Penkala
  *
  */
public class Point2D extends GeneralPoint { 
  
  /** This constructor initializes the point
    * @param xCoordinate the x-coordinate for the point
    * @param yCoordinate the y-coordinate for the point
    */
  public Point2D (double xCoordinate, double yCoordinate) {
    super(xCoordinate, yCoordinate);
  }
  
  /**This method returns the string version of the point
    * @return the string version of the point
    */
  public String toString () {
    return "(" + getX() + ", " + getY() + ")";
  }
  
  /**This method checks if two points are equal
    * @param obj the point to compare to
    * @return true if the two points are equal; false otherwise
    */
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof GeneralPoint) {
      GeneralPoint p = (GeneralPoint) obj;
      return this.getX() == p.getX() && this.getY() == p.getY();
    } else
      return false;
  }
  
  /** This method returns the distance between two points
    * @param point1 first point to be considered 
    * @param point2 second point to be considered 
    * @return the distance between two points
    */
  public static double distance (GeneralPoint point1, GeneralPoint point2) {
    return Math.hypot(point2.getX() - point1.getX(), point2.getY() - point1.getY());
  }
}