package com.BasicRecursion;

public class Nine_CheckStringPalindrome {
	static boolean isPalindrome(String s, int index) {
		if (index >= s.length() / 2) {
			return true;
		}
		if (s.charAt(index) != s.charAt(s.length() - 1 - index)) {
			return false;
		}
		return isPalindrome(s, index + 1);
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("MADEM", 0));
	}
}

class Solution {
	public boolean isPalindrome(String s) {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = Character.toLowerCase(s.charAt(i));
			if (Character.isLetterOrDigit(c)) {
				ans.append(c);
			}
		}

		String filtered = ans.toString();

		if (filtered.isEmpty()) {
			return true;
		}

		int left = 0, right = filtered.length() - 1;
		while (left < right) {
			if (filtered.charAt(left) != filtered.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
