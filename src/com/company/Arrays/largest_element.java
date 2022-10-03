/* I/P : arr[] = {10,5,20,8}
O/P : 2 //Index of 20
*/

package com.company.Arrays;

public class largest_element {
    public static int naive(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;
            }
        }
        return -1;
    }
    public static int eff(int[] arr){
        int n = arr.length;
        int larg = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[larg]){
                larg = i;
            }
        }
        return larg;
    }

    public static void main(String[] args) {
        int arr[] = {10,5,20,8};
        int res1 = naive(arr);
        System.out.println(res1);
        int res2 = eff(arr);
        System.out.println(res2);
    }
}