package ch03;
import java.net.*;

public class EvilEmpire {
    static int i=99;
    static double d=5.43;
    static double pi= 3.14_159_265_358;

    public static void main(String[] args) throws Exception{
        try{
//            Socket s = new Socket("35.161.100.111",80);
            System.out.println(i);
            System.out.println(d);
            System.out.println(pi);
            System.out.println("Am connected");
        }catch (SecurityException e){
            System.out.println("SecurityException: Could Not Connect..");
        }
    }
}
