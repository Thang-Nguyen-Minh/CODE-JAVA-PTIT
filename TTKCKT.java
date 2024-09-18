package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class TTKCKT {
    int ma;
    private String ten,ns;
    private double d1,d2,d3,tong;
    TTKCKT(int ma,String ten,String ns,double d1,double d2,double d3){
        this.ma=ma;
        this.ten=ten;
        this.ns=ns;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.tong=this.d1+this.d2+this.d3;
    }
    public double getTong(){
        return tong;
    }
    public int getMa(){
        return ma;
    }
    public String toString(){
        return ma+" "+ten+" "+ns+" "+tong;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<TTKCKT> list = new ArrayList<TTKCKT>();
        for(int i=1;i<=t;i++){
            TTKCKT x=new TTKCKT(i,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            list.add(x);
        }
        double a=Double.MIN_VALUE;
        for(TTKCKT x:list){
            a=max(a,x.getTong());
        }
        ArrayList<TTKCKT> x1=new ArrayList<>();
        for(TTKCKT x:list){
            if(x.getTong()==a){
                x1.add(x);
            }
        }
        Collections.sort(x1, new Comparator<TTKCKT>() {
            public int compare(TTKCKT o1, TTKCKT o2) {
                return o1.getMa()-o2.getMa();
            }
        });
        for(TTKCKT x:x1){
            System.out.println(x);
        }
    }
}
