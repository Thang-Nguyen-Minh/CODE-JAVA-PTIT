package ARRAYOBJECT;
import java.util.*;
public class TT {
    private String ma,ten;
    private long sl,gia,ck,s;
    TT(String ma,String ten,long mua,long gia,long ck) {
        this.ma=ma;
        this.ten=ten;
        this.sl=mua;
        this.gia=gia;
        this.ck=ck;
        s=sl*gia-ck;
    }
    public long getS(){
        return s;
    }
    public String toString(){
        return ma+" "+ten+" "+sl+" "+gia+" "+ck+" "+s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        TT[] a=new TT[t];
        for(int i=0;i<t;i++){
            a[i]=new TT(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
        }
        Arrays.sort(a,Comparator.comparing(TT::getS).reversed());
        for(TT x:a){
            System.out.println(x);
        }
    }
}
