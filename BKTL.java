package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class BKTL {
    private String ma,ten,cv;
    private long ln,snc,lt,t,pc,tl;
    BKTL(long ma,String ten,long ln,long snc,String cv){
        this.ma="NV"+String.format("%02d",ma);
        this.ten=ten;
        this.ln=ln;
        this.snc=snc;
        this.cv=cv;
        lt=ln*snc;
        if(snc>=25) t= (long) (0.2*lt);
        else if(snc>=22) t= (long) (0.1*lt);
        else t=0;
        if(this.cv.equals("GD")) this.pc=250000;
        else if(this.cv.equals("PGD")) this.pc=200000;
        else if(this.cv.equals("TP")) this.pc=180000;
        else this.pc=150000;
        tl=lt+t+this.pc;
    }
    public long getTl(){
        return tl;
    }
    public String toString(){
        return ma+" "+ten+" "+lt+" "+t+" "+pc+" "+tl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<BKTL> a=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            long ln = sc.nextLong();
            long snc = sc.nextLong();
            sc.nextLine(); // Đọc bỏ dòng trống sau số lượng ngày công
            String cv = sc.nextLine();
            BKTL x = new BKTL(i, ten, ln, snc, cv);
            a.add(x);
        }
        Collections.sort(a, new Comparator<BKTL>() {
            public int compare(BKTL o1, BKTL o2) {
                return (int)(o2.getTl()-o1.getTl());
            }
        });
        //long sum=0;
        for(BKTL x:a){
            //sum+=x.getTl();
            System.out.println(x);
        }
        //System.out.println("Tong chi phi tien luong: "+sum);
    }
}
