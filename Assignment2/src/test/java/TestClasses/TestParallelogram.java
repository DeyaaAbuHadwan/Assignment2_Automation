package TestClasses;

import Abstract.Shape;
import Classes.Parallelogram;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestParallelogram {
	private Parallelogram parallelogram;

	public TestParallelogram(Parallelogram parallelogram) throws IllegalAccessException {
		this.parallelogram = parallelogram;
	}

	public Parallelogram getParallelogram() {
		return parallelogram;
	}

	@Test
	public void testArea() {
		assertEquals(parallelogram.expectArea, parallelogram.getArea());
	}

}
