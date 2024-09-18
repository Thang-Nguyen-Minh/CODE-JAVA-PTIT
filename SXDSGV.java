package ARRAYOBJECT;

import java.util.*;

public class SXDSGV {
    private String ma,ten,monhoc;
    SXDSGV(int ma, String ten, String monhoc) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.monhoc = monhoc;
        String[] a=monhoc.split("\\s+");
        String s1="";
        for(String x:a){
            if(!x.isEmpty()){
                s1+=String.valueOf(x.charAt(0)).toUpperCase();
            }
        }
        this.monhoc=s1;
    }
    public String Ten(){
        String[] a=ten.split("\\s+");
        return a[a.length-1];
    }
    public String toString(){
        return ma+" "+ten+" "+monhoc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<SXDSGV> list=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            SXDSGV x=new SXDSGV(i,sc.nextLine(),sc.nextLine());
            list.add(x);
        }
        Collections.sort(list, new Comparator<SXDSGV>() {
            public int compare(SXDSGV o1, SXDSGV o2) {
                return o1.Ten().compareTo(o2.Ten());
            }
        });
        for(SXDSGV x:list){
            System.out.println(x);
        }
    }
}
