package ARRAYOBJECT;

import java.util.*;

public class BKNK {
    private String ma, ten;
    private long sl, gia, ck, tong;
    private double ptck;

    BKNK(int ma, String ten, long sl, long gia) {
        this.ma = String.format("%02d", ma);
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;

        if (sl > 10) ptck = 0.05;
        else if (sl >= 8) ptck = 0.02;
        else if (sl >= 5) ptck = 0.01;
        else ptck = 0;
        ck = (long) (gia * sl * ptck);
        tong = gia * sl - ck;
    }
    //Bước 1: Tên "Nguyen Van A" được chia thành ["Nguyen", "Van", "A"].
    //Bước 2: Tạo mã ban đầu "NV".
    //Bước 3: Kiểm tra mp, không có "NV", giá trị mặc định là 0. Tăng lên 1.
    //Bước 4: Cập nhật mp với "NV": 1.
    //Bước 5: Tạo mã cho sinh viên là "NV01".
    //Bước 1: Tên "Nguyen Van B" được chia thành ["Nguyen", "Van", "B"].
    //Bước 2: Mã ban đầu vẫn là "NV".
    //Bước 3: Kiểm tra mp, thấy "NV": 1, tăng lên 2.
    //Bước 4: Cập nhật mp với "NV": 2.
    //Bước 5: Mã cho sinh viên là "NV02".
    public void chuanHoa(Map<String, Integer> mp) {
        String[] s = this.ten.split("\\s+");
        String a = Character.toUpperCase(s[0].charAt(0)) + "" + Character.toUpperCase(s[1].charAt(0));
        //Kiểm tra xem trong Map<String, Integer> mp có bao nhiêu đối tượng đã được tạo với mã bắt đầu bằng "NV" (nếu tồn tại).
        //Nếu chưa tồn tại, trả về giá trị mặc định là 0, sau đó tăng giá trị này lên 1.
        //Gọi là nếu a có trong map thì trả về số lần xuất hiện của a, k thì trả về 0
        int count = mp.getOrDefault(a, 0) + 1;//tạo bắt đầu từ NV01
        //Map sẽ lưu giá trị "NV": 3 nếu count là 3.
        //Phương thức này chèn một cặp key-value vào Map.
        // Nếu key đã tồn tại, giá trị cũ sẽ bị thay thế bằng giá trị mới.
        mp.put(a, count);//thêm a và số lần xuất hiện của a trong map,giống insert trong C++
        this.ma = a + String.format("%02d", count);
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ck + " " + tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BKNK> bk = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long gia = sc.nextLong();
            sc.nextLine();
            BKNK x = new BKNK(i + 1, ten, sl, gia);
            x.chuanHoa(mp);
            bk.add(x);
        }

        for (BKNK x : bk) {
            System.out.println(x);
        }
    }
}
