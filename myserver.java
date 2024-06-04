import java.io.*;
import java.net.*;
public class myserver {
    public static void main(String[] args) {
        try
        {
        //ServerSocket ss=new ServerSocket();
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream din= new DataInputStream(s.getInputStream());
        String str=din.readUTF();
        System.out.println("Server side"+str);
        ss.close();
        s.close();
        din.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }    
}
