/** This class has the basic methods of a point. 
  * 
  * @author Brianna Penkala
  * 
  */
public abstract class GeneralPoint {
  
  /** This field stores the x coordinate of the point*/
  private double xCoordinate;
  /** This field stores the y coordinate of the point*/
  private double yCoordinate;
  /** This field stores the z coordinate of the point*/
  private double zCoordinate;
  
  /** This constructor intializes the coordinates of the point
    * @param xCoordinate the x-coordinate for the point
    * @param yCoordinate the y-coordinate for the point
    */
  public GeneralPoint (double xCoordinate, double yCoordinate) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
  }
  
  /**This is the getter method for the x coordinate
    * @return the x-coordinate
    */
  public double getX () {
    return this.xCoordinate;
  }
  
  /**This is the getter method for the y coordinate
    * @return the y-coordinate
    */
  public double getY () {
    return this.yCoordinate;
  }
  
  /**This is the getter method for the z coordinate
    * @return the z-coordinate
    */
  public double getZ () {
    return this.zCoordinate;
  }
  
  /**This is the setter method for the z coordinate
    * @param zCoordinate the z-coordinate for the point
    */
  public void setZ (double zCoordinate) {
    this.zCoordinate = zCoordinate;
  }
  
  /**This is the abstract method for overriding toString*/
  public abstract String toString ();

  /** This is the abstract method for overriding equals()
    * @param obj the point to compare to
    */
  public abstract boolean equals (Object obj);
}
