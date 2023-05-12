
public class Fibonacci {

	public static void main(String[] args) {
		int x=1;
		int y=0;
		int z;
		while (x<100) {
			z=x;
			x=x+y;
			System.out.print(x+",");
			y=z;
		}

	}

}
