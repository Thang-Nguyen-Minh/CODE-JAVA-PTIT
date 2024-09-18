package ARRAYOBJECT;
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class BTDNXH {
    private String ma;
    private long nhap;
    private long gia,xuat,tien,thue;
    public BTDNXH(String ma,long nhap) {
        this.ma = ma;
        this.nhap = nhap;
        String s1=String.valueOf(ma.charAt(0)).toUpperCase();
        String s2=String.valueOf(ma.charAt(ma.length()-1)).toUpperCase();
        if(s1.equals("A")) xuat=round(0.6*nhap);
        else xuat=round(0.7*nhap);
        if(s2.equals("Y")) gia=110000;
        else gia=135000;
        tien=xuat*gia;
        if(s1.equals("A") && s2.equals("Y")) thue= (long) (0.08*tien);
        else if(s1.equals("A") && s2.equals("N")) thue= (long) (0.11*tien);
        else if(s1.equals("B") && s2.equals("Y")) thue= (long) (0.17*tien);
        else thue= (long) (0.22*tien);
    }
    public String toString(){
        return ma+" "+nhap+" "+xuat+" "+gia+" "+tien+" "+thue;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<BTDNXH> a=new ArrayList<>();
        while(t-->0){
            BTDNXH b=new BTDNXH(sc.nextLine(),sc.nextLong());
            sc.nextLine();
            a.add(b);
        }
        for(BTDNXH b:a){
            System.out.println(b);
        }
    }
}
