import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author QuanNM
 */
public class J03005_ChuanHoaXauHoTen2 {

    public static String chuanHoa(String s) {
        String[] a = s.split("\\s+");
        String tmp = "";
        for (int i = 0; i < a.length; i++) {

            if (!a[i].equals("")) {

                tmp += Character.toUpperCase(a[i].charAt(0));
                for (int j = 1; j < a[i].length(); j++) {
                    tmp += Character.toLowerCase(a[i].charAt(j));
                }
                tmp += " ";
            }
        }
        String[] b = tmp.split("\\s+");
        String res = "";
        for (int i = 1; i < b.length; i++) {
            if (i < b.length - 1) {
                res += b[i] + " ";
            } else {
                res += b[i];
            }
        }
        return res += ", " + b[0].toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {

            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }

    }
}