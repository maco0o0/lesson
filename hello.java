public class hello {
	public static void main(String[] args) {
		System.out.println("hello");
		int i;
		if (i % 3 == 0 && i % 5 == 0) {
			System.out.println("");
		} else if (i % 3 == 0) {
			System.out.println("a");
		} else if (i % 5 == 0) {
			System.out.println("b");
		}
		multiply();
	}

	public void multiply() {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.print(x * y);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
