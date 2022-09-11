package TestClasses;

import Abstract.Shape;
import Classes.Trapezoid;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestTrapezoid {
	private Trapezoid trapezoid;

	public TestTrapezoid(Trapezoid trapezoid) throws IllegalAccessException {
		this.trapezoid = trapezoid;
	}

	public Trapezoid getTrapezoid() {
		return trapezoid;
	}

	@Test
	public void testArea() {
		assertEquals(trapezoid.expectArea, trapezoid.getArea());
	}

}
