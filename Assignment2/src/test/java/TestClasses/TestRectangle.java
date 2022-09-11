package TestClasses;

import Abstract.Shape;
import Classes.Rectangle;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestRectangle {
	private Rectangle rectangle;

	public TestRectangle(Rectangle rectangle) throws IllegalAccessException {
		this.rectangle = rectangle;

	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	@Test
	public void testArea() {
		assertEquals(rectangle.expectArea, rectangle.getArea());
	}
}
