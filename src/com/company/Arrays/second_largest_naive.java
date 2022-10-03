/* I/P : arr[] = {10,5,8,20}
O/P : 0 (Index of 10)
 */
// naive solution
package com.company.Arrays;

public class second_largest_naive {
    public static int larg(int[] arr){
        int n = arr.length;
        int larg = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[larg]){
                larg = i;
            }
        }
        return larg;
    }
    public static int naive(int[] arr){
        int second_larg = -1;
        int larg_index = larg(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] != arr[larg_index]){
                if(second_larg == -1){
                    second_larg = 0;
                }
                else if(arr[i] > arr[second_larg]){
                    second_larg = i;
                }
            }
        }
        return second_larg;
    }

    public static void main(String[] args) {
        int arr[] = {10,5,8,20};
        int res = naive(arr);
        System.out.println(res);
    }

}
