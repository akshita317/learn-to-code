import java.util.*;
public class c {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=0;
        while(n>0)
        {
            n=n/10;
            r++;
            
        }
        System.out.println("Number of digit are:"+r);
    }
    

    
}
