package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class DSDTNV {
    private String ma;
    private String ten;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String hd;
    DSDTNV(int ma, String ten, String gt, String ns, String dc, String mst, String hd) {
        this.ma = String.format("%05d", ma);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }
    public String toString(){
        return ma+" "+ten+" "+gt+" "+ns+" "+dc+" "+mst+" "+hd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DSDTNV> x=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            DSDTNV nv=new DSDTNV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            x.add(nv);
        }
        for(DSDTNV nv:x){
            System.out.println(nv);
        }
    }
}
