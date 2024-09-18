
package ARRAYOBJECT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSDTSV3 {
    private String ma;
    private String ten;
    private String lop;
    private String ns;
    private double gpa;
    DSDTSV3(int ma,String ten, String lop, String ns, double gpa) {
        this.ma="B20DCCN"+String.format("%03d",ma);
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void ChuanHoaNs(){
        StringBuilder s=new StringBuilder(this.ns);
        if(s.charAt(1)=='/') s.insert(0,'0');
        if(s.charAt(4)=='/') s.insert(3,'0');
        this.ns=s.toString();
    }
    public void ChuanHoaTen() {
        String[] v=this.ten.split("\\s+");
        String s="";
        for(String x:v){
            if(!x.isEmpty()){
                s+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase();
                s+=" ";
            }
        }
        this.ten=s.trim();
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return ma+" "+ten+" "+lop+" "+ns+" "+String.format("%.2f",gpa);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<DSDTSV3> list=new ArrayList<DSDTSV3>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            DSDTSV3 x=new DSDTSV3(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            x.ChuanHoaNs();
            x.ChuanHoaTen();
            list.add(x);
        }
        Collections.sort(list, new Comparator<DSDTSV3>() {
            public int compare(DSDTSV3 a, DSDTSV3 b) {
                if(a.getGpa()>b.getGpa()) return -1;
                return 1;
            }
        });
        for(DSDTSV3 x:list){
            System.out.println(x);
        }
    }
}


