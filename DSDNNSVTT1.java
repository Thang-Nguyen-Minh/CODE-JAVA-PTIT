package ARRAYOBJECT;
import java.util.*;
public class DSDNNSVTT1 {
    private String ma,ten;
    private int sv;
    DSDNNSVTT1(String ma, String ten, int sv) {
        this.ma = ma;
        this.ten = ten;
        this.sv = sv;
    }
    public String getMa() {
        return ma;
    }
    public int getSv() {
        return sv;
    }
    public String toString(){
        return ma+" "+ten+" "+sv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<DSDNNSVTT1> hsvt = new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            DSDNNSVTT1 x=new DSDNNSVTT1(sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
            hsvt.add(x);
        }
        Collections.sort(hsvt, new Comparator<DSDNNSVTT1>() {
            public int compare(DSDNNSVTT1 a, DSDNNSVTT1 b) {
                if(a.getSv()==b.getSv()){
                    return a.getMa().compareTo(b.getMa());
                }
                return b.getSv()-a.getSv();
            }
        });
        for(DSDNNSVTT1 x:hsvt){
            System.out.println(x);
        }
    }
}
