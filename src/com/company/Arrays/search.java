package com.company.Arrays;

import java.util.Scanner;

public class search {
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {20, 5, 7, 25};
        int x = 5;
        int res = search(arr,x);
        System.out.println(res);

    }
}