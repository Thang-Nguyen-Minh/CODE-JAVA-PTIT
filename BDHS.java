package ARRAYOBJECT;
import java.util.*;
public class BDHS {
    private String ma;
    private String ten;
    private double a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    private double tb;
    private String xl;
    BDHS(int ma,String ten,double a1,double a2,double a3,double a4,double a5,double a6,double a7,double a8,double a9,double a10){
        this.ma="HS"+String.format("%02d",ma);
        this.ten=ten;
        this.a1=a1;this.a2=a2;
        this.a3=a3;this.a4=a4;
        this.a5=a5;this.a6=a6;
        this.a7=a7;this.a8=a8;
        this.a9=a9;this.a10=a10;
        this.tb=(this.a1*2+this.a2*2+this.a3+this.a4+this.a5+this.a6+this.a7+this.a8+this.a9+this.a10)/12;
        this.tb = Math.round(this.tb * 10.0) / 10.0;
        if(this.tb >= 9) this.xl="XUAT SAC";
        else if (this.tb>=8) this.xl="GIOI";
        else if(this.tb>=7) this.xl="KHA";
        else if(this.tb>=5) this.xl="TB";
        else this.xl="YEU";
        }
    public double getTb(){
        return tb;
    }

    public String getMa() {
        return ma;
    }
    public String toString(){
        return ma+" "+ten+" "+String.format("%.1f",tb)+" "+xl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<BDHS> list=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            BDHS x=new BDHS(i,sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            list.add(x);
        }
        Collections.sort(list, new Comparator<BDHS>() {
            public int compare(BDHS o1, BDHS o2) {
                if(o1.getTb()==o2.getTb()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                else return Double.compare(o2.getTb(),o1.getTb());
            }
        });
        for(BDHS x:list){
            System.out.println(x);
        }
    }
}
