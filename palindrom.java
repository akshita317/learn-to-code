import java.util.*;
 class palindrom 
 {
    public static void main(String arg[])
    {
        Scanner in =new Scanner(System.in);
        int n,rev=0,x,ld;
        System.out.println("enter no");
        n=in.nextInt();
        x=n;
        while(n!=0)
        {
             ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
           
        }
        if(rev==x)
           {
            System.out.println("palindrom");
           }
           else
           {
            System.out.println("not palindrome");
           }


    }
    
}
