//consecutive element find missing one
import java.util.*;
public class conse {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int sum=0,expsum=0,mis=0;
        System.out.println("enter size");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            sum+=arr[i];
        }
        expsum=(n*(n+1))/2;
        mis=expsum-sum;
        System.out.println(mis);
    }
}
