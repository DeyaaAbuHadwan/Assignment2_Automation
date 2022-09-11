package TestClasses;

import Abstract.Shape;
import Classes.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestEllipse {
	private Ellipse ellipse;

	public TestEllipse(Ellipse ellipse) throws IllegalAccessException {
		this.ellipse = ellipse;

	}

	public Ellipse getSemiMajorAxis() {
		return ellipse;
	}

	@Test
	public void testArea() {
		assertEquals(ellipse.expectArea, ellipse.getArea());
	}

}
