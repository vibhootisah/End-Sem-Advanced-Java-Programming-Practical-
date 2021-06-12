import java.io.*;
import java.net.*;
public class Client{
    public static void main(String args[])throws Exception{

        Socket s = new Socket("localhost",8080);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr="",outStr="";
        while(!outStr.equals("bye")){
            outStr = br.readLine();
            dout.writeUTF(outStr);
            dout.flush();
            inStr = din.readUTF();
            System.out.println("Server Says: "+inStr);
        }
        din.close();
        br.close();
        s.close();
    }
}