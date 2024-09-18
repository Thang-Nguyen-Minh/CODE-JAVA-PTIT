package ARRAYOBJECT;
import java.util.*;

import static java.lang.Math.round;

public class NXH {
    private String ma,ten,xl;
    private long sln,dgn,slx,s1,s2;
    private double lai;
    NXH(String ma,String ten,String xl){
        this.ma=ma;
        this.ten=ten;
        this.xl=xl;
    }
    public void Nhap(long sln,long dgn,long slx) {
        this.sln=sln;
        this.dgn=dgn;
        this.slx=slx;
        if(xl.equals("A")) lai=0.08;
        else if(xl.equals("B")) lai=0.05;
        else lai=0.02;
        s1=sln*dgn;
        s2=(long)(dgn*slx+lai*dgn*slx);
    }
    public String toString() {
        return ma+" "+ten+" "+s1+" "+s2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<NXH> x=new ArrayList<>();
        Map<String,NXH> mp=new HashMap<>();
        while(t-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String xl=sc.nextLine();
            NXH nxh = new NXH(ma, ten, xl);
            mp.put(ma, nxh);
            x.add(nxh);
        }
        int p=Integer.parseInt(sc.nextLine());
        while(p-->0){
            String ma2=sc.next();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            sc.nextLine();
            NXH nxh=mp.get(ma2);
            nxh.Nhap(a,b,c);
        }
        for(NXH nxh:x){
            System.out.println(nxh);
        }
    }
}
