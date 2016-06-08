import static java.lang.Math.sqrt;

class Point {

	double x;
	double y;
	
	Point(Double xVal, double yVal) {
	
	x= xVal;
	y= yVal;
	
	}
	
		Point(final Point oldPoint) {
	    x= oldPoint.x;
	    y = oldPoint.y;
		}
	
	void move (double xDelta, double yDelta) {
		x += xDelta;
		y += yDelta;
	}
	double distance(final Point aPoint) {
		return sqrt((x- aPoint.x)*(x-aPoint.x) + (y- aPoint.y)*(y-aPoint.y));
	}
	
	public String toString() {
		   return Double.toString(x) +", " + y;
}
}
