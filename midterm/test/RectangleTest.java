package shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	
	public void RectangleTest1() {
		int iWidth = 5;
		int iLength = 10;
		int actualWidth;
		int actualLength;

		Rectangle rec = new Rectangle(iWidth, iLength);
		actualWidth = rec.getiWidth();
		actualLength = rec.getiLength();
		
		assertEquals(actualWidth, iWidth);
		assertEquals(actualLength, iLength);
		assertNotNull(rec);
	}

	public void RectangleTest2() {
		int iWidth = 5;
		int iLength = 10;
		int actualWidth;
		int actualLength;

		Rectangle rec = new Rectangle(1, 2);
		rec.setiLength(iLength);
		rec.setiWidth(iWidth);
		actualWidth = rec.getiWidth();
		actualLength = rec.getiLength();
				
		assertEquals(actualWidth, iWidth);
		assertEquals(actualLength, iLength);
	}
	
	public void RectangleTest3() {
		int iWidth = 5;
		int iLength = 10;
		double expectedArea = 50;
		double actualArea;
		
		Rectangle rec = new Rectangle(iWidth, iLength);
		actualArea = rec.area();
		
		assertEquals(expectedArea, actualArea);
	}
	
	public void RectangleTest4() {
		int iWidth = 5;
		int iLength = 10;
		double expectedPerimeter = 30;
		double actualPerimeter;
		
		Rectangle rec = new Rectangle(iWidth, iLength);
		actualPerimeter = rec.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter);
	}
	
	public void RectangleTest5() {
		
	}
	
}
