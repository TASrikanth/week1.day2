package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNumb {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		/*for(int i=0;i<data.length; i++)
		{
		if(i==data.length-2)
		System.out.println(data[i]);*/
		
		int secondLargest = data.length-2;
		System.out.println(data[secondLargest]);
		
	}
}
