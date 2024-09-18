package ARRAYOBJECT;
import java.util.*;
public class DSMH {
    private String ma;
    private String ten;
    private String dv;
    private int mua;
    private int ban;
    private int ln;
    public DSMH(int ma, String ten, String dv, int mua, int ban) {
        this.ma = "MH" + String.format("%03d",ma);
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
        this.ln = this.ban-this.mua;
    }
    public int getLn() {
        return ln;
    }
    public String getMa() {
        return ma;
    }
    public String toString(){
        return ma+" "+ten+" "+dv+" "+mua+" "+ban+" "+ln;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DSMH> list = new ArrayList<DSMH>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            DSMH x=new DSMH(i,sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
            list.add(x);
        }
        Collections.sort(list, new Comparator<DSMH>(){
            public int compare(DSMH o1, DSMH o2) {
                if(o1.getLn()==o2.getLn()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                else return o2.getLn()-o1.getLn();
            }
        });
        for(DSMH x:list){
            System.out.println(x);
        }
    }
}
