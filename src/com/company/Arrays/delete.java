package com.company.Arrays;

import java.util.Scanner;

public class delete {
    public static int delete(int[] arr,int x){
        int n = arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i == n){
            return -1;
        }
        for(int j=i;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before deletion");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int res = delete(arr,x);
        System.out.println("Array After deletion");
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}