package diego;

public class TriangleUtil {
	
	public enum TriangleType
	{
		NOT_TRIANGLE, EQUILATERAL, ISOCELES, SCALENE;
	}
	
	public TriangleType defineType(int side1, int side2, int side3)
	{
		// TO-DO
		if ((side1 < 1 || side1 > 100) ||
			(side2 < 1 || side2 > 100) ||
			(side3 < 1 || side3 > 100)) {
			throw new IllegalArgumentException();
		} else if (side1 >= side2 + side3 ||
					side2 >= side1 + side3 ||
					side3 >= side2 + side1) {
			return TriangleType.NOT_TRIANGLE;
		}
		
		if (side1 == side2 && side2 == side3) {
			return TriangleType.EQUILATERAL;
		} else if (side1 == side2 && side2 != side3 ||
			side1 != side2 && side2 == side3 ||
			side1 == side3 && side3 != side2) {
			return TriangleType.ISOCELES;
		} else {
			return TriangleType.SCALENE;
		}
	}
}
