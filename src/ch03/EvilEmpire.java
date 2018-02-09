package ch03;
import java.net.*;

public class EvilEmpire {

    public static void main(String[] args) throws Exception{
        try{
            Socket s = new Socket("11.111.111.111",80);
            System.out.println("Am connected");
        }catch (SecurityException e){
            System.out.println("SecurityException: Could Not Connect..");
        }
    }
}
