package ARRAYOBJECT;

import java.util.*;

public class SXDSMH {
    private int ma;
    private String ten;
    private String nhom;
    private double mua;
    private double ban;
    private double ln;

    SXDSMH(int ma, String ten, String nhom, double mua, double ban) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.ln = this.ban - this.mua;
    }

    public double getLn() {
        return ln;
    }

    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", ln);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Use int instead of double
        ArrayList<SXDSMH> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            SXDSMH x = new SXDSMH(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();  // Consume the remaining newline
            list.add(x);
        }
        Collections.sort(list, new Comparator<SXDSMH>() {
            public int compare(SXDSMH o1, SXDSMH o2) {
                return Double.compare(o2.getLn(), o1.getLn());  // Use Double.compare() for proper comparison
            }
        });
        for (SXDSMH x : list) {
            System.out.println(x);
        }
    }
}
