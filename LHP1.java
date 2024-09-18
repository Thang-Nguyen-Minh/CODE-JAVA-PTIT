package ARRAYOBJECT;
import java.util.*;
public class LHP1 {
    private String ma,mon,nhom,gv;
    LHP1(String ma,String mon,String nhom,String gv){
        this.ma=ma;
        this.mon=mon;
        this.nhom=nhom;
        this.gv=gv;
    }
    public String getMa() {
        return ma;
    }
    public String getMon() {
        return mon;
    }
    public String getNhom() {
        return nhom;
    }
    public String toString(){
        return nhom+" "+gv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<LHP1> a=new ArrayList<>();
        while(t-->0){
            a.add(new LHP1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int t1=sc.nextInt();
        while(t1-->0){
            String s=sc.next();
            ArrayList<LHP1> dsMon = new ArrayList<>();
            // Lọc các lớp học phần theo mã môn học
            for (LHP1 lhp : a) {
                if (lhp.getMa().equals(s)) {
                    dsMon.add(lhp);
                }
            }
            // Sắp xếp danh sách theo thứ tự nhóm
            Collections.sort(dsMon, new Comparator<LHP1>() {
                @Override
                public int compare(LHP1 o1, LHP1 o2) {
                    return o1.getNhom().compareTo(o2.getNhom());
                }
            });
            // Hiển thị kết quả
            if (!dsMon.isEmpty()) {
                //dsMon.get(0) : trả về đối tượng đầu tiên trong ArrayList dsMon
                //Ở đây là "THCS2D20 Tin hoc co so 2 - D20 01 Nguyen Binh An"
                System.out.println("Danh sach nhom lop mon " + dsMon.get(0).getMon() + ":");
                for (LHP1 lhp : dsMon) {
                    System.out.println(lhp);
                }
            }
        }
    }
}
