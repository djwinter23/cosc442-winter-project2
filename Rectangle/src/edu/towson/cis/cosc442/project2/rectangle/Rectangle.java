package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public Double getLength()
	{
		double length = Math.abs(p2.getX()-p1.getX());
		return length;
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public Double getWidth()
	{
		double width = Math.abs(p2.getY()-p1.getY());
		return width;
	}
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public double getArea() {
		return getLength() * getWidth();
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow(getLength(), 2) + Math.pow(getWidth(), 2));
	}
}
