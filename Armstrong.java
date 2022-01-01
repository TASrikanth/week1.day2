package week1.day2;

public class Armstrong {
public static void main(String[] args) {
	int num = 153, orignum, rem, result = 0;
	orignum = num;
	while(orignum!=0)
	{
		rem = orignum % 10;
		result = result + (rem*rem*rem);
		orignum = orignum/10;
	}
	
	if (result == num)
	{
		System.out.println("Armstrong number: "+num);
	}
	else
	{
		System.out.println("Not an Armstrong number: "+num);
	}	
}
}
