package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class TTNCNV {
    private String ma,ten,cv;
    private long ln,snc,lt,tu,pc,cl,tn;
    TTNCNV(long ma,String ten,String cv,long ln,long snc){
        this.ma="NV"+String.format("%02d",ma);
        this.ten=ten;
        this.cv=cv;
        this.ln=ln;
        this.snc=snc;
        lt=ln*snc;
        if(this.cv.equals("GD")) pc=500;
        else if(this.cv.equals("PGD")) pc=400;
        else if(this.cv.equals("TP")) pc=300;
        else if(this.cv.equals("KT")) pc=250;
        else pc=100;
        //2.0/3= 0.6667 : Giá trị chính xác
        long x=(long)((pc+lt)*(2.0/3));
        //round để làm tròn giá trị Phụ cấp + Lương * 2/3 đến hàng ngàn, vì bạn cần kết quả gần nhất
        //round : 0.5=> lên, <0.5 : xuống
        //ceil : Luôn làm tròn lên
        if(x < 25000) tu=(long)round(x/1000.0)*1000;
        else tu=25000;
        cl=lt-tu+pc;
        tn=lt+pc;
    }
    public String getCv(){
        return cv;
    }
    public long getTn(){
        return tn;
    }
    public String toString(){
        return ma+" "+ten+" "+pc+" "+lt+" "+tu+" "+cl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<TTNCNV> a=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            TTNCNV x = new TTNCNV(i,sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            a.add(x);
        }
        Collections.sort(a,new Comparator<TTNCNV>() {
            public int compare(TTNCNV o1, TTNCNV o2) {
                return (int)(o2.getTn()-o1.getTn());
            }
        });
        //String n=sc.nextLine();
        for(TTNCNV x:a){
            //if(x.getCv().equals(n)){
                System.out.println(x);
            }
        }
    }
