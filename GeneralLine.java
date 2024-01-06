/** This class has the basic methods of a line. 
  * 
  * @author Brianna Penkala
  * 
  */
public abstract class GeneralLine {
  
  /** This field stores the first point in a line*/
  private GeneralPoint pointA;
  /** This field stores the second point in a line*/
  private GeneralPoint pointB;
  /** This field stores the slope of a line*/
  private double slope;
  /** This field stores the vector of a line*/
  private Vector vector;
  
  /**This is the getter method for the first point
    * @return pointA
    */
  public GeneralPoint getA () { 
    return this.pointA;
  }
  
  /**This is the getter method for the second point
    * @return pointB
    */
  public GeneralPoint getB() {
    return this.pointB;
  }
  
  /**This is the getter method for the slope
    * @return the slope
    */
  public double getSlope() {
    return this.slope;
  }
  
  /**This is the getter method for the vector
    * @return the vector
    */
  public Vector getVector() {
    return this.vector;
  }
  
  /**This is the getter method for the y-intercept
    * @return the y-intercept
    */  
  public double getYIntercept() {
    return pointA.getY() - slope * pointA.getX();
  }
  
  /**This is the setter method for the first point
    * @param point the point for pointA
    */
  public void setA (GeneralPoint point) {
    this.pointA = point;
  }
  
  /**This is the setter method for the second point
    * @param point the point for pointB
    */
  public void setB(GeneralPoint point) {
    this.pointB = point;
  }
  
  /**This is the setter method for the slope*/
  public void setSlope() {
    this.slope = (pointB.getY() - pointB.getX()) / (pointA.getY() - pointA.getX());
  }
  
  /**This is the setter method for the vector
    * @param vector the vector to set
    */
  public void setVector (Vector vector) {
    this.vector = vector;
  }
  
  /**This method checks if two lines are equal
    * @param obj the reference object with which to compare
    */
  @Override
  public boolean equals (Object obj) {
    if (obj instanceof GeneralLine) {
      GeneralLine l = (GeneralLine) obj;
      return this.getSlope() == l.getSlope() && this.getYIntercept() == l.getYIntercept();
    }
    else
        return false;
  }
  
  /**This is the abstract method for toString*/ 
  public abstract String toString ();     
}



