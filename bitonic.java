import java.util.*;

class bitonic {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean t = true;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = 2;
        int c;
        for (int i = 0; i < n; i++) {
            c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                }
                if (c > 2 * k) {
                    t = false;
                    break;
                }
            }
            if (!t) {
                break;
            }
        }
        if (t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
