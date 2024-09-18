package ARRAYOBJECT;
import java.util.*;
public class BTNGV {
    private String ma,ten,cv;
    private long lcb,pc,hs,tn;
    BTNGV(String ma,String ten,long lcb){
        this.ma=ma;
        this.ten=ten;
        this.lcb=lcb;
        cv=ma.substring(0,2);
        hs=Long.parseLong(ma.substring(2));
        if(cv.equals("HT")) pc=2000000;
        else if(cv.equals("HP")) pc=900000;
        else pc=500000;
        tn=lcb*hs+pc;
    }
    public String getCv(){
        return cv;
    }
    public String toString(){
        return ma+" "+ten+" "+hs+" "+pc+" "+tn;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<BTNGV> list=new ArrayList<>();
        // Sử dụng Map để kiểm soát số lượng HT và HP
        Map<String, Integer> mp = new HashMap<>();
        mp.put("HT", 0);  // Khởi tạo số lượng HT = 0
        mp.put("HP", 0);  // Khởi tạo số lượng HP = 0
        // Đọc dữ liệu đầu vào
        while (t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long lcb = Long.parseLong(sc.nextLine());
            BTNGV gv = new BTNGV(ma, ten, lcb);
            String cv = gv.getCv();  // Lấy chức vụ của giáo viên
            // Kiểm tra số lượng HT và HP trong Map
            if (cv.equals("HT")) {
                if (mp.get("HT") < 1) {
                    list.add(gv);  // Chỉ thêm khi chưa đủ 1 HT
                    mp.put("HT", mp.get("HT") + 1);  // Tăng số lượng HT trong Map
                }
            }
            else if (cv.equals("HP")) {
                if (mp.get("HP") < 2) {
                    list.add(gv);  // Chỉ thêm khi chưa đủ 2 HP
                    mp.put("HP", mp.get("HP") + 1);  // Tăng số lượng HP trong Map
                }
            }
            else {
                list.add(gv);  // GV không bị giới hạn
            }
        }
        // In ra danh sách giáo viên
        for (BTNGV v : list) {
            System.out.println(v);
        }
    }
}