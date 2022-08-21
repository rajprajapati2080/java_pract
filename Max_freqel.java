import java.io.*;
class Max_freqel
{

	static int maxFreq(int []arr, int n)
	{
		// using moore's voting algorithm
		int res = 0;
		int count = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] == arr[res]) {
				count++;
			} else {
				count--;
			}
			
			if(count == 0) {
				res = i;
				count = 1;
			}
		}
		return arr[res];
	}

	// 1 1 1 1 4 4 5 5 5 5 5 5 6 7 7 7 7 7 7 7 7 9 9 9

	// Driver code
	public static void main (String[] args) {
		int arr[] = {40,50,30,30,30,10,100,1000,10000,20};
		int n = arr.length;
		int freq = maxFreq(arr , n);
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == freq) {
				count++;
			}
		}
		System.out.println("Element " + maxFreq(arr , n) + " occurs " + count + " times");
	}
	
}

// This code is contributed by shivanisinghss2110
