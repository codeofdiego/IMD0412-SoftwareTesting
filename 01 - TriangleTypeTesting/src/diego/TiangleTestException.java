package diego;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized.Parameters;

public class TiangleTestException {
	private int l1;
	private int l2;
	private int l3;
	private Class<? extends Exception> c;
	
	@Rule
	public ExpectedException expecation = ExpectedException.none();
	
	public TiangleTestException(Class<? extends Exception> c, int l1, int l2, int l3)
	{
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.c = c;
	}
	
	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][] {
			{IllegalArgumentException.class, 0, 2, 2},
			{IllegalArgumentException.class, 2, 0, 2},
			{NullPointerException.class, null, 2, 0},
		});
	}

	@Test(expected = IllegalArgumentException.class)
	public void evaluateShouldThrowException1()
	{
		TriangleUtil triangle = new TriangleUtil();
		triangle.defineType(-5, 2, 3);
	}

}
