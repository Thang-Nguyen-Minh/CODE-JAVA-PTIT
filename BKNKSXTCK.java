package ARRAYOBJECT;

import java.util.*;

public class BKNKSXTCK {
    private String ma, ten;
    private long sl, gia, ck, tong;
    private double ptck;
    BKNKSXTCK(int ma, String ten, long sl, long gia) {
        this.ma = String.format("%02d", ma);
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        if (sl > 10) ptck = 0.05;
        else if (sl >= 8) ptck = 0.02;
        else if (sl >= 5) ptck = 0.01;
        else ptck = 0;
        ck = (long) (gia * sl * ptck);
        tong = gia * sl - ck;
    }
    public void chuanHoa(HashMap<String, Integer> mp) {
        String[] s = this.ten.split("\\s+");
        String a = Character.toUpperCase(s[0].charAt(0)) + "" + Character.toUpperCase(s[1].charAt(0));
        int count = mp.getOrDefault(a, 0) + 1;//tạo bắt đầu từ NV01
        mp.put(a, count);//thêm a và số lần xuất hiện của a trong map,giống insert trong C++
        this.ma = a + String.format("%02d", count);
    }
    public long getCk() {
        return ck;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + ck + " " + tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BKNKSXTCK> bk = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long gia = sc.nextLong();
            sc.nextLine();
            BKNKSXTCK x = new BKNKSXTCK(i + 1, ten, sl, gia);
            x.chuanHoa(mp);
            bk.add(x);
        }
        Collections.sort(bk,new Comparator<BKNKSXTCK>() {
            public int compare(BKNKSXTCK a1, BKNKSXTCK a2) {
                return Long.compare(a2.getCk(),a1.getCk());
            }
        });
        for(BKNKSXTCK x:bk){
            System.out.println(x);
        }
    }
}
