package TestClasses;

import Abstract.Shape;
import Classes.Sector;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestSector {
	private Sector sector;

	public TestSector(Sector sector) throws IllegalAccessException {
		this.sector = sector;

	}

	public Sector getSector() {
		return sector;
	}

	@Test
	public void testArea() {
		assertEquals(sector.expectArea, sector.getArea());
	}

}
