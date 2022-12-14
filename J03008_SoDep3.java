
import java.util.Scanner;

public class J03008_SoDep3 {

    public static boolean doiXung(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkNguyenTo(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            if (doiXung(s) && checkNguyenTo(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
