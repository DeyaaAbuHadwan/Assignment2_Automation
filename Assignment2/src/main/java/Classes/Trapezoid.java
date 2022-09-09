package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Trapezoid extends Shape {
	private double width1;
	private double width2;
	private double high;
	private double expectArea;

	public Trapezoid(double width1, double width2, double high, double expectArea) throws IllegalAccessException {
		this.high = high;
		this.width1 = width1;
		this.width2 = width2;
		this.expectArea = expectArea;
	}

	public double getWidth1() {
		return width1;
	}

	public double getWidth2() {
		return width2;
	}

	public double getHigh() {
		return high;
	}

	public double getArea() {
		return 0.5 * (getWidth1() + getWidth2()) * getHigh();
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, getArea());
	}

	@Override
	public String toString() {
		return "* Trapezoid with :\n- First width= " + width1 + "\n- second width =" + width2 + "\n- high = " + high
				+ "\n> Area= " + getArea();
	}
}
