package pkg;

public class Calc {
	public int sum(int[] values) {
		int result = 0;
		for(int v: values) {
			result += v;
		}
		return result;
	}
}
