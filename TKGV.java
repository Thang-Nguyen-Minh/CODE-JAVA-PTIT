package ARRAYOBJECT;
import java.util.*;
public class TKGV {
    private String ma,ten,mon;
    TKGV(int ma,String ten, String mon) {
        this.ma="GV"+String.format("%02d",ma);
        this.ten = ten;
        this.mon = mon;
        String[] a=this.mon.split("\\s+");
        String s="";
        for(String x:a){
            if(!x.isEmpty()){
                s+=String.valueOf(x.charAt(0)).toUpperCase();
            }
        }
        this.mon=s;
    }
    public String getTen() {
        return ten.toLowerCase();
    }
    public String toString() {
        return ma+" "+ten+" "+mon;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<TKGV> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            TKGV x=new TKGV(i,sc.nextLine(),sc.nextLine());
            list.add(x);
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String x=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+x+": ");
            String s=x.toLowerCase();
            for(TKGV x1:list){
                if(x1.getTen().contains(s)){
                    System.out.println(x1);
                }
            }
        }
    }
}
