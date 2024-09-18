package ARRAYOBJECT;
import java.util.*;

public class TL {
    private String phongban, pb;
    private String ma, ten;
    private long lcb, nc, hsn, tong;
    private static Map<String, String> phongBanMap = new HashMap<>();

    TL(String ma, String ten, long lcb, long nc) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        this.nc = nc;

        // Xử lý hệ số nhân dựa trên ký tự đầu tiên và hai số tiếp theo của mã
        String s = String.valueOf(ma.charAt(0));
        int x = Integer.parseInt(ma.substring(1, 3));
        if (s.equals("A")) {
            if (x >= 1 && x <= 3) hsn = 10;
            else if (x <= 8) hsn = 12;
            else if (x <= 15) hsn = 14;
            else hsn = 20;
        } else if (s.equals("B")) {
            if (x >= 1 && x <= 3) hsn = 10;
            else if (x <= 8) hsn = 11;
            else if (x <= 15) hsn = 13;
            else hsn = 16;
        } else if (s.equals("C")) {
            if (x >= 1 && x <= 3) hsn = 9;
            else if (x <= 8) hsn = 10;
            else if (x <= 15) hsn = 12;
            else hsn = 14;
        } else {
            if (x >= 1 && x <= 3) hsn = 8;
            else if (x <= 8) hsn = 9;
            else if (x <= 15) hsn = 11;
            else hsn = 13;
        }

        // Tính tổng lương
        tong = lcb * nc * hsn*1000;

        // Xác định tên phòng ban từ mã phòng ban
        this.pb = phongBanMap.get(ma.substring(3));
    }

    public static void addPhongBan(String maPhongBan, String tenPhongBan) {
        phongBanMap.put(maPhongBan, tenPhongBan);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + this.pb + " " + tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng phòng ban và thêm vào map
        int t1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t1; i++) {
            String[] phongBanInfo = sc.nextLine().split(" ", 2);
//          Khi có tham số 2, chuỗi chỉ được chia tại vị trí khoảng trắng đầu tiên, tạo ra hai phần:
//            + Phần đầu tiên chứa nội dung trước khoảng trắng đầu tiên.
//            + Phần thứ hai chứa phần còn lại của chuỗi, bao gồm tất cả các ký tự sau khoảng trắng đầu tiên.
            TL.addPhongBan(phongBanInfo[0], phongBanInfo[1]);//HC,Hanh chinh
        }

        // Đọc số lượng nhân viên và thêm vào danh sách
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<TL> tl1 = new ArrayList<>();
        for (int i = 0; i < t2; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long lcb = sc.nextLong();
            long nc = sc.nextLong();
            sc.nextLine();  // Đọc bỏ dòng thừa sau số ngày công
            tl1.add(new TL(ma, ten, lcb, nc));
        }
        // In kết quả
        for (TL t : tl1) {
            System.out.println(t);
        }
    }
}
