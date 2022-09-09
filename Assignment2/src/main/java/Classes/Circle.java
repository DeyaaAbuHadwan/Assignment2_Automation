package Classes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Abstract.Shape;

public class Circle extends Shape {
	private double radius;
	private final double PIE = 3.14;
	private double expectArea;

	public Circle(double radius, double expectArea) throws IllegalAccessException {
		this.radius = radius;
		this.expectArea = expectArea;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return PIE * getRadius() * getRadius();
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, getArea());
	}

	@Override
	public String toString() {
		return "* Circle with :\n- radius= " + radius + "\n> Area= " + getArea();
	}

}
