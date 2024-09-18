package ARRAYOBJECT;
import java.util.*;
public class TD {
    private String ma,ten,xl;
    private double lt,th,tb;
    TD(int ma,String ten,double lt,double th){
        this.ma="TS"+String.format("%02d",ma);
        this.ten=ten;
        this.lt=lt;
        this.th=th;
        if(lt>10) lt/=10;
        if(th>10) th/=10;
        tb=(lt+th)/2;
        if(tb<5) xl="TRUOT";
        else if(tb<8) xl="CAN NHAC";
        else if(tb<=9.5) xl="DAT";
        else xl="XUAT SAC";
    }
    public double getTb(){
        return tb;
    }
    public String toString(){
        return ma+" "+ten+" "+String.format("%.2f",tb)+" "+xl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        TD[] td = new TD[t];
        for(int i=0;i<t;i++){
            td[i]=new TD(i+1,sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(td,Comparator.comparingDouble(TD::getTb).reversed());
        for(TD x:td){
            System.out.println(x);
        }
    }
}
