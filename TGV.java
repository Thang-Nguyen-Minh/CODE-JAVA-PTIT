package ARRAYOBJECT;
import java.util.*;
public class TGV {
    private String ma,ten,maxt,kq,mon;
    private double d1,d2,tb;
    TGV(int ma,String ten,String maxt,double d1,double d2){
        this.ma="GV"+String.format("%02d",ma);
        this.ten=ten;
        this.maxt=maxt;
        this.d1=d1;
        this.d2=d2;
        String s=String.valueOf(maxt.substring(0,1));
        if(s.equals("A")) mon="TOAN";
        else if(s.equals("B")) mon="LY";
        else mon="HOA";
        int x=Integer.parseInt(maxt.substring(1));
        tb=d1*2+d2;
        if(x==1) tb=tb+2;
        else if(x==2) tb=tb+1.5;
        else if(x==3) tb=tb+1;
        else tb=tb;
        if(tb>=18) kq="TRUNG TUYEN";
        else kq="LOAI";
    }
    public double getTb(){
        return tb;
    }
    public String toString(){
        return ma+" "+ten+" "+mon+" "+String.format("%.1f",tb)+" "+kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        TGV[] a=new TGV[t];
        for(int i=0;i<t;i++){
            a[i]=new TGV(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(a,Comparator.comparingDouble(TGV::getTb).reversed());
        for(TGV x:a) System.out.println(x);
    }
}
