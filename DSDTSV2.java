package ARRAYOBJECT;

import java.util.ArrayList;
import java.util.Scanner;

public class DSDTSV2 {
    private String ma;
    private String ten;
    private String lop;
    private String ns;
    private double gpa;
    DSDTSV2(int ma,String ten, String lop, String ns, double gpa) {
        this.ma="B20DCCN"+String.format("%03d",ma);
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void ChuanHoaNs(){
        StringBuilder s=new StringBuilder(this.ns);
        if(s.charAt(1)=='/') s.insert(0,'0');
        if(s.charAt(4)=='/') s.insert(3,'0');
        this.ns=s.toString();
    }
    public void ChuanHoaTen() {
        // Tách chuỗi tên thành các từ và loại bỏ khoảng trắng dư ở đầu và cuối
        String[] words = this.ten.trim().split("\\s+");
        String s = "";
        // Xử lý từng từ
        for (String word : words) {
            if (!word.isEmpty()) {
                // Viết hoa ký tự đầu tiên, các ký tự còn lại viết thường
                s += Character.toUpperCase(word.charAt(0)); // Ký tự đầu tiên viết hoa
                s += word.substring(1).toLowerCase(); // Các ký tự còn lại viết thường
                s += " "; // Thêm khoảng trắng giữa các từ
            }
        }
        // Xóa khoảng trắng dư ở cuối chuỗi
        this.ten = s.trim();
    }

    public String toString(){
        return ma+" "+ten+" "+lop+" "+ns+" "+String.format("%.2f",gpa);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<DSDTSV2> list=new ArrayList<DSDTSV2>();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            DSDTSV2 x=new DSDTSV2(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            x.ChuanHoaNs();
            x.ChuanHoaTen();
            list.add(x);
        }
        for(DSDTSV2 x:list){
            System.out.println(x);
        }
    }
}
