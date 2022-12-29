package String;
import java.util.*;
public class ReverseStringSwap {
    public static void main(String args[])
    {
        char[] s={'h','e','l','l','o'};
        swaparr(s);
    }
    public static void swaparr(char [] s)
    {
        int start=0;
        int end=s.length-1;
        while(start<end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" ");
        }
    }
    
}
