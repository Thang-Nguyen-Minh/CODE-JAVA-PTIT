package ARRAYOBJECT;
import java.util.*;
public class DSGVTBM {
    private String ma,ten,mon;
    DSGVTBM(int ma,String ten, String mon) {
        this.ma="GV"+String.format("%02d",ma);
        this.ten = ten;
        this.mon = mon;
    }
    public static String ChuanHoa(String s1){
        String[] a=s1.split("\\s+");
        String s= "";
        for(String x:a){
            if(!x.isEmpty()){
                s+=String.valueOf(x.charAt(0)).toUpperCase();
            }
        }
        return s;
    }
    public String getMon() {
        return mon;
    }
    public String toString() {
        return ma+" "+ten+" "+ChuanHoa(mon);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<DSGVTBM> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            DSGVTBM x=new DSGVTBM(i,sc.nextLine(),sc.nextLine());
            list.add(x);
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String x=sc.nextLine();
            String s=ChuanHoa(x);
            System.out.println("DANH SACH GIANG VIEN BO MON "+s+": ");
            for(DSGVTBM x1:list){
                if(ChuanHoa(x1.getMon()).contains(s)){
                    System.out.println(x1);
                }
            }
        }
    }
}
