/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

        The overall run time complexity should be O(log (m+n)).

        

        Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.
        Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        

        Constraints:

        nums1.length == m
        nums2.length == n
        0 <= m <= 1000
        0 <= n <= 1000
        1 <= m + n <= 2000
        -106 <= nums1[i], nums2[i] <= 106*/

            class Solution {
                public static int[] swap(int[] a, int left, int right){
                    a[left] = a[left] ^ a[right];
                    a[right] = a[left]^ a[right];
                    a[left] = a[left] ^ a[right];
                    return a;

                }
                public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                    double median;
                    int count=0;
                    int []mergedArray = new int [nums1.length + nums2.length];
                    for(int i = 0;i<mergedArray.length;i++){
                        if(i<nums1.length){
                            mergedArray[i] = nums1[i];
                        }
                        else{
                            mergedArray[i] = nums2[count];
                            count++;
                        }
                    }
                    int left = 0;
                    int right = mergedArray.length-1;
                    boolean swapped;
                    do {
                        swapped = false;
                        for (int i = left; i < right; i++) {
                            if (mergedArray[i] > mergedArray[i + 1]) {
                                // Swap if elements are in the wrong order
                                mergedArray = swap(mergedArray, i, i + 1);
                                swapped = true;
                            }
                        }
                        right--;  
                    } while (swapped); 

                    if(mergedArray.length%2==0){
                        median = (mergedArray[(mergedArray.length/2)-1] + mergedArray[(mergedArray.length/2)])/2d;
                        return median;
                    }else{
                        median = mergedArray[((mergedArray.length +1)/2)-1];
                        return median;
                    }
                
                }
            }