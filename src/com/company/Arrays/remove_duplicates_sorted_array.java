/* I/P arr[]= {10,20,20,30,30,30,30} size = 7
O/P : arr[] = {10,20,30} size=3
 */

package com.company.Arrays;

public class remove_duplicates_sorted_array {
    public static int naive(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if(temp[count-1] != arr[i-1]){
                temp[count] = arr[i];
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i] = temp[i];
        }
        return count;
    }

    public static int eff(int[] arr){
        int n= arr.length;
        int count =1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[count-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]= {10,20,20,30,30,30,30};
        int res1 = naive(arr);
        for(int i=0;i<res1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int res2 = eff(arr);
        for(int i=0;i<res2;i++){
            System.out.print(arr[i] + " ");
        }
    }


}