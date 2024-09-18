package ARRAYOBJECT;
import java.util.*;
public class DSDNNSVTT2 {
    private String ma,ten;
    private int sv;
    DSDNNSVTT2(String ma, String ten, int sv) {
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
        ArrayList<DSDNNSVTT2> hsvt = new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            DSDNNSVTT2 x=new DSDNNSVTT2(sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
            hsvt.add(x);
        }
        Collections.sort(hsvt, new Comparator<DSDNNSVTT2>() {
            public int compare(DSDNNSVTT2 a, DSDNNSVTT2 b) {
                if(a.getSv()==b.getSv()){
                    return a.getMa().compareTo(b.getMa());
                }
                return b.getSv()-a.getSv();
            }
        });
        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DSDNNSVTT2 x:hsvt){
                // Kiểm tra nếu số sinh viên trong đoạn [a, b]
                if (x.getSv() >= a && x.getSv() <= b) {
                    System.out.println(x);
                }
            }
        }
    }
}
