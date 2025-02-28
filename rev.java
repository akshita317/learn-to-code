import java.util.*;
class rev
{
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=in.nextLine();
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        System.out.println(st.toString());

    }
}
