package clip18;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class TcpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("["+ LocalTime.now()+"] 서버가 준비되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        while(true) {
            try {
                System.out.println("--------------------------------------------");
                System.out.println("["+ LocalTime.now()+"] 연결요청을 기다립니다.");
                Socket socket = serverSocket.accept();
                System.out.println("["+ LocalTime.now()+"] 연결이 되었습니다.");

                // 데이터 받기(inputStream)
                InputStream inputStream = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String inputString = bufferedReader.readLine();
                System.out.println("message from clinet : "+inputString);

                // 데이터 보내기(outputStream)
                OutputStream outputStream = socket.getOutputStream();

                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("World");


                System.out.println("[" + LocalTime.now()+"]"+" 데이터를 전송했습니다. ");
                dataOutputStream.close();
                socket.close();
                System.out.println("--------------------------------------------");

            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }


    }
}
