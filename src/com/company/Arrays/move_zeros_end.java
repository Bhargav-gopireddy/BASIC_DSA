/* I/P: arr[] = {8,5,0,10,0,20}
O/P: arr[] = {8,5,10,20,0,0} */

package com.company.Arrays;

public class move_zeros_end {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void naive(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                for(int j=i+1;j<n;j++){
                    if(arr[j] != 0){
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }
    }

    public static void eff(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                swap(arr, i, count);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,5,0,10,0,20};
        naive(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr1[] = {8,5,0,10,0,20};
        eff(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
