public class UnionArray {
    static void UnionOfArray(int arr[], int arr2[]) {
        int t = arr.length + arr2.length;
        int ans[] = new int[t];
        int count = 0;

        // Copy all elements of arr[] to ans[]
        for (int i = 0; i < arr.length; i++) {
            ans[count++] = arr[i];
        }

        // For each element in arr2[], check if it's already in ans[]
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (ans[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            // If not found, add to ans[]
            if (!found) {
                ans[count++] = arr2[i];
            }
        }

        // Print the result
        System.out.print("Union of arrays: ");
        for (int i = 0; i < count; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr2[] = {2, 1, 6, 5};
        UnionOfArray(arr, arr2);
    }
}
