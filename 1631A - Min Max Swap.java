import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int temp, max_a = 0, max_b = 0;

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {

                if (a[i] > b[i]) {
                    temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {

                max_a = Math.max(max_a, a[i]);
                max_b = Math.max(max_b, b[i]);

            }
            System.out.println(max_a * max_b);

        }
    }
}
