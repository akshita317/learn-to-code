//question in okta
 class countodd {
    public static void main(String arg[])
    {
        
        int arr[]={10,1002,10,0,54,76};
        int d=0,c=0,c1=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
           c++;
           while(arr[i]>0)
           {
            d=arr[i]%10;
            if(d==0)
            {
                c++;
            }
            arr[i]=arr[i]/10;
           }
           if(c%2!=0)
           {
            c1++;
           }
           c=0;
    }
      System.out.print(c1);
}
 }
