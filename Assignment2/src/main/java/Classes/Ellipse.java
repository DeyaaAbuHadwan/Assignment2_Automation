package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Ellipse extends Shape {
	private double semiMajorAxis;
	private double semiMinorAxis;
	private final double PI = 3.14;
	public double expectArea;

	public Ellipse(double semiMajorAxis, double semiMinorAxis, double expectArea) throws IllegalAccessException {
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;
		this.expectArea = expectArea;
	}

	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	public double getSemiMinorAxis() {
		return semiMinorAxis;
	}

	public double getArea() {
		return PI * getSemiMajorAxis() * getSemiMinorAxis();
	}

	

	@Override
	public String toString() {
		return "* Ellipse with :\n- semiMajorAxis= " + semiMajorAxis + "\n- semiMinorAxis" + semiMinorAxis
				+ "\n> Area= " + getArea();
	}

}
