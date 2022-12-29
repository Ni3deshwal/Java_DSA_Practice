package Array;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        arrreverse(n,arr);
    }
    public static void arrreverse(int n, int arr[])
    {
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
