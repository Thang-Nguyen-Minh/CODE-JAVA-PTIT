package ARRAYOBJECT;
import java.util.*;
import java.io.*;
public class SXTG {
    private long h,p,g;
    private long tong;
    SXTG(long h,long p,long g){
        this.h=h;
        this.p=p;
        this.g=g;
        tong=h*3600+p*60+g;
    }
    public String toString(){
        return h+" "+p+" "+g;
    }
    public long getTong(){
        return tong;
    }
//    public int compareTo(SXTG other) {
//        return Long.compare(this.tong, other.tong);
//    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        SXTG[] a=new SXTG[t];
        for(int i=0;i<t;i++){
            a[i]=new SXTG(sc.nextLong(),sc.nextLong(),sc.nextLong());
        }
        Arrays.sort(a, Comparator.comparingLong(SXTG::getTong));
        //Array.sort(Comparator.comparingKieudulieu(Class::tiêuchi);
        for(SXTG s:a){
            System.out.println(s);
        }
    }
}
