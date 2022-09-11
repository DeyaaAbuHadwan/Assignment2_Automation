package TestClasses;

import Abstract.Shape;
import Classes.Triangle;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestTriangle {
	private Triangle triangle;

	public TestTriangle(Triangle triangle) throws IllegalAccessException {
		this.triangle = triangle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	@Test
	public void testArea() {
		assertEquals(triangle.expectArea, triangle.getArea());
	}

}
