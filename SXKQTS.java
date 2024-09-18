package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class SXKQTS {
    private String ma,ten,tt;
    private double t,l,h,tong1,tong2,ut;
    SXKQTS(String ma,String ten,double t,double l,double h){
        this.ma=ma;
        this.ten=ten;
        this.t=t;
        this.l=l;
        this.h=h;
        tong1=t*2+l+h;
        String s=String.valueOf(ma.substring(0,3));
        if(s.equals("KV1")) ut=0.5;
        else if(s.equals("KV2")) ut=1;
        else ut=2.5;
        tong2=tong1+ut;
        if(tong2>=24) tt="TRUNG TUYEN";
        else tt="TRUOT";
    }
    public static String ChuanHoa(double a){
        if(a==(int)a){
            return String.valueOf((int)a);
        }
        else return String.valueOf(a);
    }

    public String getMa() {
        return ma;
    }

    public double getTong2() {
        return tong2;
    }

    public String toString(){
        return ma+" "+ten+" "+ChuanHoa(ut)+" "+ChuanHoa(tong2)+" "+tt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SXKQTS> bds=new ArrayList<>();
        while(t-->0){
            SXKQTS a=new SXKQTS(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            bds.add(a);
        }
        Collections.sort(bds,new Comparator<SXKQTS>() {
            public int compare(SXKQTS o1, SXKQTS o2) {
                if(o1.getTong2()==o2.getTong2()) return o1.getMa().compareTo(o2.getMa());
                return Double.compare(o2.getTong2(),o1.getTong2());
            }
        });
        for(SXKQTS b:bds){
            System.out.println(b);
        }
    }
}
