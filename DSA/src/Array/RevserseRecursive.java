import java.util.*;;

public class RevserseRecursive {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int start = 0;
        int end = n - 1;
        arrreverse(n, arr, start, end);
        printarr(n,arr);

    }

    public static void arrreverse(int n, int arr[], int start, int end) {
        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        arrreverse(n, arr, start + 1, end - 1);
    }
    public static void printarr(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
