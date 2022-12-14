package Classes;

import Abstract.Shape;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Square extends Shape {
	private double side;
	public double expectArea;

	public Square(double side, double expectArea) throws IllegalAccessException {
		this.expectArea = expectArea;
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public double getArea() {
		return getSide() * getSide();
	}



	@Override
	public String toString() {
		return "* Square with \n- Sides= " + side + "\n> Area= " + getArea();
	}

}
