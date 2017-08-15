package diego;
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import diego.TriangleUtil.TriangleType;

@RunWith(value = Parameterized.class)
public class TriangleTestParameterized {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1, 1, 1, TriangleType.EQUILATERAL}, 		// L1 = L2 = L3
			{2, 3, 4, TriangleType.SCALENE},			// L1 != L2 != L3
			{2, 2, 3, TriangleType.ISOCELES},			// L1 = L2 != L3
			{1, 40, 40, TriangleType.ISOCELES},			// L1 != L2 = L3
			{50, 30, 50, TriangleType.ISOCELES},		// L2 != L1 = L3
			{1, 2, 5, TriangleType.NOT_TRIANGLE},		// L1 + L2 < L3
			{10, 60, 40, TriangleType.NOT_TRIANGLE},	// L1 + L3 < L2
			{99, 1, 96, TriangleType.NOT_TRIANGLE},		// L2 + L3 < L1
			{99, 1, 100, TriangleType.NOT_TRIANGLE},	// L1 + L2 = L3
			{99, 100, 1, TriangleType.NOT_TRIANGLE},	// L1 + L3 = L2
			{51, 50, 1, TriangleType.NOT_TRIANGLE},		// L2 + L3 = L1
		});
	}
	
	private int s1, s2, s3;
	private TriangleType tExpected;
	
	public TriangleTestParameterized(int s1, int s2, int s3, TriangleType tExpected) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.tExpected = tExpected;
	}
	
	@Test
	public void evaluateExpression() {
		TriangleUtil triangle = new TriangleUtil();
		TriangleType expected = triangle.defineType(this.s1, this.s2, this.s3);
		assertEquals(this.tExpected, expected);
	}
	
	
	
}
