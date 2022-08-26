
import java.util.Scanner;

public class J02013_SapXepNoiBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        A:
        for (int i = 0; i < n - 1; i++) {
            boolean is_sorted = true;
            for (int j = 0; j < n - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    is_sorted = false;
                }

            }
            if (is_sorted) {
                break A;
            }

            System.out.print("Buoc " + ++cnt + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
}
