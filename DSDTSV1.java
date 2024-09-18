package ARRAYOBJECT;

import java.util.ArrayList;
import java.util.Scanner;

public class DSDTSV1 {
    private String ma;
    private String ten;
    private String lop;
    private String ns;
    private double gpa;
    DSDTSV1(int ma,String ten, String lop, String ns, double gpa) {
        this.ma="B20DCCN"+String.format("%03d",ma);
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void ChuanHoa(){
        StringBuilder s=new StringBuilder(this.ns);
        if(s.charAt(1)=='/') s.insert(0,'0');
        if(s.charAt(4)=='/') s.insert(3,'0');
        this.ns=s.toString();
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+ns+" "+String.format("%.2f",gpa);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<DSDTSV1> list=new ArrayList<DSDTSV1>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            DSDTSV1 x=new DSDTSV1(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            x.ChuanHoa();
            list.add(x);
        }
        for(DSDTSV1 x:list){
            System.out.println(x);
        }
    }
}
