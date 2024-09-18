package ARRAYOBJECT;
import java.util.*;
public class TTGB {
    private String ma;
    private long gia,sl;
    private double thue,vc,tong;
    TTGB(String ma, long gia, long sl) {
        this.ma = ma;
        this.gia = gia;
        this.sl = sl;
        String s= String.valueOf(ma.charAt(0));
        String s1= String.valueOf(ma.charAt(ma.length()-1));
        if(s.equals("T")){
            thue=0.29;
            vc=0.04;
        }
        else if(s.equals("C")){
            thue=0.1;
            vc=0.03;
        }
        else if(s.equals("D")){
            thue=0.08;
            vc=0.025;
        }
        if(s1.equals("C")) thue=thue-0.05;
        else thue=thue;
        double th=gia*sl*(1+thue+vc);
        tong=th*1.2/sl;
    }
    public String toString() {
        return ma+" "+String.format("%.2f",tong);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        TTGB[] a=new TTGB[t];
        for(int i=0;i<t;i++){
            a[i]=new TTGB(sc.next(),sc.nextLong(),sc.nextLong());
        }
        for(TTGB b:a){
            System.out.println(b);
        }
    }
}
