package ARRAYOBJECT;
import java.util.*;
public class LKNVTN {
    private String ma,ten,sh,bl,cv;
    LKNVTN(String ma,String ten){
        this.ma=ma;
        this.ten=ten;
        cv=ma.substring(0,2);
        sh=ma.substring(4);
        bl=ma.substring(2,4);
    }
    public String getCv() {
        return cv;
    }
    public int getBl(){
        return Integer.parseInt(bl);
    }
    public int getSh(){
        return Integer.parseInt(sh);
    }
    public String toString(){
        return ten+" "+cv+" "+sh+" "+bl;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        LKNVTN[] a=new LKNVTN[t];
        for(int i=0;i<t;i++){
            a[i]=new LKNVTN(sc.next(),sc.next());
            sc.nextLine();
        }
        ArrayList<LKNVTN> a1=new ArrayList<>();
        int k=sc.nextInt();
        while(k-->0){
            String s=sc.next();
            for(LKNVTN l:a){
                if(l.getCv().equals(s)){
                    a1.add(l);
                }
            }
        }
        Collections.sort(a1,new Comparator<LKNVTN>() {
            public int compare(LKNVTN l1, LKNVTN l2) {
                if(l1.getBl()==l2.getBl()){
                    return l1.getSh()-l2.getSh();
                }
                return l2.getBl()-l1.getBl();
            }
        });
        for(LKNVTN l:a1){
            System.out.println(l);
        }
    }
}
