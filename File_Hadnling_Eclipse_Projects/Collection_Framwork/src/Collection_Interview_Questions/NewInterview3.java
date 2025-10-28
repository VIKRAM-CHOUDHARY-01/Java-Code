package Collection_Interview_Questions;

public class NewInterview3 {
	static void pali(String s) {
		int left = 0;
		int right = s.length()-1;
		boolean check=true;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				check=false;
			}
			left++;
			right--;
		}
		
		if(check) {
			System.out.println("The Given String is Palindrome");
		}else {
			System.out.println("The given String is not Palindrome");
		}
	
	}
public static void main(String[] args) {
	//Check if given string is palindrome.
	pali("hello");
	
}
}
