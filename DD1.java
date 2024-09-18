package ARRAYOBJECT;
import java.util.*;

public class DD1 {
    private String ma, ten, lop;
    private int diemcc;
    private String dd;
    // Constructor
    DD1(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    // Phương thức nhập thông tin điểm chuyên cần
    public void nhap(String dd) {
        this.dd = dd;
        int cnt1 = 0, cnt2 = 0; // cnt1: số buổi đến muộn, cnt2: số buổi vắng
        for (char c : dd.toCharArray()) {
            if (c == 'm') ++cnt1;
            else if (c == 'v') ++cnt2;
        }
        this.diemcc = 10 - cnt1 - cnt2 * 2;
        if (diemcc < 0) {
            this.diemcc = 0; // điểm không được âm
        }
    }
    // Trả về điểm chuyên cần kèm theo ghi chú nếu cần
    public String Diemcc() {
        if (diemcc == 0) return "0 KDDK";
        else return diemcc + "";
    }
    public String getLop(){
        return lop;
    }
    // Phương thức chuyển đối tượng thành chuỗi
    public String toString() {
        return ma + " " + ten + " " + lop + " " + Diemcc();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // số lượng sinh viên
        ArrayList<DD1> dd1 = new ArrayList<>();
        Map<String, DD1> mp = new HashMap<>();
        // Nhập thông tin sinh viên
        for (int i = 0; i < t; i++) {
            String ma = sc.nextLine();    // mã sinh viên
            String ten = sc.nextLine();   // tên sinh viên
            String lop = sc.nextLine();   // lớp
            DD1 d = new DD1(ma, ten, lop);
            mp.put(ma, d);  // Thêm sinh viên vào map để tra cứu
            dd1.add(d);     // Thêm sinh viên vào danh sách để in theo thứ tự ban đầu
        }
        // Nhập thông tin điểm danh
        for (int i = 0; i < t; i++) {
            String ma2 = sc.next();       // mã sinh viên điểm danh
            String dd = sc.next();        // chuỗi điểm danh
            sc.nextLine();                // Đọc dòng trống còn lại
            // Nếu mã sinh viên đã có trong danh sách, cập nhật điểm danh
            if (mp.containsKey(ma2)) {
                DD1 d = mp.get(ma2);
                d.nhap(dd);
            }
        }
        String s=sc.next();
        // Xuất thông tin sinh viên
        for (DD1 d : dd1) {
            if(d.getLop().equals(s)) System.out.println(d);
        }
    }
}
