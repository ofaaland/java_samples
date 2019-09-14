class CalcTable
{ 
	public static void main(String args[]) 
	{
		Integer x = -10;

		System.out.println("   x    x^2    3x    2x^2+3x+5");
		System.out.println("==============================");

		while (x <= 10) {
			// System.out.println(x.toString() + "     " + Integer.toString(2*x^2+3*x+5));
			System.out.println(String.format("%5d %5d %5d %5d", x, x*x, 3*x, 2*x*x+3*x+5));
			x += 1;
		}

	} 

}
