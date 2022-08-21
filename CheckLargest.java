import java.util.*;
class CheckLargest
{
	public  static int Large(int[]arr1)
	{
		int res = 0;
		for (int i=1; i<arr1.length; i++ ) 
		{
			if (arr1[res]<arr1[i]) 
			{
				res = i;
				
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		int []arr1 = {10,20,36,11,10};
		int flarge = Large(arr1);
		System.out.println(arr1[flarge]);
	}



}