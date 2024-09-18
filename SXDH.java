package ARRAYOBJECT;
import java.util.*;
import static java.lang.Math.*;
public class SXDH {
    private String ten,ma;
    private long gia,sl,tt,sale;
    SXDH(String ten,String ma,long gia,long sl){
        this.ten=ten;
        this.ma=ma;
        this.gia=gia;
        this.sl=sl;
        String s=String.valueOf(ma.charAt(ma.length()-1));
        if(s.equals("1")) sale=(long)ceil(0.5*gia*sl);
        else sale=(long)ceil(0.3*gia*sl);
        tt= (long) (gia*sl-sale);
    }
    public String getMa() {
        return String.valueOf(ma.substring(1,4));
    }
    public int getMa2(){
        return Integer.parseInt(ma.substring(1,4));
    }
    public String toString() {
        return ten+" "+ma+" "+getMa()+" "+sale+" "+tt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<SXDH> dh=new ArrayList<>();
        while(t-->0) {
            SXDH x=new SXDH(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            dh.add(x);
        }
        Collections.sort(dh,new Comparator<SXDH>() {
            public int compare(SXDH o1, SXDH o2) {
                return o1.getMa2()-o2.getMa2();
            }
        });
        for(SXDH x:dh) {
            System.out.println(x);
        }
    }
}
