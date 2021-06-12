import java.io.*;
import java.net.*;
public class Server {
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        System.out.println("Connection Established");
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr="",outStr="";
        while(!outStr.equals("bye")){
            inStr = din.readUTF();
            System.out.println("Client Says: "+inStr);
            outStr = br.readLine();
            dout.writeUTF(outStr);
            dout.flush();
        }
        din.close();
        ss.close();
        s.close();
        br.close();
    }
}
