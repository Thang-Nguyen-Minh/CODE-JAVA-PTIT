package ARRAYOBJECT;
import java.util.*;
public class SXTMSV {
    private String ma,ten,lop,mail;
    SXTMSV(String ma, String ten, String lop, String mail) {
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
        ArrayList<SXTMSV> a= new ArrayList<>();
        while (sc.hasNextLine()) {
            String id, name, lop, email;
            id = sc.nextLine();
            if (id.isEmpty()) {
                break;
            }
            name = sc.nextLine();
            lop = sc.nextLine();
            email = sc.nextLine();
            a.add(new SXTMSV(id, name, lop, email));
        }
        Collections.sort(a,new Comparator<SXTMSV>() {
            public int compare(SXTMSV o1, SXTMSV o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(SXTMSV x:a){
            System.out.println(x);
        }
    }
}
