package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		int num=34343,reversedNum=0, remainder;
	    // store the number to originalNum
	    int originalNum = num;
	    // get the reverse of originalNum
	    // store it in variable
	    for (;num!=0;num=num/10) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;  
	    }
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println("Palindrome number: "+originalNum);
	    }
	    else {
	      System.out.println("Not a Palindrome number: "+originalNum);
	    }
	}

}
