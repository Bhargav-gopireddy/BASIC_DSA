/* I/P: arr[] = {1,2,3,4,5}
O/P: arr[] = {2,3,4,5}
 */

package com.company.Arrays;

public class left_rotate_by_one {
    public static void left_rotate_by_one(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        left_rotate_by_one(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}