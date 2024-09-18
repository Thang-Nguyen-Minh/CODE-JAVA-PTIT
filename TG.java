package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class TG {
    private String ma,ten,vao,ra;
    private long tong;
    TG(String ma,String ten,String vao,String ra){
        this.ma=ma;
        this.ten=ten;
        this.vao=vao;
        this.ra=ra;
    }
    public static long giay(String s) {
        String[] a = s.split(":");
        int h=Integer.parseInt(a[0]);
        int p=Integer.parseInt(a[1]);
        return h*3600+p*60;
    }
    public static String ChuanHoa(long t) {
        long gio=t/3600;
        long phut=(t%3600)/60;
        return gio+" "+"gio"+" "+phut+" "+"phut";
    }
    public long getTong(){
        long a=giay(ra)-giay(vao);
        return this.tong=a;
    }
    public String getTong1() {
        return ChuanHoa(this.tong);
    }
    public String toString() {
        return ma+" "+ten+" "+getTong1();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        TG[] a=new TG[t];
        for(int i=0;i<t;i++){
            TG x=new TG(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a[i]=x;
        }
        Arrays.sort(a,Comparator.comparingLong(TG::getTong).reversed());
        for(TG x:a){
            System.out.println(x);
        }
    }
}
