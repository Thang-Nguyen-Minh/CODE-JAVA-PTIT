package ARRAYOBJECT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BDTP1 {
    private int tt;
    private String ma,ten,lop;
    private double d1,d2,d3;
    BDTP1(String ma,String ten,String lop,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    public String getMa() {
        return ma;
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+d1+" "+d2+" "+d3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<BDTP1> list=new ArrayList<BDTP1>();
        while (t-->0){
            BDTP1 x=new BDTP1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            list.add(x);
        }
        Collections.sort(list,new Comparator<BDTP1>() {
            public int compare(BDTP1 a,BDTP1 b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(int i=0;i< list.size();i++){
            BDTP1 x=list.get(i);
            System.out.println(i+1+" "+x);
        }
    }
}
