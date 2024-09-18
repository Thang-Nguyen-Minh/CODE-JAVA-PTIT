package ARRAYOBJECT;
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class TGB1 {
    private String ma,ten,dv;
    private long nhap,soluong,vc,tt,ban;
    TGB1(int ma,String ten, String dv, long nhap, long soluong) {
        this.ma="MH"+String.format("%02d",ma);
        this.ten = ten;
        this.dv = dv;
        this.nhap = nhap;
        this.soluong = soluong;
        double x=this.nhap*this.soluong;
        this.vc=round(x*0.05);
        this.tt=round(x+this.vc);
        this.ban= round(this.tt*1.02);
    }
    public String toString(){
        return ma+" "+ten+" "+dv+" "+vc+" "+tt+" "+ban;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<TGB1> a=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            TGB1 x=new TGB1(i,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            a.add(x);
        }
        for(TGB1 x:a){
            System.out.println(x);
        }
    }
}
