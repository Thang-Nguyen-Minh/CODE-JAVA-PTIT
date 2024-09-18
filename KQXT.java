package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class KQXT {
    private String ma,ten,ns,xh;
    private double lt,th,thuong;
    private int tuoi,tong;
    KQXT(int ma,String ten,String ns,double lt,double th){
        this.ma="PH"+String.format("%02d",ma);
        this.ten=ten;
        this.ns=ns;
        this.lt=lt;
        this.th=th;
        String[] a=ns.split("/");
        tuoi=2021-Integer.parseInt(a[2]);
        // Tính điểm thưởng
        if (lt >= 8 && th >= 8) {
            thuong = 1;
        } else if (lt >= 7.5 && th >= 7.5) {
            thuong = 0.5;
        } else {
            thuong = 0;
        }
        // Tính điểm tổng
        tong = (int) round((lt + th) / 2 + thuong);
        if (tong > 10) tong = 10;
        else tong=tong;
        // Xếp loại
        if (tong < 5) xh = "Truot";
        else if (tong <= 6) xh = "Trung Binh";
        else if (tong <= 7) xh = "Kha";
        else if (tong <= 8) xh = "Gioi";
        else xh = "Xuat sac";
    }
    public String toString(){
        return ma+" "+ten+" "+tuoi+" "+tong+" "+xh;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KQXT> kq=new ArrayList<>();
        for(int i=0;i<t;i++){
            KQXT x=new KQXT(i+1,sc.nextLine(),sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            kq.add(x);
        }
        for(KQXT x:kq){
            System.out.println(x);
        }
    }
}
