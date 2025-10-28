package Collection_Interview_Questions;

public class NewInterview2 {
	//Reverse an Array
	static void Reverse(int arr[]) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6};
		Reverse(arr);
	
	}

}
