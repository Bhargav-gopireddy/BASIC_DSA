/* I/P: arr[] = {1,2,3,4,5} d=2
O/P: arr[]  = {3,4,5,1,2}
 */

package com.company.Arrays;

public class left_rotate_by_d {
    public static void left_rotate_by_one(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void naive(int[]arr,int d){
        for(int i=0;i<d;i++){
            left_rotate_by_one(arr);
        }
    }
    public static void better(int[] arr,int d){
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        int n =arr.length;
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }
    }

    public static void reverse(int[] arr, int low, int high){
        int temp;
        while(low < high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void eff(int[] arr, int d){
        int n = arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int d=2;
        naive(arr, d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        better(arr1, d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        eff(arr2, d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

}