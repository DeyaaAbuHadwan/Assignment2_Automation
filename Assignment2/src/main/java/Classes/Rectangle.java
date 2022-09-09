package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Rectangle extends Shape {
	private double width;
	private double high;
	private double expectArea;

	public Rectangle(double width, double high, double expectArea) throws IllegalAccessException {
		this.width = width;
		this.high = high;
		this.expectArea = expectArea;
	}

	public double getWidth() {
		return width;
	}

	public double getHigh() {
		return high;
	}

	public double getArea() {
		return getHigh() * getWidth();
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, getArea());
	}

	@Override
	public String toString() {
		return "* Rectangle with:\n- width = " + getWidth() + "\n- high= " + getHigh() + "\n> Area= " + getArea();
	}

}
