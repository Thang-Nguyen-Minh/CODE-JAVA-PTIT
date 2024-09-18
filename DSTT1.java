package ARRAYOBJECT;
import java.util.*;
public class DSTT1 {
    private int tt;
    private String ma,ten,lop,mail,dn;
    DSTT1(int tt,String ma,String ten,String lop,String mail,String dn){
        this.tt=tt;
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public String getTen() {
        return ten;
    }
    public String getDn(){
        return dn;
    }
    public String toString(){
        return tt+" "+ma+" "+ten+" "+lop+" "+mail+" "+dn;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<DSTT1> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            DSTT1 x=new DSTT1(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        Collections.sort(a,new Comparator<DSTT1>() {
            public int compare(DSTT1 o1, DSTT1 o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            for(DSTT1 x:a){
                if(x.getDn().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
