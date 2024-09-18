/*
Trong Java, khi bạn tạo một ArrayList chứa các đối tượng (CLBBD1)
bản thân ArrayList chỉ lưu trữ các tham chiếu đến các đối tượng.
Nghĩa là, dù bạn không thêm lại giá trị tran và doanhthu vào ArrayList
bạn vẫn có thể cập nhật giá trị của những thuộc tính này thông qua các phương thức của lớp CLBBD1.
Cụ thể:
Khi bạn gọi phương thức nhap(String tran, long cdv) cho mỗi đối tượng trong ArrayList,
bạn đã thay đổi giá trị của các thuộc tính tran và doanhthu của đối tượng đó.
Sau khi gọi nhap, những thuộc tính này được cập nhật ngay bên trong đối tượng mà ArrayList đang giữ tham chiếu tới.
Do đó, khi bạn in đối tượng ra bằng phương thức toString(),
nó sẽ hiển thị các giá trị mới đã được cập nhật (bao gồm cả tran và doanhthu).
 */
package ARRAYOBJECT;
import java.util.*;
public class CLBBD1 {
    private String ma,ten;
    private long gia;
    private String tran;
    private long cdv,doanhthu;
    CLBBD1(String ma, String ten, long gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    public void nhap(String tran,long cdv){
        this.tran = tran;
        this.cdv = cdv;
        this.doanhthu=gia*cdv;
    }
    public long getDoanhthu() {
        return doanhthu;
    }
    public String toString(){
        return tran+" "+ten+" "+doanhthu;
    }
    /*
    ArrayList<CLBBD1> bda = new ArrayList<>();
    CLBBD1 club = new CLBBD1("001", "Club A", 1000);
    bda.add(club); // Thêm đối tượng vào ArrayList

    club.nhap("Tran 1", 500); // Cập nhật tran và cdv
    // Lúc này, đối tượng 'club' trong ArrayList đã được cập nhật với tran và doanhthu

    for (CLBBD1 b : bda) {
        System.out.println(b); // Sẽ in ra tran, ten, doanhthu đã cập nhật
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Map<String,CLBBD1> mp=new HashMap<>();
        ArrayList<CLBBD1> bda=new ArrayList<>();
        while(t-->0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine());
            mp.put(ma,new CLBBD1(ma, ten, gia));
        }
        int t1=Integer.parseInt(sc.nextLine());
        while(t1-->0){
            String s=sc.next();
            long cdv=sc.nextLong();
            String s2=s.substring(1,3);
            if(mp.containsKey(s2)){
                CLBBD1 b=mp.get(s2);
                //maCLB = "AC" (ký tự thứ 2 và 3 của mã trận đấu).
                //Câu lệnh CLBBD1 clb = clbMap.get(maCLB); sẽ trả về đối tượng CLBBD1("AC", "AC Milan", 12)
                b.nhap(s,cdv);
                bda.add(b);
            }
        }
        bda.sort(Comparator.comparingLong(CLBBD1::getDoanhthu).reversed());
        for(CLBBD1 b:bda){
            System.out.println(b);
        }
    }
}
