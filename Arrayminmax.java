package com.company;

import java.util.Scanner;

public class Arrayminmax 
{
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in an array");
        int n = sc.nextInt();
        
        System.out.println("Enter elements in the array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) 
        {
          arr[i] = sc.nextInt();
        }
        
        int minimum = arr[0];
        int maximum = arr[0];
        for(int i=0; i<n; i++) 
        {
            if(minimum > arr[i])
                minimum = arr[i];
            if(maximum < arr[i])
                maximum = arr[i];
        }
        
        System.out.println("Minimum value in an array is:" + minimum);
        System.out.println("Maximum value in an array is:" + maximum);
    }

}
