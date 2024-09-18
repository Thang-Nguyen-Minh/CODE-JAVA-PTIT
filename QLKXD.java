package ARRAYOBJECT;
import java.util.*;
public class QLKXD {
    private String ma,hang;
    private long sl;
    private long gia,tong1,tong2,thue1;
    private double thue;
    QLKXD(String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
        String s=String.valueOf(ma.charAt(0));
        if(s.equals("X")){
            gia=128000;
            thue=0.03;
        }
        else if(s.equals("D")){
            gia=11200;
            thue=0.035;
        }
        else if(s.equals("N")){
            gia=9700;
            thue=0.02;
        }
        String s1=ma.substring(3);
        if(s1.equals("BP")) hang="British Petro";
        else if(s1.equals("ES")) hang="Esso";
        else if(s1.equals("SH")) hang="Shell";
        else if(s1.equals("CA")) hang="Castrol";
        else if (s1.equals("MO")) hang = "Mobil";
        else if (s1.equals("TN")) {  // Sản xuất trong nước, không tính thuế
            hang = "Trong Nuoc";
            thue = 0;
        }
        tong1=sl*gia;
        thue1= (long) (tong1*thue);
        tong2=tong1+thue1;
    }
    public long getTong2(){
        return tong2;
    }
    public String toString(){
        return ma+" "+hang+" "+gia+" "+thue1+" "+tong2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<QLKXD> a=new ArrayList<>();
        while (t-- > 0) {
            //Để là nextLine mà nhập trên 1 dòng thì nó sẽ đọc luôn cả thằng số lượng
            //=> Phải để là next => Chỉ đọc xâu đã nhập chứ k đọc cả dòng
            String ma = sc.next();
            long sl = sc.nextLong();
            QLKXD x = new QLKXD(ma, sl);
            a.add(x);
        }
        a.sort(Comparator.comparingLong(QLKXD::getTong2).reversed());
        for(QLKXD q:a){
            System.out.println(q);
        }
    }
}
