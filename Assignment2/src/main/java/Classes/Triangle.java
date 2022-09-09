package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Triangle extends Shape {
	private double width;
	private double high;
	private double expectArea;

	public Triangle(double width, double high, double expectArea) throws IllegalAccessException {
		this.high = high;
		this.width = width;
		this.expectArea = expectArea;
	}

	public double getWidth() {
		return width;
	}

	public double getHigh() {
		return high;
	}

	public double getArea() {
		return 0.5 * getWidth() * getHigh();
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, getArea());
	}

	@Override
	public String toString() {
		return "* Triangle with:\n- width= " + width + "\n- high =" + high + "\n> Area= " + getArea();
	}

}
