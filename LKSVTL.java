package ARRAYOBJECT;
import java.util.*;
public class LKSVTL {
    private String ma,ten,lop,mail;
    LKSVTL(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public String getMa() {
        return ma;
    }
    public String getLop() {
        return lop;
    }
    public String toString(){
        return ma+" "+ten+" "+lop+" "+mail;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<LKSVTL> a= new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            LKSVTL x=new LKSVTL(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        int q= sc.nextInt();
        sc.nextLine();
        while (q-->0){
            String y=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+y+":");
            for(LKSVTL x:a){
                if(x.getLop().equals(y)){
                    System.out.println(x);
                }
            }
        }

    }
}
