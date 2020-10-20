package shape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		this.setiWidth(width);
		this.setiLength(length);
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return this.iLength * this.iWidth;
	}
	
	public double perimeter() {
		return 2*this.iLength + 2*this.iWidth;
	}	
	
	public int compareTo(Object obj) {
		if (((Rectangle) obj).area() > this.area()) {
			return -1;
		}
		else if (((Rectangle) obj).area() < this.area()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
