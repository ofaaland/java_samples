class Table2DCalc
{ 
	public static void main(String args[]) 
	{
		Integer min = -10;
		Integer max = 10;
		Integer step = 1;

		Integer y = max;
		System.out.println("==============================");

		while (y >= min) {
			Integer x = min;

			while (x <= max) {
				//Integer z = x*x+y*y;
				Integer z = x*x+10*y;
				char visualization;

				//System.out.print(String.format("%5d  ", z));
				if (z > 120) {
					visualization = '!';
				} else if (z > 80) {
					visualization = '#';
				} else if (z > 40) {
					visualization = '%';
				} else if (z > 10) {
					visualization = '*';
				} else if (z > 0) {
					visualization = '+';
				} else {
					visualization = '-';
				}

				System.out.print(String.format("%c ", visualization));
				x += step;
			}
			System.out.println("");
			y -= step;
		}
	} 
}
