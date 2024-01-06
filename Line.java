/** This class represents a 3D line.
  * 
  @author Brianna Penkala
  *
  */
public class Line extends GeneralLine {
  
  /** This constructor intializes the line with two points
    * @param pointA the first point to make the line
    * @param pointB the second point to make the line
    */
  public Line (GeneralPoint pointA, GeneralPoint pointB) { 
    setA(pointA);
    setB(pointB);
    //creates a vector between the two points
    Vector v = new Vector (pointA.getX() - pointB.getX(), pointA.getY() - pointB.getY(), pointA.getZ() -  pointB.getZ());
    setVector(v);
  }
  
  /** This constructor intializes the line with a point and a vector
    * @param point a point that the line runs through
    * @param vector a vector that the line is parallel to
    */
  public Line (GeneralPoint point, Vector vector) {
    setA(point);
    setVector(vector);
    Point p = new Point (vector.getXVector(), vector.getYVector(), vector.getZVector()); //the new point from the vector
    setB(p);
  }
    
  /**This method returns the three parametric equations for the line    //this works only when the second constructor is used
    * @return the string version of the line
    */
  public String toString() {   
    if (getA().toString().equals("(0.0, 0.0, 0.0)") && getB().toString().equals("(0.0, 0.0, 0.0)"))
      return "x = 0.0, y = 0.0, z = 0.0";
    else {
    String xEquation = "x = " + getA().getX() + " + " + getVector().getXVector() + "t";
    String yEquation = "y = " + getA().getY() + " + " + getVector().getYVector() + "t";
    String zEquation = "z = " + getA().getZ() + " + " + getVector().getZVector() + "t";
    return xEquation + ", " + yEquation + ", " + zEquation;
    }
  }
  
   /**This method checks if two lines are equal
    * @param obj the line to compare to
    */
  //I wasn't sure how to else compare them to check for equality
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof GeneralLine) {
      GeneralLine l = (GeneralLine) obj;
      return Vector.isParallel(this.getVector(), l.getVector()); 
    }
    else
        return false;
  }
  
  //I don't know if this is what the method is supposed to do, it also causes other tests to fail when it is uncommented
  /**This method returns the vector that is parallel to the line
    * @return the parallel vector
    */
//   public Vector getVector() {
//     Vector v = new Vector (getA().getX(), getA().getY(), getA().getZ());
//     return v;
//   }
  
   /**This method returns the three parametric equations for the line
     * @param line1 the first line to be considered
     * @param line2 the second line to be considered
     * @return true if the lines are parallel; false otherwise
     */ 
  public static boolean isParallel (GeneralLine line1, GeneralLine line2) {
    double x = line1.getVector().getXVector() / line2.getVector().getXVector(); //checking if the vector x values are equivalent 
    double y = line1.getVector().getYVector() / line2.getVector().getYVector(); //checking if the vector y values are equivalent 
    double z = line1.getVector().getZVector() / line2.getVector().getZVector(); //checking if the vector z values are equivalent 
    return x == y && y == z;
  }
  
  /**This method returns the intersection if the lines intersect
    * @param line1 the first line to be considered
    * @param line2 the second line to be considered 
    * @return the intersection of the two lines if it exists; null otherwise
    */
//  public GeneralPoint intersection (GeneralLine line1, GeneralLine line2) {
//    if (Line.isParallel(line1, line2))
//          return false;
//    else {     
//
//    }
//  }   
}