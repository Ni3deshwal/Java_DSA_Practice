package Array;
import java.util.*;

public class Reverse2pointer {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        arrreverse(n,arr);
        printarr(n,arr);
    }
    public static void arrreverse(int n, int arr[])
    {
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void printarr(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
       
    
    
}
