package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
//Năm để tính tuổi: 2021
public class XHVDV1 {
    private String ten,ma,ns,xp,goal;
    private int x;
    private int ut;
    private String thucte,tt;
    private int xh;
    XHVDV1(int ma,String ten,String ns,String xp,String goal){
        this.ma="VDV"+String.format("%02d",ma);
        this.ten=ten;
        this.ns=ns;
        this.xp=xp;
        this.goal=goal;
        x=Integer.parseInt(ns.substring(6));
        int y=2021-x;
        if(y<18) ut=0;
        else if(y<25) ut=1;
        else if(y<32) ut=2;
        else ut=3;
    }
    public static int Second(String s){
        String[] a=s.split(":");
        int hour=Integer.parseInt(a[0]);
        int minute=Integer.parseInt(a[1]);
        int second=Integer.parseInt(a[2]);
        int tong=hour*3600+minute*60+second;
        return tong;
    }
    public static String ChuanHoa(int totalSeconds){
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    public static String CH(String s1,String s2){
        int x1=Second(s1),x2=Second(s2);
        int a=x2-x1;
        return ChuanHoa(a);
    }
    public void getThucte(){
        this.thucte=CH(xp,goal);
    }
    public String getTt() {
        int totalSeconds = Second(this.thucte) - ut;
        if (totalSeconds < 0) totalSeconds = 0;
        this.tt = ChuanHoa(totalSeconds);
        return this.tt;
    }
    // Get priority time in hh:mm:ss format
    public String getUt() {
        return ChuanHoa(ut);
    }
    public void setXh(int xh) {
        this.xh = xh;
    }
    public int getXh() {
        return this.xh;
    }
    public String getThucteString() {
        return this.thucte;
    }

    // Get athlete's info
    public String getInfo() {
        return this.ma + " " + this.ten + " " + this.getThucteString() + " " + this.getUt() + " " + this.getTt() + " " + this.getXh();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<XHVDV1> hvds=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String xp = sc.nextLine();
            String goal = sc.nextLine();
            XHVDV1 x = new XHVDV1(i + 1, ten, ns, xp, goal);
            x.getThucte();
            hvds.add(x);
        }
        hvds.sort(Comparator.comparing(XHVDV1::getTt));
        int rank = 1;
        for (int i = 0; i < hvds.size(); i++) {
            if (i > 0 && hvds.get(i).getTt().equals(hvds.get(i - 1).getTt())) {
                hvds.get(i).setXh(hvds.get(i - 1).getXh());
            } else {
                hvds.get(i).setXh(rank);
            }
            rank++;
        }
        //hvds.sort(Comparator.comparingInt(x -> Integer.parseInt(x.ma.substring(3))));
        for (XHVDV1 h : hvds) {
            System.out.println(h.getInfo());
        }
    }
}
