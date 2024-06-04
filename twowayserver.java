import java.io.*;
import java.net.*;
public class twowayserver {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dou=new DataOutputStream(s.getOutputStream());
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";

            while(!str.equals("Exit"))
            {
                str=din.readUTF();
                System.out.println("Client"+str);
                str2=rd.readLine();
                dou.writeUTF(str2);
                dou.flush();
               
            }
            din.close();
            dou.close(); 
            s.close();
            ss.close();
            
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
