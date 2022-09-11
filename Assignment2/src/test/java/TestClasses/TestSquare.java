package TestClasses;

import Abstract.Shape;
import Classes.Square;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestSquare {
	private Square square;
	private double expectArea;

	public TestSquare(Square square) throws IllegalAccessException {
		this.square = square;
	}

	public Square getSquare() {
		return square;
	}

	@Test
	public void testArea() {
		assertEquals(expectArea, square.getArea());
	}

}
