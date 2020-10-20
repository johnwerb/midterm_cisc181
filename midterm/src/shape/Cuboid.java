package shape;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.setiDepth(depth);
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return this.iDepth * getiWidth() * getiLength();
	}
	
	public double area() {
		return 2 * this.iDepth * getiWidth() + 2 * getiWidth() * getiLength() + 2 * this.iDepth * getiLength();
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Object obj) {
		if (((Cuboid) obj).volume() > this.volume()) {
			return -1;
		}
		else if (((Cuboid) obj).volume() < this.volume()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
