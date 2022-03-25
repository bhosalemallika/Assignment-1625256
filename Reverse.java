package com.company;

import java.util.*;

public class Reverse 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        
        System.out.println("Enter elements in the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int reversearr[] = new int[n];
        System.out.println("Reverse Array is:");
        for(int i = arr.length-1, j=0; i>=0; i--, j++) 
        {
            reversearr[j] = arr[i];
            System.out.println(reversearr[j]);

        }
    }
}
