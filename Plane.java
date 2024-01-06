/** This class represents a plane.
  * 
  @author Brianna Penkala
  *
  */
public class Plane {

  /** This field represents a Point*/
  private Point point;
  /** This field represents a normal vector*/
  private Vector normalVector;
    
  /** This constructor intializes the plane with a Point and a vector
    * @param point a point that the plane contains 
    * @param vector a normal vector 
    */
  public Plane (Point point, Vector vector) {
    this.point = point; 
    this.normalVector = vector;
  }
  
  /**This constructor intializes a plane with three points
    * @param point1 the first point that the plane contains
    * @param point2 the second point that the plane contains
    * @param point3 the third point that the plane contains
    */
  public Plane (Point point1, Point point2, Point point3) {
    //vector between p1 and p2
    Vector vector1 = new Vector (point1.getX() - point2.getX(), point1.getY() - point2.getY(), point1.getZ() -  point2.getZ()); //a new vector from point 1
    //vector between p2 and p3
    Vector vector2 = new Vector (point2.getX() - point3.getX(), point2.getY() - point3.getY(), point2.getZ() -  point3.getZ()); //a new vector from point 1
    this.normalVector = Vector.crossProduct(vector1, vector2);
    this.point = point1;
  }
  
  /** This method returns the point for the plane
    * @return the point for the plane 
    */
  public Point getPoint() {
    return this.point;
  }
  
  /** This method returns the normal vector for the plane
    * @return the normal vector for the plane
    */
  public Vector getNormal() { 
    return this.normalVector;
  }
  
  /** This method returns the string version of the plane
    * @return the string version of the plane
    */
  public String toString () {
    if (getNormal().toString().equals("<0.0, 0.0, 0.0>") && getPoint().toString().equals("(0.0, 0.0, 0.0)"))
          return "0 = 0";
        else {
          double a = normalVector.getXVector(); //the x-coordinate of the vector
          double b = normalVector.getYVector(); //the x-coordinate of the vector
          double c = normalVector.getZVector(); //the x-coordinate of the vector
          double d = -((point.getX() * normalVector.getXVector()) + (point.getY() * normalVector.getYVector()) + (point.getZ() * normalVector.getZVector()));
          return a + "x + " + b + "y + " + c + "z + " + d + " = 0";
        }
  }
  
  /** This method checks if two planes are equal        
    * @param obj the reference object with which to compare
    * @return true if the two planes are equal; false otherwise
    */  
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof Plane) {
      Plane p = (Plane) obj;
      return Vector.isParallel(this.getNormal(), p.getNormal()) && this.contains(p.getPoint());
    }
    else 
      return false;
  }
  
  /** This method checks if the plane contains an inputted point
    * @param point2 the point that the plane may contain 
    * @return true if the point is in the plane; false otherwise
    */
  public boolean contains (Point point2) {
    //equation for inputted point
    double a = normalVector.getXVector() * point.getX(); //product of vector x-coordinate and point x-coordinate
    double b = normalVector.getYVector() * point.getY(); //product of vector x-coordinate and point y-coordinate
    double c = normalVector.getZVector() * point.getZ(); //product of vector x-coordinate and point z-coordinate
    double d = -((point.getX() * normalVector.getXVector()) + (point.getY() * normalVector.getYVector()) + (point.getZ() * normalVector.getZVector()));
    double value1 = a + b + c + d;
    //equation for this. point
    double z = normalVector.getXVector() * point2.getX(); //product of vector x-coordinate and point x-coordinate
    double y = normalVector.getYVector() * point2.getY(); //product of vector x-coordinate and point y-coordinate
    double x = normalVector.getZVector() * point2.getZ(); //product of vector x-coordinate and point z-coordinate
    double w = -((point2.getX() * normalVector.getXVector()) + (point2.getY() * normalVector.getYVector()) + (point2.getZ() * normalVector.getZVector()));
    double value2 = z + y + x + w;
    return value1 == value2;
  }
    
  /** This method checks if the planes are parallel
    * @param plane1 the first plane to be considered
    * @param plane2 the second plane to be considered
    * @return true if the two planes are parallel; false otherwise
    */ 
  public static boolean isParallel (Plane plane1, Plane plane2) {
      return Vector.isParallel(plane1.getNormal(), plane2.getNormal());
  }
    
  /**This method checks if the planes are orthogonal
    * @param plane1 the first plane to be considered
    * @param plane2 the second plane to be considered
    * @return true if the planes are orthogonal
    */
  public static boolean isOrthogonal (Plane plane1, Plane plane2) {
    return Vector.isOrthogonal(plane1.getNormal(), plane2.getNormal()) == true;
  }
}