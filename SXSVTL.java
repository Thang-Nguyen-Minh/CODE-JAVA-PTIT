package ARRAYOBJECT;
import java.util.*;
public class SXSVTL {
    private String ma,ten,lop,mail;
    SXSVTL(String ma, String ten, String lop, String mail) {
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
        ArrayList<SXSVTL> a= new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            SXSVTL x=new SXSVTL(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        Collections.sort(a,new Comparator<SXSVTL>() {
            public int compare(SXSVTL o1, SXSVTL o2) {
                if(o1.getLop().compareTo(o2.getLop())==0){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getLop().compareTo(o2.getLop());
            }
        });
        for(SXSVTL x:a){
            System.out.println(x);
        }
    }
}
