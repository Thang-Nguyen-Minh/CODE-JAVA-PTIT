package ARRAYOBJECT;
import java.util.*;

public class BXH {
    private String sv;
    private long c, t;

    BXH(String sv, long c, long t) {
        this.sv = sv;
        this.c = c;
        this.t = t;
    }

    public String getSv() {
        return sv;
    }

    public long getC() {
        return c;
    }

    public long getT() {
        return t;
    }

    public static String ChuanHoa(String s){
        String[] a=s.split("\\s+");
        String s1= "";
        for(String x:a){
            if(!x.isEmpty()){
                s1+=String.valueOf(x.substring(0,1)).toUpperCase()+String.valueOf(x.substring(1)).toLowerCase();
                s1+=" ";
            }
        }
        return s1.trim();
    }

    @Override
    public String toString() {
        return sv + " " + c + " " + t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<BXH> bxh = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String a = sc.nextLine();
            long c = sc.nextLong();
            long n = sc.nextLong();
            sc.nextLine();
            a = ChuanHoa(a);
            BXH z = new BXH(a, c, n);
            bxh.add(z);
        }
        Collections.sort(bxh, new Comparator<BXH>(){
            public int compare(BXH o1, BXH o2) {
                if(o1.getC()==o2.getC() && o1.getT()==o2.getT()){
                    return o1.getSv().compareTo(o2.getSv());
                }
                else if(o1.getC()==o2.getC()){
                    return Long.compare(o1.getT(),o2.getT());
                }
                return Long.compare(o2.getC(),o1.getC());
            }
        });
        /*
        Collections.sort(bxh, new Comparator<BXH>() {
            @Override
            public int compare(BXH o1, BXH o2) {
                if (o1.getC() == o2.getC()) {
                    if (o1.getT() == o2.getT()) {
                        return o1.getSv().compareTo(o2.getSv());
                    }
                    return Long.compare(o1.getT(), o2.getT());
                }
                return Long.compare(o2.getC(), o1.getC());
            }
        });
        */
        for (BXH b : bxh) {
            System.out.println(b);
        }
    }
}
