import java.util.*;
public class fac {
    public static void main(String arg[])
{
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int res=1;
    for(int i=2;i<=n;i++)
    {
        res=res*i;
    }
    System.out.println(res);
}
}
