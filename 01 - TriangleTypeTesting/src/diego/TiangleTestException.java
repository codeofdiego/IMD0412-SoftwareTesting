package diego;

import org.junit.Test;

public class TiangleTestException {


	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException1()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(-5, 2, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException2()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(1, -2, 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException3()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(2, 2, -3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException4()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(120, 60, 65);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException5()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(100, 130, 65);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException6()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(90, 100, 165);
	}

}
