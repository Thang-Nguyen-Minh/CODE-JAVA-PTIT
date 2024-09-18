package ARRAYOBJECT;
import java.util.*;
import java.io.*;
public class SXDSDTNV implements Comparable<SXDSDTNV>  {
    private String ma,ten,gt,ns,dc,mst,hd;
    SXDSDTNV(int ma, String ten, String gt, String ns,String dc, String mst, String hd) {
        this.ma = String.format("%05d",ma);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc=dc;
        this.mst=mst;
        this.hd=hd;
    }
    public String getNs() {
        return ns;
    }
    public int compareTo(SXDSDTNV o) {
        String[] a1 = this.ns.split("/");
        String[] a2 = o.getNs().split("/");
        if (a1[2].equals(a2[2])) {
            if (a1[1].equals(a2[1])) {
                return a1[0].compareTo(a2[0]);
            }
            return a1[1].compareTo(a2[1]);
        }
        return a1[2].compareTo(a2[2]);
    }
    public String toString(){
        return ma+" "+ten+" "+gt+" "+ns+" "+dc+" "+mst+" "+hd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SXDSDTNV> nv=new ArrayList<>();
        for(int i=1;i<=t;i++){
            SXDSDTNV a=new SXDSDTNV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            nv.add(a);
        }
        Collections.sort(nv);
        for(SXDSDTNV n:nv){
            System.out.println(n);
        }
    }
}
