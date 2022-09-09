
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abstract.Shape;
import Classes.*;

public class DataProvider {
	public static void main(String[] args) {

	}

	@org.testng.annotations.DataProvider
	public Object[][] ProviderMethod() {

		ReadCSV csv = new ReadCSV();
		Object[][] res = csv.readDataLineByLine(
				".\\src\\test\\resources\\TestArea.csv");
//		for (Object[] objects : res) {
//			System.out.print("\n-> ");
//			for (Object objects2 : objects) {
//				System.out.print(objects2 + " - ");
//			}
//		}
//		System.out.println();
		return res;
	}

	@Test(dataProvider = "ProviderMethod")
	public void testCases(String shapeOfObject, String var1, String var2, String var3, String result)
			throws NumberFormatException, IllegalAccessException {
		Shape shape;
		switch (shapeOfObject) {
		case "Triangle":
			shape = new Triangle(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Square":
			shape = new Square(Double.parseDouble(var1), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Rectangle":
			shape = new Rectangle(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Parallelogram":
			shape = new Parallelogram(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Trapezoid":
			shape = new Trapezoid(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(var3),
					Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Circle":
			shape = new Circle(Double.parseDouble(var1), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Ellipse":
			shape = new Ellipse(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(result));
			assertEquals(Double.parseDouble(result), shape.getArea());
			break;
		case "Sector":
			shape = new Sector(Double.parseDouble(var1), Double.parseDouble(var2), Double.parseDouble(result));
			break;

		}
	}
}
