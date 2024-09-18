package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class XHHS {
    private String ma,ten;
    private double diem;
    private String xl;
    private int xh;
    XHHS(int ma,String ten,double diem) {
        this.ma="HS"+String.format("%02d",ma);
        this.ten=ten;
        this.diem=diem;
        if(diem < 5) xl="Yeu";
        else if(diem < 7) xl="Trung Binh";
        else if(diem < 9) xl="Kha";
        else xl="Gioi";
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    public String getXl() {
        return xl;
    }

    public int getXh(){
        return xh;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<XHHS> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            a.add(new XHHS(i,sc.nextLine(),sc.nextDouble()));
            sc.nextLine();
        }
        a.sort(Comparator.comparingDouble(XHHS::getDiem).reversed());
        Map<Double,Integer> mp=new HashMap<>();
        int rank=1;
        for (int i = 0; i < a.size(); i++) {
            if (i > 0 && a.get(i).getDiem() < a.get(i - 1).getDiem()) {
                rank = i + 1;
            }
            a.get(i).setXh(rank);
        }
        a.sort(Comparator.comparing(XHHS::getMa));
        for(XHHS xh:a){
            System.out.println(xh.getMa()+" "+xh.getTen()+" "+String.format("%.1f",xh.getDiem())+" "+xh.getXl()+" "+xh.getXh());
        }
    }
}
