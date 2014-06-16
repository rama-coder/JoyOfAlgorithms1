package week1.jobAssignments;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		int [] a = { -25, -20, -15, 5, 10, 20, 40, -30 };
		
//		System.out.println("\nPrinting 3-sum using threeSum3");
//		threeSum3(a);

		System.out.println("\nPrinting 3-sum using threeSum4");
		threeSum4(a);

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
	
	// better version O-N-square algo
	public static void threeSum3(int []a)
	{
			int length = a.length;

			HashSet<Integer> hs = new HashSet();

			for(int i = 0; i < length; i++)
			{
				hs.add(a[i]);
			}
			
			for(int i = 0; i < length; i++)
				for(int j = i+1; j < length; j++)
				{
					int partSum = -(a[i]+a[j]);
					if (hs.contains(partSum))
					{
							System.out.printf("\n%d %d %d", a[i], a[j], partSum );
					}
				}
	}
	
	public static void threeSum4(int []a)
	{
		int length = a.length;
		
		Arrays.sort(a);
		
		for(int i=0; i<=length-3; i++)
		{
			int j = i+1;
			int k = length - 1;
			
			while (j < k)
			{
				int sum = a[i] + a[j] + a[k];
				
				if (sum > 0)
					k--;
				else if (sum==0)
				{
					System.out.printf("\n%d %d %d", a[i], a[j], a[k]);
					k--;
					j++;
				}
				else
					j++;
			}
		}
	}

}
