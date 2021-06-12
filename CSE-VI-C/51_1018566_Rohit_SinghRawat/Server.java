import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// Solution to Question 2 of Advanced Java Practical
// Name - Rohit Singh Rawat
// Roll no - 1018566
// Class Roll no - 51

public class Server {
    public static void main(String[] args) throws Exception {

        // started Server at port 8082
        ServerSocket serverSocket = new ServerSocket(8082);
        System.out.println("Server has started. Waiting for Clients to connect...");
        Socket server = serverSocket.accept();

        // Created Input and Output Streams
        DataInputStream inputStream = new DataInputStream(server.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String receivedMessage = "";
        String sentMessage;

        // started chatting until stay safe is input
        while (!receivedMessage.equals("stay safe")) {
            receivedMessage = inputStream.readUTF();
            System.out.println("Client: " + receivedMessage);
            System.out.print("You: ");
            sentMessage = reader.readLine();
            outputStream.writeUTF(sentMessage);
            outputStream.flush();
        }

        // closed socket and streams
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();
    }
}
