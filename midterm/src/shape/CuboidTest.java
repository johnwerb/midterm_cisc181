package shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboidTest {

	@Test
	public void CuboidTest1() {
		int iWidth = 5;
		int iLength = 10;
		int iDepth = 20;
		int actualWidth;
		int actualLength;
		int actualDepth;
		
		Cuboid cub = new Cuboid(iWidth, iLength, iDepth);
		actualWidth = cub.getiWidth();
		actualLength = cub.getiLength();
		actualDepth = cub.getiDepth();
		
		assertEquals(actualWidth, iWidth);
		assertEquals(actualLength, iLength);
		assertEquals(actualDepth, iDepth);
		assertNotNull(cub);
	}
	
	@Test
	public void CuboidTest2() {
		int iWidth = 5;
		int iLength = 10;
		int iDepth = 20;
		int actualWidth;
		int actualLength;
		int actualDepth;

		Cuboid cub = new Cuboid(1, 2, 3);
		cub.setiLength(iLength);
		cub.setiWidth(iWidth);
		cub.setiDepth(iDepth);
		actualWidth = cub.getiWidth();
		actualLength = cub.getiLength();
		actualDepth = cub.getiDepth();
				
		assertEquals(actualWidth, iWidth);
		assertEquals(actualLength, iLength);
		assertEquals(actualDepth, iDepth);

	}
	
	@Test
	public void CuboidTest3() {
		int iWidth = 5;
		int iLength = 10;
		int iDepth = 20;
		double expectedArea = 700;
		double actualArea;

		Cuboid cub = new Cuboid(iWidth, iLength, iDepth);
		actualArea = cub.area();
		
		assertEquals(actualArea, expectedArea);
	}
	
	@Test
	public void CuboidTest4() {
		int iWidth = 5;
		int iLength = 10;
		int iDepth = 20;
		
		Cuboid cub = new Cuboid(iWidth, iLength, iDepth);

		assertThrows(UnsupportedOperationException.class, () -> {
			cub.perimeter();
		});
	 
	}
	
	@Test
	public void CuboidTest5() {
		int iWidth = 5;
		int iLength = 10;
		int iDepth = 20;
		double expectedVolume = 1000;
		double actualVolume;

		Cuboid cub = new Cuboid(iWidth, iLength, iDepth);
		actualVolume = cub.volume();
		
		assertEquals(actualVolume, expectedVolume);
	}
	 

}
