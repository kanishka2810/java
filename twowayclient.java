import java.io.*;
import java.net.*;
public class twowayclient {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("127.0.0.1",9806);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dou=new DataOutputStream(s.getOutputStream());
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";

            while(!str.equals("Exit"))
            {
                str=rd.readLine();
                dou.writeUTF(str);
                dou.flush();
		str2=din.readUTF();
                System.out.println("Server:"+str2);
                
            }
            din.close();
            dou.close(); 
            s.close();
            s.close();

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}