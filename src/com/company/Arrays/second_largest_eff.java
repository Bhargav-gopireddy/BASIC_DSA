/* I/P : arr[] = {10,5,8,20}
O/P : 0 (Index of 10)
 */

package com.company.Arrays;

public class second_largest_eff {
    public static int eff(int[] arr){
        int second_larg = -1;
        int larg = 0;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[larg]){
                second_larg = larg;
                larg = i;
            }
            else if((arr[i] != arr[larg])){
                if(second_larg == -1 || arr[i] > arr[second_larg]){
                    second_larg = i;
                }
            }
        }
        return second_larg;
    }

    public static void main(String[] args) {
        int arr[] = {5,20,12,20,10};
        int res = eff(arr);
        System.out.println(res);
    }
}