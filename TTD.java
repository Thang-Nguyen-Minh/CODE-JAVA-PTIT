package ARRAYOBJECT;

import java.util.*;
import static java.lang.Math.*;
public class TTD {
    private String ma,sd;
    private long cu,moi;
    private long hs,tt,pt,tong;
    TTD(int ma,String sd,long cu,long moi){
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<TTD> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            TTD a=new TTD(i+1,sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            list.add(a);
        }
        for(TTD a:list){
            System.out.println(a);
        }
    }
}
