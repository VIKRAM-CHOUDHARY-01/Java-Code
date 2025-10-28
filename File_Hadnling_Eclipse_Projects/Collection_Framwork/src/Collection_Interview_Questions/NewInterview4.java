package Collection_Interview_Questions;

public class NewInterview4 {
	static void Anagram(String s1, String s2) {
		boolean check = false;
		if(s1.length()==s2.length()) {
			for(int i = 0;i<s1.length();i++) {
			
				for(int j =0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						check = true;
						break;
					}
				}
				if(!check) {
					System.out.println("Given String is not Anagram");
				}
			}
			if(check) {
				System.out.println("Given String is Anagram");
			}
			
		}else {
			System.out.println("Given String is not Anagram");
		}
	}
public static void main(String[] args) {
	///Anagram Check in String
	
	Anagram("naam", "maan");
	
	
}
}
