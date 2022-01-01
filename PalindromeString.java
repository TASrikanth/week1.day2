package week1.day2;

public class PalindromeString {
	public static void main(String[] args) {
		String String1="madam";
		//String1 hardcoded
		String rev="";
		for(int i=String1.length()-1;i>=0;i--) {
			rev=rev+String1.charAt(i);
			}
		if(String1.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrome: "+String1);
		}
		else {
			System.out.println("String is not a Palindrome"+String1);
			 }
		}
}
