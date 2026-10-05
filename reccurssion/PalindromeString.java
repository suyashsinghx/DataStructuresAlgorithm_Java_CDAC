package reccurssion;

public class PalindromeString {

	public static boolean isPalindrome(String s, int st, int end) {
		
//		base case
		if(st > end) return true;
		
//		ek case mera
		if(s.charAt(st) != s.charAt(end)) return false;
			
//		baki reccursion tera
		return isPalindrome(s, st+1, end-1);
	}
	
	public static void main(String[] args) {
		String str = "MOMOM";
		
		System.out.println(isPalindrome(str, 0, str.length()-1));
	}
	
}
