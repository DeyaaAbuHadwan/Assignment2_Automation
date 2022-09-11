package TestClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Abstract.Shape;
import Classes.Circle;

public class TestCircle {
	private Circle circle;

	public TestCircle(Circle circle) throws IllegalAccessException {
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	@Test
	public void testArea() {
		assertEquals(circle.expectArea, circle.getArea());
	}

}
