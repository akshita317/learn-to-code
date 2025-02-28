import java.util.*;
public class pal {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no.:");
        int n=in.nextInt();
        int rev=0;
        
        int temp=n;
        while(temp!=0)
        {
            int ld=temp%10;
             rev =rev*10+ld;
             temp=temp/10;
        }
        if(rev==n)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
