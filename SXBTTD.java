package ARRAYOBJECT;

import java.util.*;
import static java.lang.Math.*;
public class SXBTTD {
    private String ma,sd;
    private long cu,moi;
    private long hs,tt,pt,tong;
    SXBTTD(int ma,String sd,long cu,long moi){
        this.ma="KH"+String.format("%02d",ma);
        this.sd=sd;
        this.cu=cu;
        this.moi=moi;
        if(sd.equals("KD")) hs=3;
        else if(sd.equals("NN")) hs=5;
        else if(sd.equals("TT")) hs=4;
        else hs=2;
        long x=moi-cu;
        tt=x*hs*550;
        if(x<50) pt=0;
        else if(x<=100) pt=(long)ceil(tt*0.35);
        else pt=tt;
        tong=(long)pt+tt;
    }
    public String toString(){
        return ma+" "+hs+" "+tt+" "+pt+" "+tong;
    }
    public long getTong(){
        return tong;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<SXBTTD> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            SXBTTD a=new SXBTTD(i+1,sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            list.add(a);
        }
        Collections.sort(list,new Comparator<SXBTTD>() {
            public int compare(SXBTTD o1, SXBTTD o2) {
                return Long.compare(o2.getTong(),o1.getTong());
            }
        });
        for(SXBTTD a:list){
            System.out.println(a);
        }
    }
}
