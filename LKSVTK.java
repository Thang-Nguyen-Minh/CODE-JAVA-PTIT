package ARRAYOBJECT;
import java.util.*;
//Đề bảo theo mã nhưng lấy theo lớp ms AC ảo thật đấy
public class LKSVTK {
    private String ma,ten,lop,mail;
    LKSVTK(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public String getLop() {
        return lop.substring(1,3);
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<LKSVTK> a= new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            LKSVTK x=new LKSVTK(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        int q= sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String y=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+y+":");
            for(LKSVTK x:a){
                if(x.getLop().equals(y.substring(2))){
                    System.out.println(x);
                }
            }
        }

    }
}
