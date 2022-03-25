package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting
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

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n-1; j++) {
                int tmp = 0;
                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println("Displaying sorted array:"+arr[i]);
        }
    }
}
