import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

// Solution to Question 2 of Advanced Java Practical
// Name - Rohit Singh Rawat
// Roll no - 1018566
// Class Roll no - 51

public class Client {
    public static void main(String[] args) throws Exception {

        // created socket object at port 8082
        Socket server = new Socket("localhost", 8082);
        System.out.println("Connected to Server");

        // created input and output streams
        DataInputStream inputStream = new DataInputStream(server.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentMessage = "";
        String receivedMessage;

        // started chatting until stay safe is input
        while (!sentMessage.equals("stay safe")) {
            System.out.print("You: ");
            sentMessage = br.readLine();
            outputStream.writeUTF(sentMessage);
            outputStream.flush();
            receivedMessage = inputStream.readUTF();
            System.out.println("Server: " + receivedMessage);
        }

        // closed streams and socket
        inputStream.close();
        server.close();
    }
}
