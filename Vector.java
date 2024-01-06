/** This class represents a vector.
  * 
  @author Brianna Penkala 
  *
  */

public class Vector {
  
  /** This field stores the x coordinate of the vector*/
  private double xVector;
  /** This field stores the y coordinate of the vector*/
  private double yVector;
  /** This field stores the z coordinate of the vector*/
  private double zVector;
  
  /**This constructor intializes vector with x, y, and z coordinates
    * @param x the x-coordinate of the vector
    * @param y the y-coordinate of the vector
    * @param z the z-coordinate of the vector
    */
  public Vector (double x, double y, double z) {
    this.xVector = x;
    this.yVector = y;
    this.zVector = z;
  }
  
  /**This constructor intializes vector with a point
    * @param point a point to create a vector with the same coordinates
    */
  public Vector (Point point) {
    this.xVector = point.getX();
    this.yVector = point.getY();
    this.zVector = point.getZ();
  }
  
  /**This constructor intializes vector with a vector and a length
    * @param vector the vector to initialize this vector with 
    * @param length the length of the new vector 
    */
  public Vector (Vector vector, double length) {
    vector.scale(vector, length / vector.magnitude());
  }
  
  /**This is the getter method for the x coordinate
    * @return the x value of the vector
    */
  public double getXVector() {
    return this.xVector;
  }
  
  /**This is the getter method for the y coordinate
    * @return the y value of the vector
    */
  public double getYVector() {
    return this.yVector;
  }
  
  /**This is the getter method for the z coordinate
    * @return the z value of the vector
    */
  public double getZVector() {
    return this.zVector;
  }
  
  /**This method returns the string version of the vector
    * @return the string version of the vector
    */
  public String toString() {
    return "<" + getXVector() + ", " + getYVector() + ", " + getZVector() + ">";
  }
  
  /**This method checks if two vectors are equal
    * @param obj the reference object with which to compare
    * @return true if the vectors are the same; false otherwise
    */
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof Vector) {
      Vector v = (Vector) obj;
      return this.getXVector() == v.getXVector() && this.getYVector() == v.getYVector() && this.getZVector() == v.getZVector();
    }
    else
        return false;
  }    
  
  /** This method returns the length of the vector
    * @return the length of the vector
    */
  public double magnitude () {
    return Math.sqrt(Math.pow(getXVector(), 2) + Math.pow(getYVector(), 2) + Math.pow(getZVector(), 2));
  }
  
  /** This method returns the unit vector of the vector
    * @return the unit vector of the vector
    */
  public Vector unitVector () {
    if (this.getXVector() > 0 ||this.getYVector() > 0 || this.getZVector() > 0) {
      double x = this.getXVector() / this.magnitude(); //quotient of vector x-coordinate and magnitude
      double y = this.getYVector() / this.magnitude(); //quotient of vector y-coordinate and magnitude
      double z = this.getZVector() / this.magnitude(); //quotient of vector z-coordinate and magnitude
      return new Vector (x, y, z);
    }
    else 
      return null;
  }
  
  /** This method returns the sum of two vectors
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return the sum of the two vectors
    */
  public static Vector sum (Vector vector1, Vector vector2) {
    double x = vector1.getXVector() + vector2.getXVector(); //sum of x-coordinates
    double y = vector1.getYVector() + vector2.getYVector(); //sum of y-coordinates
    double z = vector1.getZVector() + vector2.getZVector(); //sum of z-coordinates
    return new Vector (x, y, z);
  }
  
  /**This method increases the scale of the vector by an inputted factor
    * @param vector the vector to be scaled by the factor
    * @param factor the factor to scale the vector by
    * @return the scaled version of the vector
    */
  public static Vector scale (Vector vector, double factor) {
    double x = vector.getXVector() * factor; //product of x-coordinate and factor
    double y = vector.getYVector() * factor; //product of y-coordinate and factor
    double z = vector.getZVector() * factor; //product of z-coordinate and factor
    return new Vector (x, y, z);
  }
  
  /** This method returns the dot product of two vectors
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return the dot product of the two vectors
    */
  public static double dotProduct (Vector vector1, Vector vector2) {
    double x = vector1.getXVector() * vector2.getXVector(); //product of x-coordinates
    double y = vector1.getYVector() * vector2.getYVector(); //product of y-coordinates
    double z = vector1.getZVector() * vector2.getZVector(); //product of z-coordinates
    return x + y + z;
  }
  
  /** This method returns the cross product of two vectors    //this works, the issue is with isParallel
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return the cross product of two vectors
    */ 
  public static Vector crossProduct (Vector vector1, Vector vector2) {
    double x = (vector1.getYVector() * vector2.getZVector()) - (vector1.getZVector() * vector2.getYVector()); //product of difference between y and z coordinates
    double y = (vector1.getZVector() * vector2.getXVector()) - (vector1.getXVector() * vector2.getZVector()); //product of difference between z and x coordinates
    double z = (vector1.getXVector() * vector2.getYVector()) - (vector1.getYVector() * vector2.getXVector()); //product of difference between x and y coordinates
    return new Vector (x, y, z);
  }
  
  /**This method returns the angle between two vectors
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return the angle between two vectors
    */
  public static String angle (Vector vector1, Vector vector2) {
    return Math.toDegrees(Math.acos(dotProduct(vector1, vector2) / (vector1.magnitude() * vector2.magnitude()))) + "°";
  }
  
  /** This method returns true if the vectors are orthogonal
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return true if the two vectors are orthogonal; false otherwise
    */
  public static boolean isOrthogonal(Vector vector1, Vector vector2) {
    return dotProduct(vector1, vector2) == 0;
  }
  
  /**This method returns true if the two vectors are parallel
    * @param vector1 the first vector to be considered
    * @param vector2 the second vector to be considered
    * @return true if the two vectors are parallel; false otherwise
    */
  public static boolean isParallel (Vector vector1, Vector vector2) { 
    return crossProduct(vector1, vector2).getXVector() == 0 && crossProduct(vector1, vector2).getYVector() == 0 && crossProduct(vector1, vector2).getZVector() == 0;
  }
}
  
  