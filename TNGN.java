package ARRAYOBJECT;
import java.util.*;
import java.io.*;
public class TNGN implements Comparable<TNGN> {
    private String ten,ns;
    TNGN(String ten, String ns) {
        this.ten = ten;
        this.ns = ns;
    }
    public String getNs() {
        return ns;
    }
    public int compareTo(TNGN o) {
        String[] a1=this.ns.split("/");
        String[] a2=o.getNs().split("/");
        if(a1[2].equals(a2[2])){
            if(a1[1].equals(a2[1])){
                return a2[0].compareTo(a1[0]);
            }
            return a2[1].compareTo(a1[1]);
        }
        return a2[2].compareTo(a1[2]);
    }
    public String getTen(){
        return ten;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TNGN> tn=new ArrayList<>();
        while(t-->0){
            tn.add(new TNGN(sc.next(),sc.next()));
        }
        Collections.sort(tn);
        System.out.println(tn.get(0).getTen());
        System.out.println(tn.get(tn.size()-1).getTen());
    }
}
