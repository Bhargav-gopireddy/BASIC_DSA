/* I/P : arr[] = {10,5,7,30}
O/P : arr[] = {30,7,5,10}
 */

package com.company.Arrays;

public class Reverse {
    public static void reverse(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int temp;
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int []arr = {10,5,7,30};
        int n = arr.length;
        System.out.println("Array Before reverse");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        reverse(arr);
        System.out.println("Array After reverse");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
