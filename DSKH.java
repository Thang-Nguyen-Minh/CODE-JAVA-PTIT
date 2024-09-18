package ARRAYOBJECT;
import java.util.*;
public class DSKH {
    private String ma,ten,gt,ns,dc;
    DSKH(int ma,String ten,String gt,String ns,String dc){
        this.ma="KH"+String.format("%03d",ma);
        this.ten=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
    }
    public String getNs() {
        return ns;
    }
    public static String ChuanHoaTen(String s){
        String[] a=s.split("\\s+");
        String kq="";
        for(String x:a){
            if(!x.isEmpty()){
                kq+=String.valueOf(x.substring(0,1).toUpperCase())+String.valueOf(x.substring(1)).toLowerCase()+" ";
            }
        }
        return kq.trim();
    }
    public static String ChuanHoaNs(String s){
        StringBuilder x=new StringBuilder(s);
        if(x.charAt(1)=='/') x.insert(0,'0');
        if(x.charAt(4)=='/') x.insert(3,'0');
        return x.toString();
    }
    public String toString(){
        return ma+" "+ten+" "+gt+" "+dc+" "+ns;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<DSKH> ds=new ArrayList<>();
        for(int i=0;i<t;i++){
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            ds.add(new DSKH(i+1,ChuanHoaTen(ten),gt,ChuanHoaNs(ns),dc));
        }
        Collections.sort(ds, new Comparator<DSKH>() {
            @Override
            public int compare(DSKH o1, DSKH o2) {
                String[] a1=o1.getNs().split("/");
                String[] a2=o2.getNs().split("/");
                if(a1[2].equals(a2[2])){
                    if(a1[1].equals(a2[1])){
                        return a1[0].compareTo(a2[0]);
                    }
                    return a1[1].compareTo(a2[1]);
                }
                return a1[2].compareTo(a2[2]);
            }
        });
        for(DSKH dskh:ds){
            System.out.println(dskh);
        }
    }
}
