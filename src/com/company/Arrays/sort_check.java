/* I/P : arr[] = {8,12,15}  yes
arr[] ={100,20,200} no
 */

package com.company.Arrays;

public class sort_check {
    public static boolean naive(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean eff(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {5,12,30,2,35};
        boolean res1 = naive(arr);
        if(res1 == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        boolean res2 = eff(arr);
        if(res2 == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}