package week1.lectures;

import java.util.Arrays;

public class ThreeSumZero {

	public static void main(String[] args) {

		int [] a = { -25, -20, -15, 5, 10, 20, 40, -30 };
		threeSum2(a);
		
	}
	
	// Brute force that takes N-cube time
	public static void threeSum1(int []a)
	{
		int length = a.length;
		
		for(int i = 0; i < length; i++)
			for(int j = i+1; j < length; j++)
				for(int k = j+1; k < length; k++)
				{
					if ( a[i] + a[j] + a[k] == 0)
					{
						System.out.printf("\n%d %d %d", a[i], a[j], a[k]);
					}
					
				}
		
	}

	// Improvised version that takes N2 log N time
	public static void threeSum2(int []a)
	{
		int length = a.length;
		
		Arrays.sort(a);
		
		for(int i = 0; i < length; i++)
			for(int j = i+1; j < length; j++)
			{
				int partSum = -(a[i]+a[j]);
				if (Arrays.binarySearch(a, partSum ) > -1)
				{
						System.out.printf("\n%d %d %d", a[i], a[j], partSum );
				}
			}
		
	}
}
