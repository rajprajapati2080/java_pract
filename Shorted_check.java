import java.util.*;
class Shorted_check 
{
	boolean isShorted(int Arr1[])
	{
		for (int i =1;i<arr.length ;i++ ) 
		{
		if (arr[i]<arr[i-1]) 
			{
				return false;	
			}
		}
		return true;
	}
	public static void main(String []arg)
	{
		int []arr = {10,20,100,50};
	}
}