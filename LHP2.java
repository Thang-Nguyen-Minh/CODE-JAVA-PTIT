package ARRAYOBJECT;
import java.util.*;
public class LHP2 {
    private String ma,mon,nhom,gv;
    LHP2(String ma,String mon,String nhom,String gv){
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
    public String getGv() {
        return gv;
    }
    public String toString(){
        return ma+" "+mon+" "+nhom;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<LHP2> a=new ArrayList<>();
        while(t-->0){
            a.add(new LHP2(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int t1=Integer.parseInt(sc.nextLine());
        while(t1-->0){
            String s=sc.nextLine();
            ArrayList<LHP2> dsMon = new ArrayList<>();
            // Lọc các lớp học phần theo mã môn học
            for (LHP2 lhp : a) {
                if (lhp.getGv().equals(s)) {
                    dsMon.add(lhp);
                }
            }
            // Sắp xếp danh sách theo thứ tự nhóm
            Collections.sort(dsMon, new Comparator<LHP2>() {
                @Override
                public int compare(LHP2 o1, LHP2 o2) {
                    if (o1.getMa().equals(o2.getMa())) {
                        return o1.getNhom().compareTo(o2.getNhom());
                    }
                    return o1.getMa().compareTo(o2.getMa());
                }
            });
            // Hiển thị kết quả
            if (!dsMon.isEmpty()) {
                //dsMon.get(0) : trả về đối tượng đầu tiên trong ArrayList dsMon
                //Ở đây là "THCS2D20 Tin hoc co so 2 - D20 01 Nguyen Binh An"
                System.out.println("Danh sach cho giang vien " + dsMon.get(0).getGv() + ":");
                for (LHP2 lhp : dsMon) {
                    System.out.println(lhp);
                }
            }
        }
    }
}
