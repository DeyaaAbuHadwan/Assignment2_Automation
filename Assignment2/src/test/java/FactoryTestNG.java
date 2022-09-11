import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Factory;

import Abstract.Shape;
import Classes.Circle;
import Classes.Ellipse;
import Classes.Parallelogram;
import Classes.Rectangle;
import Classes.Sector;
import Classes.Square;
import Classes.Trapezoid;
import Classes.Triangle;
import TestClasses.*;
import Abstract.Shape;
import Classes.*;

public class FactoryTestNG {
	@Factory
	public Object[] FactoryMethod() throws NumberFormatException, IllegalAccessException {
		Object[] data = new Object[12];
		ReadCSV csv = new ReadCSV();
		Object[][] res = csv.readDataLineByLine(".\\src\\test\\resources\\TestArea.csv");
		int index = 0;
		for (Object[] s : res) {
			Shape shape;
			switch (s[0].toString()) {
			case "Triangle":
				shape = new Triangle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				TestTriangle triangle = new TestTriangle((Triangle) shape);
				data[index++] = triangle;
				break;
			case "Square":
				shape = new Square(Double.parseDouble(s[1].toString()), Double.parseDouble(s[4].toString()));
				TestSquare square = new TestSquare((Square) shape);
				data[index++] = square;
				break;
			case "Rectangle":
				shape = new Rectangle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				TestRectangle rectanlge = new TestRectangle((Rectangle) shape);
				data[index++] = rectanlge;
				break;
			case "Parallelogram":
				shape = new Parallelogram(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				TestParallelogram parallelogram = new TestParallelogram((Parallelogram) shape);
				data[index++] = parallelogram;
				break;
			case "Trapezoid":
				shape = new Trapezoid(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[3].toString()), Double.parseDouble(s[4].toString()));
				TestTrapezoid trapezoid = new TestTrapezoid((Trapezoid) shape);
				data[index++] = trapezoid;
				break;
			case "Circle":
				shape = new Circle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[4].toString()));
				TestCircle circle = new TestCircle((Circle) shape);
				data[index++] = circle;
				break;
			case "Ellipse":
				shape = new Ellipse(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				TestEllipse ellipse = new TestEllipse((Ellipse) shape);
				data[index++] = ellipse;
				break;
			case "Sector":
				shape = new Sector(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				TestSector sector = new TestSector((Sector) shape);
				data[index++] = sector;
				break;

			}
		}
		return data;

	}
}
