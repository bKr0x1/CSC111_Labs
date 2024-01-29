
public class Ball {

	private double x, y, disTravledX, disTravledY;

	
	
	public Ball() {
		x = 0;
		y = 0;
		disTravledX = 0;
		disTravledY = 0;
	}
	public Ball(double newX, double newY) {
		x = newX;
		y = newY;
		disTravledX = 0;
		disTravledY = 0;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getDisTravledX() {
		return disTravledX;
	}

	public double getDisTravledY() {
		return disTravledY;
	}
	
	public void move (double dispX, double dispY) {
		x =+ dispX;
		y =+ dispY;
		disTravledX = Math.abs(dispX);
		disTravledY = Math.abs(dispY);
	}
}
