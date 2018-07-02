package fileVisitors.util;

public class VisitorHelper {

	/**
	 * @param str - word to be checked
	 * @return boolean - true if word is palindrome
	 */
	public boolean isPalindrome(String str) {
	    int n = str.length();
		if (n <= 3) {
			return false;
		}
		for (int i = 0; i < n/2; ++i) {
			if (str.charAt(i) != str.charAt(n-i-1)) {return false;}
		}
		return true;
	}

	/**
	 * @param word - word to be checked
	 * @return boolean - true if length is prime
	 */
	public boolean isLengthPrime(String word) {
		int len = word.length();
		
		if (len < 2) {return false;}
        
		boolean val = true;
        for(int i = 2; i <= len / 2; i++) {
        	if(len % i == 0) {val = false;}
        }
        return val;
	}
}

/**
 * isPalindrome() implementation source:
 * http://componentsprogramming.com/palindromes
 * isLengthPrime() implementation source:
 * https://www.programiz.com/java-programming/examples/prime-number
 */