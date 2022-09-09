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
import Abstract.Shape;
import Classes.*;

public class FactoryTestNG {
	@Factory
	public Object[] FactoryMethod() throws NumberFormatException, IllegalAccessException {
		Object[] data = new Object[12];
		ReadCSV csv = new ReadCSV();
		Object[][] res = csv.readDataLineByLine(
				".\\src\\test\\resources\\TestArea.csv");
		int index = 0;
		for (Object[] s : res) {
			Shape shape;
			switch (s[0].toString()) {
			case "Triangle":
				shape = new Triangle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Square":
				shape = new Square(Double.parseDouble(s[1].toString()), Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Rectangle":
				shape = new Rectangle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Parallelogram":
				shape = new Parallelogram(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Trapezoid":
				shape = new Trapezoid(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[3].toString()), Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Circle":
				shape = new Circle(Double.parseDouble(s[1].toString()), Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Ellipse":
				shape = new Ellipse(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;
			case "Sector":
				shape = new Sector(Double.parseDouble(s[1].toString()), Double.parseDouble(s[2].toString()),
						Double.parseDouble(s[4].toString()));
				data[index++] = shape;
				break;

			}
		}
		return data;

	}
}
