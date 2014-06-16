package week1.lectures;

public class Log {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		
		double logBase2X = Math.log(x) * 1.0 / Math.log(2);
		double loglogX = Math.log(logBase2X) * 1.0 / Math.log(2);
		
		System.out.printf("\nLog Base 2 (%f) Value = %f", x, logBase2X);
		System.out.printf("\nLog-Log Base 2 (%f) Value = %f", x, loglogX);
	}
}
