package ARRAYOBJECT;
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class TGB2 {
    private String ma,ten,dv;
    private long nhap,soluong,vc,tt,banle;
    TGB2(int ma,String ten, String dv, long nhap, long soluong) {
        this.ma="MH"+String.format("%02d",ma);
        this.ten = ten;
        this.dv = dv;
        this.nhap = nhap;
        this.soluong = soluong;
        double x=this.nhap*this.soluong;
        this.vc=round(x*0.05);
        this.tt=round(x+this.vc);
        double giaBanLe = (this.tt * 1.02) / soluong;
        this.banle = (long) (ceil(giaBanLe / 100) * 100);
    }
    public long getBanle() {
        return banle;
    }
    public String toString(){
        return ma+" "+ten+" "+dv+" "+vc+" "+tt+" "+banle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<TGB2> a=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            TGB2 x=new TGB2(i,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            a.add(x);
        }
        Collections.sort(a, new Comparator<TGB2>() {
            public int compare(TGB2 o1, TGB2 o2) {
                return (int) (o2.getBanle()-o1.getBanle());
            }
        });
        for(TGB2 x:a){
            System.out.println(x);
        }
    }
}
