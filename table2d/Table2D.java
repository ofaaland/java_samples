class Table2D
{ 
	public static void main(String args[]) 
	{
		Integer min = -3;
		Integer max = 3;
		Integer step = 1;

		Integer y = max;
		System.out.println("==============================");

		while (y >= min) {
			Integer x = min;

			while (x <= max) {
				System.out.print(String.format("(%3d,%3d)  ", x, y));
				x += step;
			}
			System.out.println("");
			y -= step;
		}
	} 
}
