package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Sector extends Shape {
	private double radius;
	private double angle;
	private final double PI = 3.14;
	private double expectArea;

	public Sector(double radius, double angle, double expectArea) throws IllegalAccessException {
		this.radius = radius;
		this.angle = angle;
		this.expectArea = expectArea;

	}

	public double getRadius() {
		return radius;
	}

	public double getAngle() {
		return angle;
	}

	@Test
	public double getArea() {
		return (angle / 360) * PI * getRadius() * getRadius();
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, getArea());
	}

	@Override
	public String toString() {
		return "* Sector with :\n- Radius= " + radius + "\n- Angle " + angle + "\n> Area= " + getArea();
	}

}
