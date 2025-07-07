import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = s.nextLine();
        int[] a = x.codePoints().toArray();  // Unicode-safe
        int i = 0, j = a.length - 1;
        int t;

        while (i < j) {
            t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }

        String r = new String(a, 0, a.length);
        System.out.println("Reversed string: " + r);
    }
}
