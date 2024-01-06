/** This class represents a 3D point.
  * 
  @author Brianna Penkala
  *
  */
public class Point extends GeneralPoint {
  
  /**This constructor intializes the point
    * @param xCoordinate the x-coordinate for the point
    * @param yCoordinate the y-coordinate for the point
    * @param zCoordinate the z-coordinate for the point
    */
  public Point (double xCoordinate, double yCoordinate, double zCoordinate) {
    super(xCoordinate, yCoordinate);
    setZ(zCoordinate);
  }
  
  /**This method returns the coordinates of the point
    * @return the coordinates of the point
    */
  @Override
  public String toString () {
    return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
  }
  
  /** This method checks if two points are equal
    * @param obj the point to compare to
    * @return true if the points are equal; false otherwise
    */
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof Point) {
      Point p = (Point) obj;
      return this.getX() == p.getX() && this.getY() == p.getY() && this.getZ() == p.getZ();
    }
    else
      return false;
  }
  
  /** This method returns the distance between two Points
    * @param point1 first point to be considered 
    * @param point2 second point to be considered 
    * @return the distance between two points
    */
  public static double distance (GeneralPoint point1, GeneralPoint point2) {
    return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2) + Math.pow(point2.getZ() - point1.getZ(), 2));
  }
}