package ARRAYOBJECT;
import java.util.*;
public class DSTT2 {
    private int tt;
    private String ma,ten,lop,mail,dn;
    DSTT2(int tt,String ma,String ten,String lop,String mail,String dn){
        this.tt=tt;
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public String getMa() {
        return ma;
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
        ArrayList<DSTT2> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            DSTT2 x=new DSTT2(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        Collections.sort(a,new Comparator<DSTT2>() {
            public int compare(DSTT2 o1, DSTT2 o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            for(DSTT2 x:a){
                if(x.getDn().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
