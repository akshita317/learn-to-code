import java.util.*;
public class hash {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter array size");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element to find there count");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int hash[]=new int[13];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]+=1;
        }
        //taking number of querry and then returning there count
        int q=0;
        q=in.nextInt();
        while(q-->0)
        {
          int n1=in.nextInt();
          System.out.println(hash[arr[n1]]+" ");
        }
        
    }
}
