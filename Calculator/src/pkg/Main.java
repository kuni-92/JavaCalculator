package pkg;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please enter two number.");
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int[] values = new int[2];		
		for(int index = 0; index < values.length; index++) {
			System.out.print("number " + (index +1 ) + ": ");
			values[index] = sc.nextInt();
		}
		sc.close();

		Calc calc = new Calc();
		System.out.println("calculator result: " + calc.sum(values));
	}

}
